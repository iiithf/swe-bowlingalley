package main;


public class Record {
  private final String id;
  private final String date;
  private final int score;


  public Record(String id, String date, int score) {
    this.id = id;
    this.date = date;
    this.score = score;
  }
  
  
  public String id() {
    return id;
  }

  public String date() {
    return date;
  }

  public int score() {
    return score;
  }

  
  @Override
  public String toString() {
    return String.format("%-20s %-20s %d", id(), date(), score());
  }
  
  public StringBuilder stringify(StringBuilder out, String pad) {
    out.append(pad).append("[Score]\n");
    out.append(pad).append("id: ").append(id()).append('\n');
    out.append(pad).append("date: ").append(date()).append('\n');
    out.append(pad).append("score: ").append(score()).append('\n');
    return out;
  }
}
