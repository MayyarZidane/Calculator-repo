/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.text.DecimalFormat;
import java.text.Format;
import javax.swing.JButton;

/**
 *
 * @author PC
 */
public class MainFrame extends javax.swing.JFrame {

    double num;
    double answer;
    double oldAnswer;
    char operation;
    boolean isTextChanged = false;
    boolean noClickedOperator = true;
    boolean isEqualClicked = false;
    DecimalFormat format = new DecimalFormat("0.#############");

    /**
     * Creates new form Main
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jButton12 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        resultField = new javax.swing.JTextField();
        oldResultLabel = new javax.swing.JLabel();
        oneBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        commaBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        multiplicBtn = new javax.swing.JButton();
        subtractionBtn = new javax.swing.JButton();
        additionBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        oldOperationLabel = new javax.swing.JLabel();

        jButton12.setText("=");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(238, 244));
        setMinimumSize(new java.awt.Dimension(238, 244));
        setPreferredSize(new java.awt.Dimension(238, 244));
        setResizable(false);

        resultField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        resultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFieldActionPerformed(evt);
            }
        });

        oldResultLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        oldResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        oldResultLabel.setFocusable(false);

        oneBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setFocusable(false);
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        zeroBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setFocusable(false);
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        twoBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setFocusable(false);
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        threeBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setFocusable(false);
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        commaBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        commaBtn.setText(".");
        commaBtn.setFocusable(false);
        commaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaBtnActionPerformed(evt);
            }
        });

        fourBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setFocusable(false);
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        fiveBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setFocusable(false);
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        sixBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setFocusable(false);
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        sevenBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setFocusable(false);
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setFocusable(false);
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        nineBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setFocusable(false);
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        divideBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        divideBtn.setText("÷");
        divideBtn.setFocusable(false);

        multiplicBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        multiplicBtn.setText("x");
        multiplicBtn.setFocusable(false);

        subtractionBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        subtractionBtn.setText("-");
        subtractionBtn.setFocusable(false);

        additionBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        additionBtn.setText("+");
        additionBtn.setFocusable(false);
        additionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionBtnActionPerformed(evt);
            }
        });

        equalBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setFocusable(false);

        backBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        backBtn.setText("←");
        backBtn.setFocusable(false);

        clearBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        clearBtn.setText("C");
        clearBtn.setFocusable(false);

        oldOperationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        oldOperationLabel.setFocusable(false);
        oldOperationLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        oldOperationLabel.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(additionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtractionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(multiplicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(commaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(oldResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oldOperationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oldResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(oldOperationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(eightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(nineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(additionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(fiveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(sixBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(subtractionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(multiplicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divideBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(commaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(254, 282));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void resultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFieldActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        setClickedNumber((JButton) evt.getSource());    }//GEN-LAST:event_nineBtnActionPerformed

    private void commaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaBtnActionPerformed
        if (isEqualClicked || resultField.getText().isEmpty()) {
            resultField.setText("0.");
        } else if (!resultField.getText().contains(".")) {
            resultField.setText(resultField.getText() + ".");
        }

        isEqualClicked = false;
        isTextChanged = true;
    }//GEN-LAST:event_commaBtnActionPerformed

    private void additionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionBtnActionPerformed
        if (noClickedOperator) {
            if (resultField.getText().equals("0") && oldOperationLabel.getText().equals("/")) {
                resultField.setText("cannot divide by 0");
            } else if (isTextChanged || oldResultLabel.getText().isEmpty()) {
                try {
                    if (resultField.getText().isEmpty()) {
                        num = 0;
                    } else {
                        num = Double.parseDouble(resultField.getText());
                    }

                    if (oldResultLabel.getText().isEmpty()) {
                        operation = '+';
                        oldAnswer = 0;
                    } else {
                        oldAnswer = Double.parseDouble(oldResultLabel.getText());
                    }
                    calculateOldAnswer();
                    oldOperationLabel.setText("+");
                    oldResultLabel.setText(format.format(oldAnswer));
                    resultField.setText("");

                    operation = '+';
                } catch (Exception ex) {
                    resultField.setText("Error");
                }
                
                isTextChanged = false;
                noClickedOperator = false;
            }
        }
    }//GEN-LAST:event_additionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private void calculateOldAnswer() {
        switch (operation) {
            case '*' ->
                oldAnswer *= num;
            case '/' ->
                oldAnswer /= num;
            case '+' ->
                oldAnswer += num;
            case '-' -> {
                if (!oldResultLabel.getText().isEmpty()) {
                    oldAnswer -= num;
                } else {
                    oldAnswer = num - oldAnswer;
                }
            }

        }
    }

    private void setClickedNumber(JButton clickedBtn) {
        if (isEqualClicked || resultField.getText().equals("0")) {
            resultField.setText(clickedBtn.getText());
        } else {
            resultField.setText(resultField.getText() + clickedBtn.getText());
        }

        isEqualClicked = false;
        isTextChanged = true;
        noClickedOperator = true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton commaBtn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton jButton12;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton multiplicBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JLabel oldOperationLabel;
    private javax.swing.JLabel oldResultLabel;
    private javax.swing.JButton oneBtn;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton subtractionBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
