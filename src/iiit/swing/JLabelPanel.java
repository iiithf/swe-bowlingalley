package iiit.swing;

import java.awt.*;
import javax.swing.*;


public class JLabelPanel extends JPanel {
  public JLabel label;
  
  public JLabelPanel(String text) {
    super();
    super.setLayout(new FlowLayout());
    super.add(label = new JLabel(text));
  }
}