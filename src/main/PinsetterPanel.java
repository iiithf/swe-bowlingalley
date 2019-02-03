package main;
import java.awt.Color;
import javax.swing.*;


public class PinsetterPanel extends JPanel {
  private final Pinsetter pinsetter;
  private JButton[] pins;
  
  public PinsetterPanel(Pinsetter pinsetter) {
    initComponents();
    this.pinsetter = pinsetter;
    pins = new JButton[] {pin0, pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9};
  }
  
  public void update() {
    turnValue.setText(""+pinsetter.turn());
    standingValue.setText(""+pinsetter.standing());
    for(int i=0; i<pins.length; i++)
      pins[i].setBackground(pinsetter.pins()[i]? Color.GRAY : Color.GREEN);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel5 = new javax.swing.JLabel();
    pinsetterLabel = new javax.swing.JLabel();
    dataPanel = new javax.swing.JPanel();
    turnLabel = new javax.swing.JLabel();
    turnValue = new javax.swing.JLabel();
    standingLabel = new javax.swing.JLabel();
    standingValue = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    pin6 = new javax.swing.JButton();
    pin7 = new javax.swing.JButton();
    pin8 = new javax.swing.JButton();
    pin9 = new javax.swing.JButton();
    pin3 = new javax.swing.JButton();
    pin4 = new javax.swing.JButton();
    pin5 = new javax.swing.JButton();
    pin1 = new javax.swing.JButton();
    pin2 = new javax.swing.JButton();
    pin0 = new javax.swing.JButton();

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel5.setText("_");

    pinsetterLabel.setBackground(new java.awt.Color(204, 204, 204));
    pinsetterLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    pinsetterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pinsetterLabel.setText("Pinsetter");
    pinsetterLabel.setBorder(new javax.swing.border.MatteBorder(null));

    turnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    turnLabel.setText("Turn");

    turnValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    turnValue.setText("0");

    standingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    standingLabel.setText("Standing");

    standingValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    standingValue.setText("0");

    javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
    dataPanel.setLayout(dataPanelLayout);
    dataPanelLayout.setHorizontalGroup(
      dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(turnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(standingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(standingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
          .addComponent(turnValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    dataPanelLayout.setVerticalGroup(
      dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(dataPanelLayout.createSequentialGroup()
        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(turnLabel)
          .addComponent(turnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(standingLabel)
          .addComponent(standingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    standingValue.getAccessibleContext().setAccessibleDescription("");

    pin6.setText("7");

    pin7.setText("8");

    pin8.setText("9");

    pin9.setText("10");

    pin3.setText("4");

    pin4.setText("5");

    pin5.setText("6");

    pin1.setText("2");

    pin2.setText("3");

    pin0.setText("1");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(pin6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pin7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pin8)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pin9)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(48, 48, 48)
        .addComponent(pin1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pin2)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(pin3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pin4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pin5)
            .addGap(28, 28, 28))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(pin0)
            .addGap(69, 69, 69))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(pin6)
          .addComponent(pin7)
          .addComponent(pin8)
          .addComponent(pin9))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(pin5)
          .addComponent(pin4)
          .addComponent(pin3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(pin1)
          .addComponent(pin2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(pin0)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(pinsetterLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(pinsetterLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    dataPanel.getAccessibleContext().setAccessibleName("Data");
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel dataPanel;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JButton pin0;
  private javax.swing.JButton pin1;
  private javax.swing.JButton pin2;
  private javax.swing.JButton pin3;
  private javax.swing.JButton pin4;
  private javax.swing.JButton pin5;
  private javax.swing.JButton pin6;
  private javax.swing.JButton pin7;
  private javax.swing.JButton pin8;
  private javax.swing.JButton pin9;
  private javax.swing.JLabel pinsetterLabel;
  private javax.swing.JLabel standingLabel;
  private javax.swing.JLabel standingValue;
  private javax.swing.JLabel turnLabel;
  private javax.swing.JLabel turnValue;
  // End of variables declaration//GEN-END:variables
}
