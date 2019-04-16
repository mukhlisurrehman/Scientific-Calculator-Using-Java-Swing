/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;


public class simple_calculator extends javax.swing.JFrame {

    private  void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("image.png")));
    }
    double firstnumber;

    double secondnumber;
    double result;
    private Object math;
    String operations;
    String answer;
    public simple_calculator() {
        initComponents();
        setIcon();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        choice1 = new java.awt.Choice();
        jtextfiled = new javax.swing.JTextField();
        jbtnbackspace = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnclear = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jbtnmultiply = new javax.swing.JButton();
        jbtndivide = new javax.swing.JButton();
        jbtnpm = new javax.swing.JButton();
        jbtnequal = new javax.swing.JButton();
        jbtncube = new javax.swing.JButton();
        jbtnsquare = new javax.swing.JButton();
        jbtnsquareroot = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jcopy = new javax.swing.JMenuItem();
        jpaste = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        jRadioButton1.setText("jRadioButton1");

        jScrollPane2.setViewportView(jTextPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtextfiled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextfiled.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfiledActionPerformed(evt);
            }
        });
        jtextfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextfiledKeyTyped(evt);
            }
        });

        jbtnbackspace.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnbackspace.setText("Backspace");
        jbtnbackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackspaceActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnclear.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnclear.setText("C");
        jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearActionPerformed(evt);
            }
        });

        jbtnminus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnminus.setText("-");
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });

        jbtnmultiply.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnmultiply.setText("×");
        jbtnmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmultiplyActionPerformed(evt);
            }
        });

        jbtndivide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndivide.setText("/");
        jbtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivideActionPerformed(evt);
            }
        });

        jbtnpm.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnpm.setText("±");
        jbtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpmActionPerformed(evt);
            }
        });

        jbtnequal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnequal.setText("=");
        jbtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnequalActionPerformed(evt);
            }
        });

        jbtncube.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        jbtncube.setText("x³");
        jbtncube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncubeActionPerformed(evt);
            }
        });

        jbtnsquare.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        jbtnsquare.setText("x²");
        jbtnsquare.setToolTipText("");
        jbtnsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsquareActionPerformed(evt);
            }
        });

        jbtnsquareroot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jbtnsquareroot.setText("√");
        jbtnsquareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsquarerootActionPerformed(evt);
            }
        });

        jbtndot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtnplus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnplus.setText("+");
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });

        jMenu1.setText("View");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Standard");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Scientific");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jcopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jcopy.setText("Copy");
        jcopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcopyActionPerformed(evt);
            }
        });
        jMenu2.add(jcopy);

        jpaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jpaste.setText("Paste");
        jpaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasteActionPerformed(evt);
            }
        });
        jMenu2.add(jpaste);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextfiled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtnbackspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtncube, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsquareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtextfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnsquareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtncube, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnbackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
     this.setVisible(true);
     this.setTitle("Calculator");
     this.setSize(245, 300);
     this.setResizable(false);
      
    }//GEN-LAST:event_formWindowActivated

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
         new simple_calculator().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed
        firstnumber=Double.parseDouble(jtextfiled.getText());
       jtextfiled.setText(null);
       operations ="-";
    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
       firstnumber=Double.parseDouble(jtextfiled.getText());
       jtextfiled.setText(null);
       operations ="+";
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnbackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackspaceActionPerformed
       String b=null;
       if(jtextfiled.getText().length()>0){
           StringBuilder strB= new StringBuilder(jtextfiled.getText());
           strB.deleteCharAt(jtextfiled.getText().length()-1);
           b=strB.toString();
           jtextfiled.setText(b);
       }
    }//GEN-LAST:event_jbtnbackspaceActionPerformed

    private void jbtncubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncubeActionPerformed
        double Operation= Double.parseDouble(String.valueOf(jtextfiled.getText()));
        Operation= (Operation*Operation*Operation);
        jtextfiled.setText(String.valueOf(Operation));
    }//GEN-LAST:event_jbtncubeActionPerformed

    private void jtextfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfiledActionPerformed
       
    }//GEN-LAST:event_jtextfiledActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Num= jtextfiled.getText() + jbtn8.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Num= jtextfiled.getText() + jbtn3.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
       if(!jtextfiled.getText().contains(".")){
           jtextfiled.setText(jtextfiled.getText()+jbtndot.getText());
       }
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearActionPerformed
        jtextfiled.setText("");
    }//GEN-LAST:event_jbtnclearActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String Num= jtextfiled.getText() + jbtn7.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
         String Num= jtextfiled.getText() + jbtn9.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         String Num= jtextfiled.getText() + jbtn4.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
         String Num= jtextfiled.getText() + jbtn5.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String Num= jtextfiled.getText() + jbtn6.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
         String Num= jtextfiled.getText() + jbtn1.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String Num= jtextfiled.getText() + jbtn2.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
         String Num= jtextfiled.getText() + jbtn0.getText();
        jtextfiled.setText(Num);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpmActionPerformed
        double Operation= Double.parseDouble(String.valueOf(jtextfiled.getText()));
        Operation= Operation*(-1);
        jtextfiled.setText(String.valueOf(Operation));
    }//GEN-LAST:event_jbtnpmActionPerformed

    private void jbtnsquarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsquarerootActionPerformed
        double Operation= Double.parseDouble(String.valueOf(jtextfiled.getText()));
        Operation= Math.sqrt(Operation);
        jtextfiled.setText(String.valueOf(Operation)); // TODO add your handling code here:
    }//GEN-LAST:event_jbtnsquarerootActionPerformed

    private void jbtnsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsquareActionPerformed
        double Operation= Double.parseDouble(String.valueOf(jtextfiled.getText()));
        Operation= (Operation*Operation);
        jtextfiled.setText(String.valueOf(Operation));
    }//GEN-LAST:event_jbtnsquareActionPerformed

    private void jtextfiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextfiledKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))){
            
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtextfiledKeyTyped
   
    private void jbtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivideActionPerformed
       firstnumber=Double.parseDouble(jtextfiled.getText());
       jtextfiled.setText(null);
       operations ="/";
    }//GEN-LAST:event_jbtndivideActionPerformed

    private void jbtnmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmultiplyActionPerformed
        firstnumber=Double.parseDouble(jtextfiled.getText());
       jtextfiled.setText(null);
       operations ="*";
    }//GEN-LAST:event_jbtnmultiplyActionPerformed

    private void jbtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnequalActionPerformed
        secondnumber=Double.parseDouble(jtextfiled.getText());
        if(operations=="+"){
            result=firstnumber+secondnumber;
            answer=String.format("%.2f", result);
            jtextfiled.setText(String.valueOf(answer));
            
        }
        if(operations=="-"){
            result=firstnumber-secondnumber;
            answer=String.format("%.2f", result);
            jtextfiled.setText(String.valueOf(answer));
        }
        if(operations=="*"){
            result=firstnumber*secondnumber;
            answer=String.format("%.2f", result);
            jtextfiled.setText(String.valueOf(answer));
        }
        if(operations=="/"){
            result=firstnumber/secondnumber;
            answer=String.format("%.2f", result);
            jtextfiled.setText(String.valueOf(answer));
        }
     
        
    }//GEN-LAST:event_jbtnequalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
         new simple_calculator().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
         new Scientific().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
       
    }//GEN-LAST:event_formWindowOpened

    private void jcopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcopyActionPerformed
        jtextfiled.copy();
    }//GEN-LAST:event_jcopyActionPerformed

    private void jpasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasteActionPerformed
        jtextfiled.paste();
    }//GEN-LAST:event_jpasteActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jtextfiled.cut();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simple_calculator().setVisible(true);
                
                
            } 
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnbackspace;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtncube;
    private javax.swing.JButton jbtndivide;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnequal;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmultiply;
    private javax.swing.JButton jbtnplus;
    private javax.swing.JButton jbtnpm;
    private javax.swing.JButton jbtnsquare;
    private javax.swing.JButton jbtnsquareroot;
    private javax.swing.JMenuItem jcopy;
    private javax.swing.JMenuItem jpaste;
    private javax.swing.JTextField jtextfiled;
    // End of variables declaration//GEN-END:variables

          


}
