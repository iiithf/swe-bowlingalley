package main;

import iiit.swing.JFrames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;


public class EndGameReport implements ActionListener, ListSelectionListener {
  private JFrame frame;
  private JButton printButton, finished;
  private JList memberList;
  private Vector myVector;
  private Vector retVal;
  private int result;
  private String selectedMember;

  
  public EndGameReport(String partyName, PartyAdapter party) {

    result = 0;
    retVal = new Vector();
    frame = new JFrame("End Game Report for " + partyName + "?");
    frame.getContentPane().setLayout(new BorderLayout());
    ((JPanel) frame.getContentPane()).setOpaque(false);

    JPanel colPanel = new JPanel();
    colPanel.setLayout(new GridLayout(1, 2));

    // Member Panel
    JPanel partyPanel = new JPanel();
    partyPanel.setLayout(new FlowLayout());
    partyPanel.setBorder(new TitledBorder("Party Members"));

    Vector myVector = new Vector();
    Iterator iter = (party.getMembers()).iterator();
    while (iter.hasNext()) {
      myVector.add(((Bowler) iter.next()).id);
    }
    memberList = new JList(myVector);
    memberList.setFixedCellWidth(120);
    memberList.setVisibleRowCount(5);
    memberList.addListSelectionListener(this);
    JScrollPane partyPane = new JScrollPane(memberList);
    //        partyPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    partyPanel.add(partyPane);

    partyPanel.add(memberList);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(2, 1));

    printButton = new JButton("Print Report");
    JPanel printButtonPanel = new JPanel();
    printButtonPanel.setLayout(new FlowLayout());
    printButton.addActionListener(this);
    printButtonPanel.add(printButton);

    finished = new JButton("Finished");
    JPanel finishedPanel = new JPanel();
    finishedPanel.setLayout(new FlowLayout());
    finished.addActionListener(this);
    finishedPanel.add(finished);

    buttonPanel.add(printButton);
    buttonPanel.add(finished);

    colPanel.add(partyPanel);
    colPanel.add(buttonPanel);

    frame.getContentPane().add("Center", colPanel);
    frame.pack();
    JFrames.screenCenter(frame);
    frame.show();

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource().equals(printButton)) {
      //Add selected to the vector.
      retVal.add(selectedMember);
    }
    if (e.getSource().equals(finished)) {
      frame.hide();
      result = 1;
    }

  }

  public void valueChanged(ListSelectionEvent e) {
    selectedMember
            = ((String) ((JList) e.getSource()).getSelectedValue());
  }

  public Vector getResult() {
    while (result == 0) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        System.err.println("Interrupted");
      }
    }
    return retVal;
  }

  public void destroy() {
    frame.hide();
  }
}
