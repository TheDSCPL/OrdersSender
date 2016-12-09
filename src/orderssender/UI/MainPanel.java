/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderssender.UI;

import orderssender.*;

/**
 *
 * @author luisp
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        blockTypes = new String[] {"P1","P2","P3","P4","P5","P6","P7","P8","P9"};
        javax.swing.DefaultComboBoxModel<String> comboModel;
        topTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>( blockTypes ));
        bottomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>( blockTypes ));
        unloadTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>( blockTypes ));
        unloadDestinations = new String[] {"PM1", "PM2"};
        unloadDestinationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>( unloadDestinations ));
        
        p2p1Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p1p3Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p4p5Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p1p2Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p3p4Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p5p7Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p2p3Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p4p6Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        p6p7Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        assemblyQuantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        unloadQuantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        
        nextOrderIDTextField.setText("" + OrdersSender.getOrderID());
    }
    
    private final String[] blockTypes;
    private final String[] unloadDestinations;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p2p1Button = new javax.swing.JButton();
        p2p1Spinner = new javax.swing.JSpinner();
        p1p3Button = new javax.swing.JButton();
        p1p3Spinner = new javax.swing.JSpinner();
        p4p5Button = new javax.swing.JButton();
        p4p5Spinner = new javax.swing.JSpinner();
        p1p2Button = new javax.swing.JButton();
        p1p2Spinner = new javax.swing.JSpinner();
        p3p4Button = new javax.swing.JButton();
        p3p4Spinner = new javax.swing.JSpinner();
        p5p7Button = new javax.swing.JButton();
        p5p7Spinner = new javax.swing.JSpinner();
        p2p3Button = new javax.swing.JButton();
        p2p3Spinner = new javax.swing.JSpinner();
        p4p6Button = new javax.swing.JButton();
        p4p6Spinner = new javax.swing.JSpinner();
        p6p7Button = new javax.swing.JButton();
        p6p7Spinner = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        sendAssemblyOrderButton = new javax.swing.JButton();
        topTypeComboBox = new javax.swing.JComboBox<>();
        bottomTypeComboBox = new javax.swing.JComboBox<>();
        topLabel = new javax.swing.JLabel();
        bottomLabel = new javax.swing.JLabel();
        assmeblyQuantityLabel = new javax.swing.JLabel();
        assemblyQuantitySpinner = new javax.swing.JSpinner();
        settingsButton = new javax.swing.JButton();
        nextOrderIDLabel = new javax.swing.JLabel();
        setNextOrderIDButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        unloadTypeComboBox = new javax.swing.JComboBox<>();
        unLoadTypeLabel = new javax.swing.JLabel();
        unloadDestinationLabel = new javax.swing.JLabel();
        unloadDestinationComboBox = new javax.swing.JComboBox<>();
        unloadQuantityLabel = new javax.swing.JLabel();
        unloadQuantitySpinner = new javax.swing.JSpinner();
        sendUnloadOrderButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Transformation Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        p2p1Button.setText("P2 -> P1");
        p2p1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2p1ButtonActionPerformed(evt);
            }
        });

        p1p3Button.setText("P1 -> P3");
        p1p3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1p3ButtonActionPerformed(evt);
            }
        });

        p4p5Button.setText("P4 -> P5");
        p4p5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4p5ButtonActionPerformed(evt);
            }
        });

        p1p2Button.setText("P1 -> P2");
        p1p2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1p2ButtonActionPerformed(evt);
            }
        });

        p3p4Button.setText("P3 -> P4");
        p3p4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3p4ButtonActionPerformed(evt);
            }
        });

        p5p7Button.setText("P5 -> P7");
        p5p7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5p7ButtonActionPerformed(evt);
            }
        });

        p2p3Button.setText("P2 -> P3");
        p2p3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2p3ButtonActionPerformed(evt);
            }
        });

        p4p6Button.setText("P4 -> P6");
        p4p6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4p6ButtonActionPerformed(evt);
            }
        });

        p6p7Button.setText("P6 -> P7");
        p6p7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6p7ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p2p1Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2p1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p1p3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1p3Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p4p5Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4p5Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p1p2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1p2Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p3p4Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3p4Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p5p7Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p5p7Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p2p3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2p3Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p4p6Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4p6Spinner))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p6p7Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6p7Spinner)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2p1Button)
                    .addComponent(p2p1Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1p3Button)
                    .addComponent(p1p3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4p5Button)
                    .addComponent(p4p5Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1p2Button)
                    .addComponent(p1p2Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3p4Button)
                    .addComponent(p3p4Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5p7Button)
                    .addComponent(p5p7Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2p3Button)
                    .addComponent(p2p3Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4p6Button)
                    .addComponent(p4p6Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p6p7Button)
                    .addComponent(p6p7Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Assembly Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        sendAssemblyOrderButton.setText("Send Assembly Order");
        sendAssemblyOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAssemblyOrderButtonActionPerformed(evt);
            }
        });

        topTypeComboBox.setMaximumRowCount(9);
        topTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1", "P2", "P3" }));
        topTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topTypeComboBoxActionPerformed(evt);
            }
        });

        bottomTypeComboBox.setMaximumRowCount(9);
        bottomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1", "P2" }));
        bottomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomTypeComboBoxActionPerformed(evt);
            }
        });

        topLabel.setText("Top:");

        bottomLabel.setText("Bottom:");

        assmeblyQuantityLabel.setText("Quantity:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendAssemblyOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottomLabel)
                            .addComponent(bottomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topLabel))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(assmeblyQuantityLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(assemblyQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bottomLabel)
                            .addComponent(assmeblyQuantityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bottomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assemblyQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(topLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendAssemblyOrderButton)
                .addContainerGap())
        );

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        nextOrderIDLabel.setText("Next Order ID:");

        setNextOrderIDButton.setText("Set");
        setNextOrderIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNextOrderIDButtonActionPerformed(evt);
            }
        });

        nextOrderIDTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nextOrderIDTextField.setText("999");
        nextOrderIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextOrderIDTextFieldActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Unload Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        unloadTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1" }));

        unLoadTypeLabel.setText("Type:");

        unloadDestinationLabel.setText("To:");

        unloadDestinationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PM1", "PM2" }));

        unloadQuantityLabel.setText("Quantity:");

        sendUnloadOrderButton.setText("Send Unload Order");
        sendUnloadOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendUnloadOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(unloadTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unloadDestinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unloadQuantitySpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(unLoadTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(unloadDestinationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(unloadQuantityLabel))
                    .addComponent(sendUnloadOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unLoadTypeLabel)
                    .addComponent(unloadDestinationLabel)
                    .addComponent(unloadQuantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unloadTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unloadDestinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unloadQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendUnloadOrderButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nextOrderIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextOrderIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setNextOrderIDButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingsButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsButton)
                    .addComponent(nextOrderIDLabel)
                    .addComponent(setNextOrderIDButton)
                    .addComponent(nextOrderIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        OrdersSender.mainFrame.changePanel(new SettingsPanel());
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void p2p1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2p1ButtonActionPerformed
        int n;
        try {
            n=(Integer)p2p1Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 2, 1, n);
    }//GEN-LAST:event_p2p1ButtonActionPerformed

    private void p1p3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1p3ButtonActionPerformed
        int n;
        try {
            n=(Integer)p1p3Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 1, 3, n);
    }//GEN-LAST:event_p1p3ButtonActionPerformed

    private void p4p5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4p5ButtonActionPerformed
        int n;
        try {
            n=(Integer)p4p5Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 4, 5, n);
    }//GEN-LAST:event_p4p5ButtonActionPerformed

    private void p1p2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1p2ButtonActionPerformed
        int n;
        try {
            n=(Integer)p1p2Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 1, 2, n);
    }//GEN-LAST:event_p1p2ButtonActionPerformed

    private void p3p4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3p4ButtonActionPerformed
        int n;
        try {
            n=(Integer)p3p4Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 3, 4, n);
    }//GEN-LAST:event_p3p4ButtonActionPerformed

    private void p5p7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5p7ButtonActionPerformed
        int n;
        try {
            n=(Integer)p5p7Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 5, 7, n);
    }//GEN-LAST:event_p5p7ButtonActionPerformed

    private void p2p3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2p3ButtonActionPerformed
        int n;
        try {
            n=(Integer)p2p3Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 2, 3, n);
    }//GEN-LAST:event_p2p3ButtonActionPerformed

    private void p4p6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4p6ButtonActionPerformed
        int n;
        try {
            n=(Integer)p4p6Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 4, 6, n);
    }//GEN-LAST:event_p4p6ButtonActionPerformed

    private void p6p7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6p7ButtonActionPerformed
        int n;
        try {
            n=(Integer)p6p7Spinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.TRANSFORMATION, 6, 7, n);
    }//GEN-LAST:event_p6p7ButtonActionPerformed

    private void myBadError()
    {
        OrdersSender.showError("Ups! My bad!");
        try {
            Thread.sleep(1*1000);
        } catch(Exception ignored) {return;}
        System.exit(-1);
    }
    
    private int getBlockTypeID(String type)
    {
        String[] split = type.split("[P]");
        if(split.length > 2)
            myBadError();
        try {
            return Integer.parseInt(split[1]);
        }
        catch(NumberFormatException ex)
        {
            myBadError();
        }
        return 0;
    }
    
    private void sendAssemblyOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAssemblyOrderButtonActionPerformed
        int n;
        try {
            n=(Integer)assemblyQuantitySpinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.ASSEMBLY, getBlockTypeID((String)bottomTypeComboBox.getSelectedItem()), getBlockTypeID((String)topTypeComboBox.getSelectedItem()), n);
    }//GEN-LAST:event_sendAssemblyOrderButtonActionPerformed

    private void bottomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomTypeComboBoxActionPerformed
        
    }//GEN-LAST:event_bottomTypeComboBoxActionPerformed

    private void topTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topTypeComboBoxActionPerformed
        
    }//GEN-LAST:event_topTypeComboBoxActionPerformed

    private void setNextOrderIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNextOrderIDButtonActionPerformed
        int n;
        boolean error = false;
        try {
            n = Integer.parseInt(nextOrderIDTextField.getText());
        }
        catch(NumberFormatException ex)
        {
            error = true;
            n = 0;
        }
        if(error || n<0 || n>999)
        {
            OrdersSender.showWarning("An order ID must be an integer between 0 and 999");
            nextOrderIDTextField.setText("" + OrdersSender.getOrderID());
            return;
        }
        OrdersSender.setOrderID(n);
    }//GEN-LAST:event_setNextOrderIDButtonActionPerformed

    private void nextOrderIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextOrderIDTextFieldActionPerformed
        setNextOrderIDButtonActionPerformed(evt);
    }//GEN-LAST:event_nextOrderIDTextFieldActionPerformed

    private void sendUnloadOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendUnloadOrderButtonActionPerformed
        int n;
        try {
            n=(Integer)unloadQuantitySpinner.getValue();
        }
        catch (ClassCastException ex)
        {
            OrdersSender.showWarning("The quantity of an order must be an integer!");
            return;
        }
        UDP.sendOrder(UDP.Orders.UNLOAD, getBlockTypeID((String)unloadTypeComboBox.getSelectedItem()), ((String)unloadDestinationComboBox.getSelectedItem()).equals(unloadDestinations[0]) ? 1 : 2, n);
    }//GEN-LAST:event_sendUnloadOrderButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner assemblyQuantitySpinner;
    private javax.swing.JLabel assmeblyQuantityLabel;
    private javax.swing.JLabel bottomLabel;
    private javax.swing.JComboBox<String> bottomTypeComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nextOrderIDLabel;
    public final javax.swing.JTextField nextOrderIDTextField = new javax.swing.JTextField();
    private javax.swing.JButton p1p2Button;
    private javax.swing.JSpinner p1p2Spinner;
    private javax.swing.JButton p1p3Button;
    private javax.swing.JSpinner p1p3Spinner;
    private javax.swing.JButton p2p1Button;
    private javax.swing.JSpinner p2p1Spinner;
    private javax.swing.JButton p2p3Button;
    private javax.swing.JSpinner p2p3Spinner;
    private javax.swing.JButton p3p4Button;
    private javax.swing.JSpinner p3p4Spinner;
    private javax.swing.JButton p4p5Button;
    private javax.swing.JSpinner p4p5Spinner;
    private javax.swing.JButton p4p6Button;
    private javax.swing.JSpinner p4p6Spinner;
    private javax.swing.JButton p5p7Button;
    private javax.swing.JSpinner p5p7Spinner;
    private javax.swing.JButton p6p7Button;
    private javax.swing.JSpinner p6p7Spinner;
    private javax.swing.JButton sendAssemblyOrderButton;
    private javax.swing.JButton sendUnloadOrderButton;
    private javax.swing.JButton setNextOrderIDButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel topLabel;
    private javax.swing.JComboBox<String> topTypeComboBox;
    private javax.swing.JLabel unLoadTypeLabel;
    private javax.swing.JComboBox<String> unloadDestinationComboBox;
    private javax.swing.JLabel unloadDestinationLabel;
    private javax.swing.JLabel unloadQuantityLabel;
    private javax.swing.JSpinner unloadQuantitySpinner;
    private javax.swing.JComboBox<String> unloadTypeComboBox;
    // End of variables declaration//GEN-END:variables
}