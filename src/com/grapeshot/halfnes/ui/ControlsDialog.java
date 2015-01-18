/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OptionsDialog.java
 *
 * Created on Jan 16, 2011, 4:21:43 PM
 */
package com.grapeshot.halfnes.ui;

import com.grapeshot.halfnes.PrefsSingleton;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 *
 * @author Andrew
 */
public class ControlsDialog extends javax.swing.JDialog {

    private int[][] keys;
    private boolean okClicked = false;

    /**
     * Creates new form ControlsDialog
     */
    public ControlsDialog(java.awt.Frame parent) {
        super(parent, true);
        Preferences prefs = PrefsSingleton.get();
        int[][] keys = {{prefs.getInt("keyUp1", KeyEvent.VK_UP),
                prefs.getInt("keyDown1", KeyEvent.VK_DOWN),
                prefs.getInt("keyLeft1", KeyEvent.VK_LEFT),
                prefs.getInt("keyRight1", KeyEvent.VK_RIGHT),
                prefs.getInt("keyA1", KeyEvent.VK_X),
                prefs.getInt("keyB1", KeyEvent.VK_Z),
                prefs.getInt("keySelect1", KeyEvent.VK_SHIFT),
                prefs.getInt("keyStart1", KeyEvent.VK_ENTER),}, {
                prefs.getInt("keyUp2", KeyEvent.VK_W),
                prefs.getInt("keyDown2", KeyEvent.VK_S),
                prefs.getInt("keyLeft2", KeyEvent.VK_A),
                prefs.getInt("keyRight2", KeyEvent.VK_D),
                prefs.getInt("keyA2", KeyEvent.VK_G),
                prefs.getInt("keyB2", KeyEvent.VK_F),
                prefs.getInt("keySelect2", KeyEvent.VK_R),
                prefs.getInt("keyStart2", KeyEvent.VK_T)}};
        this.keys = keys;
        initComponents();
        this.setTitle("HalfNES Controller Settings");
        //set all of the text boxes
        jField1Up.setText(KeyEvent.getKeyText(keys[0][0]));
        jField1Down.setText(KeyEvent.getKeyText(keys[0][1]));
        jField1Left.setText(KeyEvent.getKeyText(keys[0][2]));
        jField1Right.setText(KeyEvent.getKeyText(keys[0][3]));
        jField1A.setText(KeyEvent.getKeyText(keys[0][4]));
        jField1B.setText(KeyEvent.getKeyText(keys[0][5]));
        jField1Select.setText(KeyEvent.getKeyText(keys[0][6]));
        jField1Start.setText(KeyEvent.getKeyText(keys[0][7]));

        jField2Up.setText(KeyEvent.getKeyText(keys[1][0]));
        jField2Down.setText(KeyEvent.getKeyText(keys[1][1]));
        jField2Left.setText(KeyEvent.getKeyText(keys[1][2]));
        jField2Right.setText(KeyEvent.getKeyText(keys[1][3]));
        jField2A.setText(KeyEvent.getKeyText(keys[1][4]));
        jField2B.setText(KeyEvent.getKeyText(keys[1][5]));
        jField2Select.setText(KeyEvent.getKeyText(keys[1][6]));
        jField2Start.setText(KeyEvent.getKeyText(keys[1][7]));
        //set the controller text if we've detected some
        String ctrl1 = prefs.get("controller0", "");
        String ctrl2 = prefs.get("controller1", "");
        if (!ctrl1.isEmpty()) {
            jLabelCtrl1.setText(ctrl1);
        }
        if (!ctrl2.isEmpty()) {
            jLabelCtrl2.setText(ctrl2);
        }
        jButtonOK.setActionCommand("OK");
        jButtonCancel.setActionCommand("Cancel");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jField1Up = new javax.swing.JTextField();
        jField1Down = new javax.swing.JTextField();
        jField1Right = new javax.swing.JTextField();
        jField1Left = new javax.swing.JTextField();
        jField1Start = new javax.swing.JTextField();
        jField1Select = new javax.swing.JTextField();
        jField1B = new javax.swing.JTextField();
        jField1A = new javax.swing.JTextField();
        jField2Up = new javax.swing.JTextField();
        jField2Down = new javax.swing.JTextField();
        jField2Left = new javax.swing.JTextField();
        jField2Right = new javax.swing.JTextField();
        jField2A = new javax.swing.JTextField();
        jField2B = new javax.swing.JTextField();
        jField2Select = new javax.swing.JTextField();
        jField2Start = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCtrl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelCtrl2 = new javax.swing.JLabel();

        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("ControlsDialog"); // NOI18N
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Keybindings:"); // NOI18N

        jLabel4.setText("Controller 1"); // NOI18N

        jLabel5.setText("Controller 2"); // NOI18N

        jLabel6.setText("Up"); // NOI18N

        jLabel7.setText("Down"); // NOI18N

        jLabel8.setText("Left"); // NOI18N

        jLabel9.setText("Right"); // NOI18N

        jLabel10.setText("A"); // NOI18N

        jLabel11.setText("B"); // NOI18N

        jLabel12.setText("Select"); // NOI18N

        jLabel13.setText("Start"); // NOI18N

        jField1Up.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jField2StartActionPerformed(evt);
            }
        });
        jField1Up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1UpKeyReleased(evt);
            }
        });

        jField1Down.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jField2StartActionPerformed(evt);
            }
        });
        jField1Down.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1DownKeyReleased(evt);
            }
        });

        jField1Right.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jField2StartActionPerformed(evt);
            }
        });
        jField1Right.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1RightKeyReleased(evt);
            }
        });

        jField1Left.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jField2StartActionPerformed(evt);
            }
        });
        jField1Left.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1LeftKeyReleased(evt);
            }
        });

        jField1Start.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1StartKeyReleased(evt);
            }
        });

        jField1Select.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1Select.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1SelectKeyReleased(evt);
            }
        });

        jField1B.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1BKeyReleased(evt);
            }
        });

        jField1A.setMinimumSize(new java.awt.Dimension(120, 20));
        jField1A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField1AKeyReleased(evt);
            }
        });

        jField2Up.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2UpKeyReleased(evt);
            }
        });

        jField2Down.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Down.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2DownKeyReleased(evt);
            }
        });

        jField2Left.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Left.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2LeftKeyReleased(evt);
            }
        });

        jField2Right.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Right.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2RightKeyReleased(evt);
            }
        });

        jField2A.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2AKeyReleased(evt);
            }
        });

        jField2B.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2BKeyReleased(evt);
            }
        });

        jField2Select.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Select.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2SelectKeyReleased(evt);
            }
        });

        jField2Start.setMinimumSize(new java.awt.Dimension(120, 20));
        jField2Start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jField2StartKeyReleased(evt);
            }
        });

        jButtonCancel.setText("Cancel"); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK"); // NOI18N
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jLabel16.setText(" Click in text box and type a key to change that binding."); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Detected Game Controllers:");

        jLabelCtrl1.setText("No Player 1 controller connected");
        jLabelCtrl1.setEnabled(false);

        jButton1.setText("Set Buttons");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Set Buttons");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelCtrl2.setText("No Player 2 controller connected");
        jLabelCtrl2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jField1Right, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1Left, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1Start, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1Select, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1Up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField1Down, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jField2Select, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2B, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2Start, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2A, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2Right, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2Up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2Down, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jField2Left, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCancel))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCtrl1)
                                .addComponent(jLabelCtrl2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton1))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jField1A, jField1B, jField1Down, jField1Left, jField1Right, jField1Select, jField1Start, jField1Up, jField2A, jField2B, jField2Down, jField2Left, jField2Right, jField2Select, jField2Start, jField2Up});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jField2Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jField1Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jField1Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jField1Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jField1Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jField2Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jField1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jField2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jField2Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jField2Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jField1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jField2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jField1Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jField2Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jField1Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jField2Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCtrl1)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCtrl2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK)
                    .addComponent(jButtonCancel))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jField1A, jField1B, jField1Down, jField1Left, jField1Right, jField1Select, jField1Start, jField1Up, jField2A, jField2B, jField2Down, jField2Left, jField2Right, jField2Select, jField2Start, jField2Up});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        if ("Cancel".equals(evt.getActionCommand())) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        //    if ("OK".equals(evt.getActionCommand())) {
        //here we go... save everything and hide the window
        Preferences prefs = PrefsSingleton.get();
        prefs.putInt("keyUp1", keys[0][0]);
        prefs.putInt("keyDown1", keys[0][1]);
        prefs.putInt("keyLeft1", keys[0][2]);
        prefs.putInt("keyRight1", keys[0][3]);
        prefs.putInt("keyA1", keys[0][4]);
        prefs.putInt("keyB1", keys[0][5]);
        prefs.putInt("keySelect1", keys[0][6]);
        prefs.putInt("keyStart1", keys[0][7]);
        prefs.putInt("keyUp2", keys[1][0]);
        prefs.putInt("keyDown2", keys[1][1]);
        prefs.putInt("keyLeft2", keys[1][2]);
        prefs.putInt("keyRight2", keys[1][3]);
        prefs.putInt("keyA2", keys[1][4]);
        prefs.putInt("keyB2", keys[1][5]);
        prefs.putInt("keySelect2", keys[1][6]);
        prefs.putInt("keyStart2", keys[1][7]);
        try {
            prefs.flush();
        } catch (BackingStoreException ex) {
            Logger.getLogger(ControlsDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        okClicked = true;
        this.setVisible(false);
        //   }
    }//GEN-LAST:event_jButtonOKActionPerformed
    public boolean okClicked() {
        return okClicked;
    }
    private void jField1UpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1UpKeyReleased
        int k = evt.getKeyCode();
        jField1Up.setText(KeyEvent.getKeyText(k));
        keys[0][0] = k;
    }//GEN-LAST:event_jField1UpKeyReleased

    private void jField1DownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1DownKeyReleased
        int k = evt.getKeyCode();
        jField1Down.setText(KeyEvent.getKeyText(k));
        keys[0][1] = k;
    }//GEN-LAST:event_jField1DownKeyReleased

    private void jField1LeftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1LeftKeyReleased
        int k = evt.getKeyCode();
        jField1Left.setText(KeyEvent.getKeyText(k));
        keys[0][2] = k;
    }//GEN-LAST:event_jField1LeftKeyReleased

    private void jField1RightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1RightKeyReleased
        int k = evt.getKeyCode();
        jField1Right.setText(KeyEvent.getKeyText(k));
        keys[0][3] = k;
    }//GEN-LAST:event_jField1RightKeyReleased

    private void jField2StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jField2StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jField2StartActionPerformed

    private void jField1AKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1AKeyReleased
        int k = evt.getKeyCode();
        jField1A.setText(KeyEvent.getKeyText(k));
        keys[0][4] = k;
    }//GEN-LAST:event_jField1AKeyReleased

    private void jField1BKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1BKeyReleased
        int k = evt.getKeyCode();
        jField1B.setText(KeyEvent.getKeyText(k));
        keys[0][5] = k;
    }//GEN-LAST:event_jField1BKeyReleased

    private void jField1SelectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1SelectKeyReleased
        int k = evt.getKeyCode();
        jField1Select.setText(KeyEvent.getKeyText(k));
        keys[0][6] = k;
    }//GEN-LAST:event_jField1SelectKeyReleased

    private void jField1StartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField1StartKeyReleased
        int k = evt.getKeyCode();
        jField1Start.setText(KeyEvent.getKeyText(k));
        keys[0][7] = k;
    }//GEN-LAST:event_jField1StartKeyReleased

    private void jField2UpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2UpKeyReleased
        int k = evt.getKeyCode();
        jField2Up.setText(KeyEvent.getKeyText(k));
        keys[1][0] = k;
    }//GEN-LAST:event_jField2UpKeyReleased

    private void jField2StartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2StartKeyReleased
        int k = evt.getKeyCode();
        jField2Start.setText(KeyEvent.getKeyText(k));
        keys[1][7] = k;
    }//GEN-LAST:event_jField2StartKeyReleased

    private void jField2DownKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2DownKeyReleased
        int k = evt.getKeyCode();
        jField2Down.setText(KeyEvent.getKeyText(k));
        keys[1][1] = k;
    }//GEN-LAST:event_jField2DownKeyReleased

    private void jField2LeftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2LeftKeyReleased
        int k = evt.getKeyCode();
        jField2Left.setText(KeyEvent.getKeyText(k));
        keys[1][2] = k;
    }//GEN-LAST:event_jField2LeftKeyReleased

    private void jField2RightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2RightKeyReleased
        int k = evt.getKeyCode();
        jField2Right.setText(KeyEvent.getKeyText(k));
        keys[1][3] = k;
    }//GEN-LAST:event_jField2RightKeyReleased

    private void jField2AKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2AKeyReleased
        int k = evt.getKeyCode();
        jField2A.setText(KeyEvent.getKeyText(k));
        keys[1][4] = k;
    }//GEN-LAST:event_jField2AKeyReleased

    private void jField2BKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2BKeyReleased
        int k = evt.getKeyCode();
        jField2B.setText(KeyEvent.getKeyText(k));
        keys[1][5] = k;
    }//GEN-LAST:event_jField2BKeyReleased

    private void jField2SelectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jField2SelectKeyReleased
        int k = evt.getKeyCode();
        jField2Select.setText(KeyEvent.getKeyText(k));
        keys[1][6] = k;
    }//GEN-LAST:event_jField2SelectKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JTextField jField1A;
    private javax.swing.JTextField jField1B;
    private javax.swing.JTextField jField1Down;
    private javax.swing.JTextField jField1Left;
    private javax.swing.JTextField jField1Right;
    private javax.swing.JTextField jField1Select;
    private javax.swing.JTextField jField1Start;
    private javax.swing.JTextField jField1Up;
    private javax.swing.JTextField jField2A;
    private javax.swing.JTextField jField2B;
    private javax.swing.JTextField jField2Down;
    private javax.swing.JTextField jField2Left;
    private javax.swing.JTextField jField2Right;
    private javax.swing.JTextField jField2Select;
    private javax.swing.JTextField jField2Start;
    private javax.swing.JTextField jField2Up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCtrl1;
    private javax.swing.JLabel jLabelCtrl2;
    // End of variables declaration//GEN-END:variables
}
