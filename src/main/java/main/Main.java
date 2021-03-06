package main;
import iiit.swing.JFrames;
import java.sql.*;
import java.util.*;


public class Main extends Thread {
  private static PartyQueue partyQueue;
  private static List<Lane> lanes;
  private static ControlDesk controlDesk;
  
  
  public static void main(String[] args) throws Exception {
    int numLanes = 3;
    Connection db = Database.connection();
    BowlerData bowlerData = new BowlerDatabase(db);
    RecordData recordData = new RecordDatabase(db);
    partyQueue = new PartyQueue();
    lanes = new ArrayList<>();
    for (int i=0; i<numLanes; i++)
      lanes.add(new Lane2());
    controlDesk = new ControlDesk(bowlerData);
    JFrames.showCenter(controlDesk);
    controlDesk.update(partyQueue, lanes);
    controlDesk.events().on("partyAdd", (e, data) -> {
      partyQueue.add((Party)data);
      controlDesk.update(partyQueue, lanes);
    });
    controlDesk.events().on("close", (e, data) -> {
      System.exit(0);
    });
    controlDesk.events().on("roll0", (e, data) -> addRoll(lanes.get(0), (Roll)data));
    controlDesk.events().on("roll1", (e, data) -> addRoll(lanes.get(1), (Roll)data));
    controlDesk.events().on("roll2", (e, data) -> addRoll(lanes.get(2), (Roll)data));
    controlDesk.events().on("laneComplete", (e, data) -> {
      Lane lane = lanes.get((int)data);
      Party party = lane.party();
      lane.clear();
      if (!partyQueue.isEmpty()) {
        lane.assign(partyQueue.removeFirst());
        controlDesk.update(partyQueue, lanes);
      }
      if (party==null) return;
      EndDesk endDesk = new EndDesk(party, recordData);
      JFrames.showCenter(endDesk);
      endDesk.events().on("partyQueue", (_e, _data) -> partyQueue.addLast((Party)_data));
    });
    new Main().start();
  }
  
  @Override
  public void run() {
    for (;;) {
      for (Lane lane : lanes) {
        if ("paused".equals(lane.status())) continue;
        if (lane.complete()) {
          lane.sort(null);
          controlDesk.events().emit("laneComplete", lanes.indexOf(lane));
          continue;
        }
        Game game = lane.game();
        Bowler bowler = game.bowler();
        controlDesk.update(partyQueue, lanes);
        if (bowler.skill()==0) {
          controlDesk.events().emit("rollRequest"+lanes.indexOf(lane), null);
          continue;
        }
        Pinsetter pinsetter = lane.pinsetter();
        double skill = bowler.skill();
        addRoll(lane, new Roll(pinsetter, skill));
      }
      try { Thread.sleep(500); }
      catch (InterruptedException e) {}
    }
  }
  
  private static void addRoll(Lane lane, Roll roll) {
    lane.addRoll(roll);
    controlDesk.update(partyQueue, lanes);
    lane.update();
  }
}
