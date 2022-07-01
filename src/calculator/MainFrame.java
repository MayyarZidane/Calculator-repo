/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import com.formdev.flatlaf.FlatLightLaf;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC
 */
public class MainFrame extends javax.swing.JFrame {

    double num;
    double oldAnswer;
    char operation;
    boolean isTextChanged = false;
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
        setTitle("Calculator");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/calculator/icon/Calculator.png")).getImage()
        );
        setMinimumSize(new java.awt.Dimension(238, 244));
        setResizable(false);

        resultField.setEditable(false);
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
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        multiplicBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        multiplicBtn.setText("x");
        multiplicBtn.setFocusable(false);
        multiplicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicBtnActionPerformed(evt);
            }
        });

        subtractionBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        subtractionBtn.setText("-");
        subtractionBtn.setFocusable(false);
        subtractionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionBtnActionPerformed(evt);
            }
        });

        additionBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        additionBtn.setText("+");
        additionBtn.setFocusable(false);
        additionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionBtnActionPerformed(evt);
            }
        });

        equalBtn.setBackground(new java.awt.Color(204, 204, 204));
        equalBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setFocusable(false);
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(238, 252, 0));
        backBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        backBtn.setText("←");
        backBtn.setFocusable(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 59, 59));
        clearBtn.setText("C");
        clearBtn.setFocusable(false);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        oldOperationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        oldOperationLabel.setFocusable(false);
        oldOperationLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
            if (isDivideByZero()) {
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
                        oldAnswer = num;
                    } else {
                        oldAnswer = Double.parseDouble(oldResultLabel.getText());
                        //we calculate first and then we set operation to calculate Old operation first
                        calculateOldAnswer();
                    }

                    oldOperationLabel.setText("+");
                    oldResultLabel.setText(format.format(oldAnswer));
                    resultField.setText("");

                } catch (Exception ex) {
                    resultField.setText("Error");
                }
                operation = '+';
                isTextChanged = false;
            }
        
    }//GEN-LAST:event_additionBtnActionPerformed

    private void subtractionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionBtnActionPerformed
            if (isDivideByZero()) {
                resultField.setText("cannot divide by 0");
            } else if (isTextChanged || oldResultLabel.getText().isEmpty()) {
                try {
                    if (resultField.getText().isEmpty()) {
                        num = 0;
                    } else {
                        num = Double.parseDouble(resultField.getText());
                    }

                    if (oldResultLabel.getText().isEmpty()) {
                        //if condition is true that mean this is first operation so we have to set it
                        operation = '-';
                        oldAnswer = num;
                    } else {
                        oldAnswer = Double.parseDouble(oldResultLabel.getText());
                        calculateOldAnswer();
                    }

                    oldOperationLabel.setText("-");
                    oldResultLabel.setText(format.format(oldAnswer));
                    resultField.setText("");

                } catch (Exception ex) {
                    resultField.setText("Error");
                }
                operation = '-';
                isTextChanged = false;
            }
        
    }//GEN-LAST:event_subtractionBtnActionPerformed

    private void multiplicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicBtnActionPerformed
            if (isDivideByZero()) {
                resultField.setText("cannot divide by 0");
            } else if (isTextChanged || oldResultLabel.getText().isEmpty()) {
                try {
                    if (resultField.getText().isEmpty()) {
                        num = 1;
                    } else {
                        num = Double.parseDouble(resultField.getText());
                    }

                    if (oldResultLabel.getText().isEmpty()) {
                        //if condition is true that mean this is first operation so we have to set it
                        operation = 'x';
                        oldAnswer = 1;
                    } else {
                        oldAnswer = Double.parseDouble(oldResultLabel.getText());
                        calculateOldAnswer();
                    }


                    oldOperationLabel.setText("x");
                    oldResultLabel.setText(format.format(oldAnswer));
                    resultField.setText("");

                } catch (Exception ex) {
                    resultField.setText("Error");
                }
                
                operation = 'x';
                isTextChanged = false;
            }
        
    }//GEN-LAST:event_multiplicBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
            if (isDivideByZero()) {
                resultField.setText("cannot divide by 0");
            } else if (isTextChanged || oldResultLabel.getText().isEmpty()) {
                try {

                    if (resultField.getText().isEmpty()) {
                        num = 1;
                    } else {
                        num = Double.parseDouble(resultField.getText());
                    }

                    if (oldResultLabel.getText().isEmpty()) {
                        oldAnswer = num;
                    } else {
                        oldAnswer = Double.parseDouble(oldResultLabel.getText());
                        calculateOldAnswer();
                    }

                    oldOperationLabel.setText("÷");
                    oldResultLabel.setText(format.format(oldAnswer));
                    resultField.setText("");

                } catch (Exception ex) {
                    resultField.setText("Error");
                }
                operation = '÷';
                isTextChanged = false;
            }
        
    }//GEN-LAST:event_divideBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed

        if (isDivideByZero()) {
            resultField.setText("cannot divide by 0");
        } else if (!resultField.getText().isEmpty() && !oldResultLabel.getText().isEmpty()) {
            //here we set the numbers and calculate the result using calculateOldAnswer method
            //because we have a method do that in the program we don't have to repeat it in another way
            oldAnswer = Double.parseDouble(oldResultLabel.getText());
            num = Double.parseDouble(resultField.getText());
            operation = oldOperationLabel.getText().charAt(0);
            calculateOldAnswer();
            resultField.setText(format.format(oldAnswer));
        } else if (resultField.getText().isEmpty() && !oldOperationLabel.getText().isEmpty()) {
            resultField.setText(oldResultLabel.getText());
        }

        oldResultLabel.setText("");
        oldOperationLabel.setText("");

        isEqualClicked = true;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(resultField.getText().equals("Error") || resultField.getText().equals("cannot divide by 0")) {
            resultField.setText("");
        } else if(!resultField.getText().isEmpty()) {
            resultField.setText(resultField.getText().substring(0, resultField.getText().length() -1 ));
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       resultField.setText("");
       oldOperationLabel.setText("");
       oldResultLabel.setText("");
       num = 0;
       oldAnswer = 0;
    }//GEN-LAST:event_clearBtnActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            case 'x' ->
                oldAnswer *= num;
            case '÷' ->
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
    }

    private boolean isDivideByZero() {
        return resultField.getText().equals("0") && oldOperationLabel.getText().equals("÷");
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
