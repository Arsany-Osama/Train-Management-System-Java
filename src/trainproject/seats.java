/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainproject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import trainproject.Reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class seats extends javax.swing.JFrame {

    /**
     * Creates new form seats
     */
    public seats() {
        initComponents();
        
        String type="";
        Reservation r=new Reservation();
            String code=r.getCode();
            String log=login.id.getText();
      try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+log+"'AND tcode = '"+code+"' ");
           if(rs.next())
           {
          indv.setText(rs.getString(9));
          type=rs.getString(14);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nt Found !");
            System.out.println(ex.getMessage());
        }
      switch(type)
      {
         case "VIP" : ncar.addItem("1"); break;
         case "First Class" : ncar.addItem("2"); break;
         case "Second Class" : ncar.addItem("3"); break;
         case "Noraml Class" :   ncar.addItem("4"); ncar.addItem("5");  break;
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        indv = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ncar = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        nseat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 71, 40));

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 71, 40));

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 71, 40));

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 71, 40));

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 71, 40));

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 71, 40));

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 71, 40));

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 71, 40));

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 71, 40));

        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 71, 40));

        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 71, 40));

        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 71, 40));

        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 71, 40));

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 71, 40));

        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 71, 40));

        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 71, 40));

        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 71, 40));

        b22.setText("22");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 71, 40));

        b21.setText("21");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 71, 40));

        b23.setText("23");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 71, 40));

        b24.setText("24");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 71, 40));

        b26.setText("26");
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 71, 40));

        b30.setText("30");
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 71, 40));

        b29.setText("29");
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 71, 40));

        b31.setText("31");
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 71, 40));

        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 71, 40));

        b32.setText("32");
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 71, 40));

        b25.setText("25");
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 71, 40));

        b27.setText("27");
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 71, 40));

        b28.setText("28");
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 71, 40));

        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 71, 40));

        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 71, 40));

        b46.setText("46");
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 71, 40));

        b45.setText("45");
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 71, 40));

        b47.setText("47");
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 71, 40));

        b33.setText("33");
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 71, 40));

        b48.setText("48");
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 71, 40));

        b41.setText("41");
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 71, 40));

        b43.setText("43");
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 71, 40));

        b44.setText("44");
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 71, 40));

        b35.setText("35");
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 71, 40));

        b36.setText("36");
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 71, 40));

        b34.setText("34");
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 71, 40));

        b38.setText("38");
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 71, 40));

        b37.setText("37");
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 71, 40));

        b39.setText("39");
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 71, 40));

        b40.setText("40");
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 71, 40));

        b42.setText("42");
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 71, 40));

        indv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        indv.setText("0");
        getContentPane().add(indv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 790, 50, 40));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 800, 147, 46));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 30, 80, 30));

        jLabel4.setText("Car Number :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        ncar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ncar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncarActionPerformed(evt);
            }
        });
        getContentPane().add(ncar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 83, -1));

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 760, 90, 30));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 800, 100, -1));

        nseat.setEditable(false);
        nseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nseatActionPerformed(evt);
            }
        });
        getContentPane().add(nseat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 750, 190, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainproject/images/seats ui design.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1100, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b3.setEnabled(false); nseat.setText(nseat.getText()+"3,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b1.setEnabled(false); nseat.setText(nseat.getText()+"1,"); indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b5.setEnabled(false); nseat.setText(nseat.getText()+"5,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b7.setEnabled(false); nseat.setText(nseat.getText()+"7,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b7ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b13.setEnabled(false); nseat.setText(nseat.getText()+"13,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b13ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b15.setEnabled(false); nseat.setText(nseat.getText()+"15,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b15ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b9.setEnabled(false);nseat.setText(nseat.getText()+"9,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b9ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b11.setEnabled(false); nseat.setText(nseat.getText()+"11,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b11ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b21.setEnabled(false);nseat.setText(nseat.getText()+"21,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b21ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
    String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b23.setEnabled(false);nseat.setText(nseat.getText()+"23,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b23ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b29.setEnabled(false);nseat.setText(nseat.getText()+"29,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b29ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b31.setEnabled(false);nseat.setText(nseat.getText()+"31,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b31ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b17.setEnabled(false); nseat.setText(nseat.getText()+"17,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b17ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b25.setEnabled(false);nseat.setText(nseat.getText()+"25,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b25ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
      String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b27.setEnabled(false);nseat.setText(nseat.getText()+"27,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b27ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
     String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b19.setEnabled(false);nseat.setText(nseat.getText()+"19,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b19ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
      String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b45.setEnabled(false);nseat.setText(nseat.getText()+"45,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b45ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b47.setEnabled(false);nseat.setText(nseat.getText()+"47,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b47ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b33.setEnabled(false);nseat.setText(nseat.getText()+"33,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b33ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b41.setEnabled(false);nseat.setText(nseat.getText()+"41,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b41ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b43.setEnabled(false);nseat.setText(nseat.getText()+"43,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b43ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b35.setEnabled(false);nseat.setText(nseat.getText()+"35,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b35ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b37.setEnabled(false);nseat.setText(nseat.getText()+"37,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b37ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b39.setEnabled(false);nseat.setText(nseat.getText()+"39,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b39ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        File f=new File("D:\\Projects\\Java\\Netbeans\\TrainProject\\Engine.txt");
             String journ1="",engine1="",journ2="",engine2="";
        try {
           Scanner input=new Scanner(f);
              journ1=input.next();
              engine1=input.next();
              journ2=input.next();
              engine2=input.next();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

   //s is frame seats    
       String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="",s13="",s14="",s15="",s16="",s17="",s18="",s19="",s20="",s21="",s22="",s23="",s24="",s25="",s26="",s27="",s28="",s29="",s30="",s31="",s32="",s33="",s34="",s35="",s36="",s37="",s38="",s39="",s40="",s41="",s42="",s43="",s44="",s45="",s46="",s47="",s48="";
    String car=ncar.getSelectedItem().toString();
            switch(car) 
        {
            case "1" : car="c1";break;
            case "2" : car="c2";break;
            case "3" : car="c3";break;
            case "4" : car="c4";break;
            case "5" : car="c5";break;
        }
    String nn=journey();
    Connection c=connection.connect();
          if(c!=null){
        try {  Statement st1=c.createStatement();
         ResultSet rsa=st1.executeQuery("select * from seats WHERE Journey ='"+nn+"' AND CarNo='"+car+"' ");
           if(rsa.next())
           {
            s1=rsa.getString(3);s6=rsa.getString(8);s11=rsa.getString(13);s16=rsa.getString(18);s21=rsa.getString(23);s26=rsa.getString(28);s31=rsa.getString(33);s36=rsa.getString(38);s41=rsa.getString(43);s45=rsa.getString(47);
            s2=rsa.getString(4);s7=rsa.getString(9);s12=rsa.getString(14);s17=rsa.getString(19);s22=rsa.getString(24);s27=rsa.getString(29);s32=rsa.getString(34);s37=rsa.getString(39);s42=rsa.getString(44);s46=rsa.getString(48);
            s3=rsa.getString(5);s8=rsa.getString(10);s13=rsa.getString(15);s18=rsa.getString(20);s23=rsa.getString(25);s28=rsa.getString(30);s33=rsa.getString(35);s38=rsa.getString(40);s43=rsa.getString(45);s47=rsa.getString(49);
            s4=rsa.getString(6);s9=rsa.getString(11);s14=rsa.getString(16);s19=rsa.getString(21);s24=rsa.getString(26);s29=rsa.getString(31);s34=rsa.getString(36);s39=rsa.getString(41);s44=rsa.getString(46);s48=rsa.getString(50);
            s5=rsa.getString(7);s10=rsa.getString(12);s15=rsa.getString(17);s20=rsa.getString(22);s25=rsa.getString(27);s30=rsa.getString(32);s35=rsa.getString(37);s40=rsa.getString(42);
                 
//c is sql seats
       String c1="f",c2="f",c3="f",c4="f",c5="f",c6="f",c7="f",c8="f",c9="f",c10="f",c11="f",c12="f",c13="f",c14="f",c15="f",c16="f",c17="f",c18="f",c19="f",c20="f",c21="f",c22="f",c23="f",c24="f",c25="f",c26="f",c27="f",c28="f",c29="f",c30="f",c31="f",c32="f",c33="f",c34="f",c35="f",c36="f",c37="f",c38="f",c39="f",c40="f",c41="f",c42="f",c43="f",c44="f",c45="f",c46="f",c47="f",c48="f";
             String seat=nseat.getText();
       String n[]=seat.toString().split(",");
      for(int i=0;i<n.length;i++)
       {
           String check=n[i];
       switch(check)
           {
               case "1" :   s1="t";break;
               case "2" :   s2="t";break;
               case "3" :   s3="t";break;
               case "4" :   s4="t";break;
               case "5" :   s5="t";break;
               case "6" :   s6="t";break;
               case "7" :   s7="t";break;
               case "8" :   s8="t";break;
               case "9" :   s9="t";break;
               case "10" :  s10="t";break;
               case "11" :  s11="t";break;
               case "12" :  s12="t";break;
               case "13" :  s13="t";break;
               case "14" :  s14="t";break;
               case "15" :  s15="t";break;
               case "16" :  s16="t";break;
               case "17" :  s17="t";break;
               case "18" :  s18="t";break;
               case "19" :  s19="t";break;
               case "20" :  s20="t";break;
               case "21" :  s21="t";break;
               case "22" :  s22="t";break;
               case "23" :  s23="t";break;
               case "24" :  s24="t";break;
               case "25" :  s25="t";break;
               case "26" :  s26="t";break;
               case "27" :  s27="t";break;
               case "28" :  s28="t";break; 
               case "29" :  s29="t";break;
               case "30" :  s30="t";break;
               case "31" :  s31="t";break;
               case "32" :  s32="t";break;
               case "33" :  s33="t";break;
               case "34" :  s34="t";break;
               case "35" :  s35="t";break;
               case "36" :  s36="t";break;
               case "37" :  s37="t";break;
               case "38" :  s38="t";break;
               case "39" :  s39="t";break;
               case "40" :  s40="t";break;
               case "41" :  s41="t";break;
               case "42" :  s42="t";break;
               case "43" :  s43="t";break;
               case "44" :  s44="t";break;
               case "45" :  s45="t";break;
               case "46" :  s46="t";break;
               case "47" :  s47="t";break;
               case "48" :  s48="t";break;
       }}
     
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from seats WHERE Journey ='"+nn+"' AND CarNo='"+car+"' ");
           if(rs.next())
           {
                  for(int i=0;i<n.length;i++)
       {
           String check=n[i];
       switch(check)
           {
               case "1" :   c1=rs.getString(3);break;
               case "2" :   c2=rs.getString(4);break;
               case "3" :   c3=rs.getString(5);break;
               case "4" :   c4=rs.getString(6);break;
               case "5" :   c5=rs.getString(7);break;
               case "6" :   c6=rs.getString(8);break;
               case "7" :   c7=rs.getString(9);break;
               case "8" :   c8=rs.getString(10);break;
               case "9" :   c9=rs.getString(11);break;
               case "10" :  c10=rs.getString(12);break;
               case "11" :  c11=rs.getString(13);break;
               case "12" :  c12=rs.getString(14);break;
               case "13" :  c13=rs.getString(15);break;
               case "14" :  c14=rs.getString(16);break;
               case "15" :  c15=rs.getString(17);break;
               case "16" :  c16=rs.getString(18);break;
               case "17" :  c17=rs.getString(19);break;
               case "18" :  c18=rs.getString(20);break;
               case "19" :  c19=rs.getString(21);break;
               case "20" :  c20=rs.getString(22);break;
               case "21" :  c21=rs.getString(23);break;
               case "22" :  c22=rs.getString(24);break;
               case "23" :  c23=rs.getString(25);break;
               case "24" :  c24=rs.getString(26);break;
               case "25" :  c25=rs.getString(27);break;
               case "26" :  c26=rs.getString(28);break;
               case "27" :  c27=rs.getString(29);break;
               case "28" :  c28=rs.getString(30);break; 
               case "29" :  c29=rs.getString(31);break;
               case "30" :  c30=rs.getString(32);break;
               case "31" :  c31=rs.getString(33);break;
               case "32" :  c32=rs.getString(34);break;
               case "33" :  c33=rs.getString(35);break;
               case "34" :  c34=rs.getString(36);break;
               case "35" :  c35=rs.getString(37);break;
               case "36" :  c36=rs.getString(38);break;
               case "37" :  c37=rs.getString(39);break;
               case "38" :  c38=rs.getString(40);break;
               case "39" :  c39=rs.getString(41);break;
               case "40" :  c40=rs.getString(42);break;
               case "41" :  c41=rs.getString(43);break;
               case "42" :  c42=rs.getString(44);break;
               case "43" :  c43=rs.getString(45);break;
               case "44" :  c44=rs.getString(46);break;
               case "45" :  c45=rs.getString(47);break;
               case "46" :  c46=rs.getString(48);break;
               case "47" :  c47=rs.getString(49);break;
               case "48" :  c48=rs.getString(50);break;
       }}
            
            if( (c1.equals("t")&&s1.equals("t")) || (c2.equals("t")&&s2.equals("t")) || (c3.equals("t")&&s3.equals("t")) || (c4.equals("t")&&s4.equals("t")) || (c5.equals("t")&&s5.equals("t")) || (c6.equals("t")&&s6.equals("t")) || (c7.equals("t")&&s7.equals("t")) || (c8.equals("t")&&s8.equals("t")) || (c9.equals("t")&&s9.equals("t")) || (c10.equals("t")&&s10.equals("t")) || (c11.equals("t")&&s11.equals("t")) || (c12.equals("t")&&s12.equals("t")) || (c13.equals("t")&&s13.equals("t")) || (c14.equals("t")&&s14.equals("t")) || (c15.equals("t")&&s15.equals("t")) || (c16.equals("t")&&s16.equals("t")) || (c17.equals("t")&&s17.equals("t")) || (c18.equals("t")&&s18.equals("t")) || (c19.equals("t")&&s19.equals("t")) || (c20.equals("t")&&s20.equals("t")) || (c21.equals("t")&&s21.equals("t")) || (c22.equals("t")&&s22.equals("t")) || (c23.equals("t")&&s23.equals("t")) || (c24.equals("t")&&s24.equals("t")) || (c25.equals("t")&&s25.equals("t")) || (c26.equals("t")&&s26.equals("t")) || (c27.equals("t")&&s27.equals("t")) || (c28.equals("t")&&s28.equals("t")) || (c29.equals("t")&&s29.equals("t")) || (c30.equals("t")&&s30.equals("t")) || (c31.equals("t")&&s31.equals("t")) || (c32.equals("t")&&s32.equals("t")) || (c33.equals("t")&&s33.equals("t")) || (c34.equals("t")&&s34.equals("t")) || (c35.equals("t")&&s35.equals("t")) || (c36.equals("t")&&s36.equals("t")) || (c37.equals("t")&&s37.equals("t")) || (c38.equals("t")&&s38.equals("t")) || (c39.equals("t")&&s39.equals("t")) || (c40.equals("t")&&s40.equals("t")) || (c41.equals("t")&&s41.equals("t")) || (c42.equals("t")&&s42.equals("t")) || (c43.equals("t")&&s43.equals("t")) || (c44.equals("t")&&s44.equals("t")) || (c45.equals("t")&&s45.equals("t")) || (c46.equals("t")&&s46.equals("t")) || (c47.equals("t")&&s47.equals("t")) || (c48.equals("t")&&s48.equals("t")) )
                  {JOptionPane.showMessageDialog(this,"This seat is not available, please click on the update button next time");}
             else if(s1.equals("f")&&s2.equals("f")&&s3.equals("f")&&s4.equals("f")&&s5.equals("f")&&s6.equals("f")&&s7.equals("f")&&s8.equals("f")&&s9.equals("f")&&s10.equals("f")&&s11.equals("f")&&s12.equals("f")&&s13.equals("f")&&s14.equals("f")&&s15.equals("f")&&s16.equals("f")&&s17.equals("f")&&s18.equals("f")&&s19.equals("f")&&s20.equals("f")&&s21.equals("f")&&s22.equals("f")&&s23.equals("f")&&s24.equals("f")&&s25.equals("f")&&s26.equals("f")&&s27.equals("f")&&s28.equals("f")&&s29.equals("f")&&s30.equals("f")&&s31.equals("f")&&s32.equals("f")&&s33.equals("f")&&s34.equals("f")&&s35.equals("f")&&s36.equals("f")&&s37.equals("f")&&s38.equals("f")&&s39.equals("f")&&s40.equals("f")&&s41.equals("f")&&s42.equals("f")&&s43.equals("f")&&s44.equals("f")&&s45.equals("f")&&s46.equals("f")&&s47.equals("f")&&s48.equals("f"))
      {JOptionPane.showMessageDialog(this,"Press Update  Choose a specific seat");}
             else if(Integer.valueOf(indv.getText())>0||Integer.valueOf(indv.getText())<0)
                 {JOptionPane.showMessageDialog(this,"Choose the exact number of seats for individuals"); } 
             else if(money()<(Double.parseDouble(Cost())-FCost() ) ){JOptionPane.showMessageDialog(this,"You don't have enough money for ticket cost : "+(Double.parseDouble(Cost())-FCost() ) );}
             else if(journ1.equals(nn)&& Float.valueOf(engine1)>100000){JOptionPane.showMessageDialog(this,"This train needs maintains"); }
             else if(journ1.equals(nn)&& Float.valueOf(engine1)>20000) {JOptionPane.showMessageDialog(this,"this train needs to exchange oil");}
             else if(journ2.equals(nn)&& Float.valueOf(engine2)>100000){JOptionPane.showMessageDialog(this,"This train needs maintains"); }
             else if(journ2.equals(nn)&& Float.valueOf(engine2)>20000) {JOptionPane.showMessageDialog(this,"this train needs to exchange oil");}
             else {
                 Reservation r=new Reservation();
            String code=r.getCode();
                      PreparedStatement s=c.prepareStatement("UPDATE `seats` SET`s1`='"+s1+"',`s2`='"+s2+"',`s3`='"+s3+"',`s4`='"+s4+"',`s5`='"+s5+"',`s6`='"+s6+"',`s7`='"+s7+"',"
             + "`s8`='"+s8+"',`s9`='"+s9+"',`s10`='"+s10+"',`s11`='"+s11+"',`s12`='"+s12+"',`s13`='"+s13+"',`s14`='"+s14+"',`s15`='"+s15+"',`s16`='"+s16+"',"
             + "`s17`='"+s17+"',`s18`='"+s18+"',`s19`='"+s19+"',`s20`='"+s20+"',`s21`='"+s21+"',`s22`='"+s22+"',`s23`='"+s23+"',`s24`='"+s24+"',`s25`='"+s25+"',"
             + "`s26`='"+s26+"',`s27`='"+s27+"',`s28`='"+s28+"',`s29`='"+s29+"',`s30`='"+s30+"',`s31`='"+s31+"',`s32`='"+s32+"',`s33`='"+s33+"',`s34`='"+s35+"',"
             + "`s35`='"+s35+"',`s36`='"+s36+"',`s37`='"+s37+"',`s38`='"+s38+"',`s39`='"+s39+"',`s40`='"+s40+"',`s41`='"+s41+"',`s42`='"+s42+"',`s43`='"+s43+"',"
             + "`s44`='"+s44+"',`s45`='"+s45+"',`s46`='"+s46+"',`s47`='"+s47+"',`s48`='"+s48+"' WHERE Journey='"+nn+"' AND CarNo='"+car+"' ");
                 int res=s.executeUpdate();      
             
             int travels;
             int travelsUpdated =0;
             float kilometers1 =0;
             float kilometers2=0  ;
             float kilometersUpdated =0 ;
                 
                 Statement stm1=c.createStatement();
                 ResultSet  rs2=stm1.executeQuery("select * from users Where id ='"+login.id.getText()+"' ");
                 if(rs2.next()){
                  travels = Integer.parseInt(rs2.getString(7));
                  travelsUpdated = travels +1 ;
                 }
                 PreparedStatement stm2 =c.prepareStatement("update users set Travels= '"+ String.valueOf(travelsUpdated) +"'  Where  id='"+login.id.getText()+"' ");
                 int res1 = stm2.executeUpdate(); 
                 
                 Statement stm3 = c.createStatement();
                 ResultSet rs3 = stm3.executeQuery("select * from users Where id = '"+login.id.getText()+"' ");
                 if(rs3.next()) {
                   kilometers1 = Float.parseFloat(rs3.getString(8));
                 }
                 Reservation rr=new Reservation();
                 Statement stm4 = c.createStatement();
                 ResultSet rs4 = stm4.executeQuery(" select * from reservations Where id = '"+login.id.getText()+"' AND tcode='"+rr.getCode()+"'");
                 if (rs4.next()){
                 kilometers2 = Float.parseFloat(rs4.getString(4));
                 kilometersUpdated = kilometers1 +kilometers2 ;
                 }      
                  PreparedStatement stm5 =c.prepareStatement("update users set Kilometers = '"+ String.valueOf(kilometersUpdated) +"'  Where  id='"+login.id.getText()+"' ");
                  int res2 = stm5.executeUpdate();
              
                 
                  
                       PreparedStatement scc=c.prepareStatement("update users set Money= '"+String.valueOf(money()-(Double.parseDouble(Cost())-FCost() ) )+"' Where id = '"+login.id.getText()+"'");
                       int  resu=scc.executeUpdate();
            String log=login.id.getText();
           PreparedStatement sec=c.prepareStatement("update reservations set seat= '"+nseat.getText()+"' , car= '"+ncar.getSelectedItem().toString()+"'  Where id = '"+log+"' And tcode = '"+code+"' ");
            int  result=sec.executeUpdate();
            
            float FinalEngine=0;
                    try {
            if(journ1.equals(nn)){FinalEngine=Float.valueOf(engine1)+kilometers2;}
            else {FinalEngine=Float.valueOf(engine2)+kilometers2;}
            PrintWriter p = new PrintWriter (f);
            if(journ1.equals(nn)){
            p.write("1");
            p.println("  "+String.valueOf(FinalEngine));
            p.write("2");
            p.write("  "+engine2);
            p.close();
            }
            else{
            p.write("1");
            p.println("  "+engine1);
            p.write("2");
            p.write("  "+String.valueOf(FinalEngine));
            p.close();
            }
           Scanner input=new Scanner(f);
             String j1=input.next();
             String e1=input.next();
             String j2=input.next();
             String e2=input.next();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
              

                JOptionPane.showMessageDialog(this,"Seats have been successfully reserved");
                Reset re=new Reset(); re.setVisible(true); dispose(); 
             }
                 
           }}
           else{JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"error !");
            System.out.println(ex.getMessage());
        }
    }
       else {JOptionPane.showMessageDialog(this,"No Connection!");}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Reservation r=new Reservation();
        String code=r.getCode();
            String log=login.id.getText(); 
       Connection c=connection.connect();
       if(c!=null){
        try {
     PreparedStatement s=c.prepareStatement("DELETE FROM `reservations` WHERE id='"+log+"' AND tcode='"+code+"'");
      int  res=s.executeUpdate();
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error");
           System.out.println(ex.getMessage());
        }
    }
       else {JOptionPane.showMessageDialog(this,"No Connection!");}
        dispose();
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String car=ncar.getSelectedItem().toString(); 
        switch(car) 
        {
            case "1" : car="c1";break;
            case "2" : car="c2";break;
            case "3" : car="c3";break;
            case "4" : car="c4";break;
            case "5" : car="c5";break;
        }
       String n=journey();int j=0;
         //String ID=login.id.getText();
      try { 
          
          
          
          Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from seats WHERE Journey ='"+n+"' AND CarNo='"+car+"' ");
           if(rs.next())
           {
          for(int i=3;i<51;i++)
          { j++;
           String s=rs.getString(i);
           if(s.equals("t")){
           switch(j)
           {
               case 1 : b1.setEnabled(false); break;
               case 2 : b2.setEnabled(false); break;
               case 3 : b3.setEnabled(false); break;
               case 4 : b4.setEnabled(false); break;
               case 5 : b5.setEnabled(false); break;
               case 6 : b6.setEnabled(false); break;
               case 7 : b7.setEnabled(false); break;
               case 8 : b8.setEnabled(false); break;
               case 9 : b9.setEnabled(false); break;
               case 10 : b10.setEnabled(false); break;
               case 11 : b11.setEnabled(false); break;
               case 12 : b12.setEnabled(false); break;
               case 13 : b13.setEnabled(false); break;
               case 14 : b14.setEnabled(false); break;
               case 15 : b15.setEnabled(false); break;
               case 16 : b16.setEnabled(false); break;
               case 17 : b17.setEnabled(false); break;
               case 18 : b18.setEnabled(false); break;
               case 19 : b19.setEnabled(false); break;
               case 20 : b20.setEnabled(false); break;
               case 21 : b21.setEnabled(false); break;
               case 22 : b22.setEnabled(false); break;
               case 23 : b23.setEnabled(false); break;
               case 24 : b24.setEnabled(false); break;
               case 25 : b25.setEnabled(false); break;
               case 26 : b26.setEnabled(false); break;
               case 27 : b27.setEnabled(false); break;
               case 28 : b28.setEnabled(false); break;
               case 29 : b29.setEnabled(false); break;
               case 30 : b30.setEnabled(false); break;
               case 31 : b31.setEnabled(false); break;
               case 32 : b32.setEnabled(false); break;
               case 33 : b33.setEnabled(false); break;
               case 34 : b34.setEnabled(false); break;
               case 35 : b35.setEnabled(false); break;
               case 36 : b36.setEnabled(false); break;
               case 37 : b37.setEnabled(false); break;
               case 38 : b38.setEnabled(false); break;
               case 39 : b39.setEnabled(false); break;
               case 40 : b40.setEnabled(false); break;
               case 41 : b41.setEnabled(false); break;
               case 42 : b42.setEnabled(false); break;
               case 43 : b43.setEnabled(false); break;
               case 44 : b44.setEnabled(false); break;
               case 45 : b45.setEnabled(false); break;
               case 46 : b46.setEnabled(false); break;
               case 47 : b47.setEnabled(false); break;
               case 48 : b48.setEnabled(false); break;
           }
           }else if(s.equals("f"))
           {
            switch(j)
           {
               case 1 : b1.setEnabled(true); break;
               case 2 : b2.setEnabled(true); break;
               case 3 : b3.setEnabled(true); break;
               case 4 : b4.setEnabled(true); break;
               case 5 : b5.setEnabled(true); break;
               case 6 : b6.setEnabled(true); break;
               case 7 : b7.setEnabled(true); break;
               case 8 : b8.setEnabled(true); break;
               case 9 : b9.setEnabled(true); break;
               case 10 : b10.setEnabled(true); break;
               case 11 : b11.setEnabled(true); break;
               case 12 : b12.setEnabled(true); break;
               case 13 : b13.setEnabled(true); break;
               case 14 : b14.setEnabled(true); break;
               case 15 : b15.setEnabled(true); break;
               case 16 : b16.setEnabled(true); break;
               case 17 : b17.setEnabled(true); break;
               case 18 : b18.setEnabled(true); break;
               case 19 : b19.setEnabled(true); break;
               case 20 : b20.setEnabled(true); break;
               case 21 : b21.setEnabled(true); break;
               case 22 : b22.setEnabled(true); break;
               case 23 : b23.setEnabled(true); break;
               case 24 : b24.setEnabled(true); break;
               case 25 : b25.setEnabled(true); break;
               case 26 : b26.setEnabled(true); break;
               case 27 : b27.setEnabled(true); break;
               case 28 : b28.setEnabled(true); break;
               case 29 : b29.setEnabled(true); break;
               case 30 : b30.setEnabled(true); break;
               case 31 : b31.setEnabled(true); break;
               case 32 : b32.setEnabled(true); break;
               case 33 : b33.setEnabled(true); break;
               case 34 : b34.setEnabled(true); break;
               case 35 : b35.setEnabled(true); break;
               case 36 : b36.setEnabled(true); break;
               case 37 : b37.setEnabled(true); break;
               case 38 : b38.setEnabled(true); break;
               case 39 : b39.setEnabled(true); break;
               case 40 : b40.setEnabled(true); break;
               case 41 : b41.setEnabled(true); break;
               case 42 : b42.setEnabled(true); break;
               case 43 : b43.setEnabled(true); break;
               case 44 : b44.setEnabled(true); break;
               case 45 : b45.setEnabled(true); break;
               case 46 : b46.setEnabled(true); break;
               case 47 : b47.setEnabled(true); break;
               case 48 : b48.setEnabled(true); break;
           }
           }
          }
           }
           else{JOptionPane.showMessageDialog(this,"Select Car Number !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Account Not Found !");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b2.setEnabled(false); nseat.setText(nseat.getText()+"2,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b4.setEnabled(false);nseat.setText(nseat.getText()+"4,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b6.setEnabled(false); nseat.setText(nseat.getText()+"6,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b8.setEnabled(false);nseat.setText(nseat.getText()+"8,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b8ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b12.setEnabled(false); nseat.setText(nseat.getText()+"12,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b12ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b16.setEnabled(false); nseat.setText(nseat.getText()+"16,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b16ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b20.setEnabled(false);nseat.setText(nseat.getText()+"20,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b20ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b24.setEnabled(false);nseat.setText(nseat.getText()+"24,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b24ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b28.setEnabled(false);nseat.setText(nseat.getText()+"28,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b28ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b32.setEnabled(false);nseat.setText(nseat.getText()+"32,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b32ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b36.setEnabled(false);nseat.setText(nseat.getText()+"36,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b36ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b40.setEnabled(false); nseat.setText(nseat.getText()+"40,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b40ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b44.setEnabled(false); nseat.setText(nseat.getText()+"44,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b44ActionPerformed

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b48ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b48.setEnabled(false); nseat.setText(nseat.getText()+"48,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b48ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b10.setEnabled(false);nseat.setText(nseat.getText()+"10,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b10ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b14.setEnabled(false); nseat.setText(nseat.getText()+"14,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b14ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b18.setEnabled(false);nseat.setText(nseat.getText()+"18,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b18ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b22.setEnabled(false);nseat.setText(nseat.getText()+"22,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b22ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b26.setEnabled(false);nseat.setText(nseat.getText()+"26,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b26ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b30.setEnabled(false);nseat.setText(nseat.getText()+"30,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b30ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b34.setEnabled(false);nseat.setText(nseat.getText()+"34,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b34ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b38.setEnabled(false);nseat.setText(nseat.getText()+"38,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b38ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
       String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b42.setEnabled(false);nseat.setText(nseat.getText()+"42,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b42ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        String car=ncar.getSelectedItem().toString();
       if(car.equals("Select")){JOptionPane.showMessageDialog(this,"Select Train Car Number!");}
       else {b46.setEnabled(false);nseat.setText(nseat.getText()+"46,");indv.setText(String.valueOf(Integer.valueOf(indv.getText())-1));}
    }//GEN-LAST:event_b46ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 nseat.setText("");
        
         Reservation r=new Reservation();
            String code=r.getCode();
            String log=login.id.getText();
      try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+log+"'AND tcode = '"+code+"' ");
           if(rs.next())
           {
          indv.setText(rs.getString(9));
           }
           else{JOptionPane.showMessageDialog(this,"code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nooooot Found !");
            System.out.println(ex.getMessage());
        }
        
        String car=ncar.getSelectedItem().toString(); 
        switch(car) 
        {
            case "1" : car="c1";break;
            case "2" : car="c2";break;
            case "3" : car="c3";break;
            case "4" : car="c4";break;
            case "5" : car="c5";break;
        }
       String n=journey();int j=0;
      try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from seats WHERE Journey ='"+n+"' AND CarNo='"+car+"' ");
           if(rs.next())
           {
          for(int i=3;i<51;i++)
          { j++;
           String s=rs.getString(i);
           if(s.equals("t")){
           switch(j)
           {
               case 1 : b1.setEnabled(false); break;
               case 2 : b2.setEnabled(false); break;
               case 3 : b3.setEnabled(false); break;
               case 4 : b4.setEnabled(false); break;
               case 5 : b5.setEnabled(false); break;
               case 6 : b6.setEnabled(false); break;
               case 7 : b7.setEnabled(false); break;
               case 8 : b8.setEnabled(false); break;
               case 9 : b9.setEnabled(false); break;
               case 10 : b10.setEnabled(false); break;
               case 11 : b11.setEnabled(false); break;
               case 12 : b12.setEnabled(false); break;
               case 13 : b13.setEnabled(false); break;
               case 14 : b14.setEnabled(false); break;
               case 15 : b15.setEnabled(false); break;
               case 16 : b16.setEnabled(false); break;
               case 17 : b17.setEnabled(false); break;
               case 18 : b18.setEnabled(false); break;
               case 19 : b19.setEnabled(false); break;
               case 20 : b20.setEnabled(false); break;
               case 21 : b21.setEnabled(false); break;
               case 22 : b22.setEnabled(false); break;
               case 23 : b23.setEnabled(false); break;
               case 24 : b24.setEnabled(false); break;
               case 25 : b25.setEnabled(false); break;
               case 26 : b26.setEnabled(false); break;
               case 27 : b27.setEnabled(false); break;
               case 28 : b28.setEnabled(false); break;
               case 29 : b29.setEnabled(false); break;
               case 30 : b30.setEnabled(false); break;
               case 31 : b31.setEnabled(false); break;
               case 32 : b32.setEnabled(false); break;
               case 33 : b33.setEnabled(false); break;
               case 34 : b34.setEnabled(false); break;
               case 35 : b35.setEnabled(false); break;
               case 36 : b36.setEnabled(false); break;
               case 37 : b37.setEnabled(false); break;
               case 38 : b38.setEnabled(false); break;
               case 39 : b39.setEnabled(false); break;
               case 40 : b40.setEnabled(false); break;
               case 41 : b41.setEnabled(false); break;
               case 42 : b42.setEnabled(false); break;
               case 43 : b43.setEnabled(false); break;
               case 44 : b44.setEnabled(false); break;
               case 45 : b45.setEnabled(false); break;
               case 46 : b46.setEnabled(false); break;
               case 47 : b47.setEnabled(false); break;
               case 48 : b48.setEnabled(false); break;
           }
           }else if(s.equals("f"))
           {
            switch(j)
           {
               case 1 : b1.setEnabled(true); break;
               case 2 : b2.setEnabled(true); break;
               case 3 : b3.setEnabled(true); break;
               case 4 : b4.setEnabled(true); break;
               case 5 : b5.setEnabled(true); break;
               case 6 : b6.setEnabled(true); break;
               case 7 : b7.setEnabled(true); break;
               case 8 : b8.setEnabled(true); break;
               case 9 : b9.setEnabled(true); break;
               case 10 : b10.setEnabled(true); break;
               case 11 : b11.setEnabled(true); break;
               case 12 : b12.setEnabled(true); break;
               case 13 : b13.setEnabled(true); break;
               case 14 : b14.setEnabled(true); break;
               case 15 : b15.setEnabled(true); break;
               case 16 : b16.setEnabled(true); break;
               case 17 : b17.setEnabled(true); break;
               case 18 : b18.setEnabled(true); break;
               case 19 : b19.setEnabled(true); break;
               case 20 : b20.setEnabled(true); break;
               case 21 : b21.setEnabled(true); break;
               case 22 : b22.setEnabled(true); break;
               case 23 : b23.setEnabled(true); break;
               case 24 : b24.setEnabled(true); break;
               case 25 : b25.setEnabled(true); break;
               case 26 : b26.setEnabled(true); break;
               case 27 : b27.setEnabled(true); break;
               case 28 : b28.setEnabled(true); break;
               case 29 : b29.setEnabled(true); break;
               case 30 : b30.setEnabled(true); break;
               case 31 : b31.setEnabled(true); break;
               case 32 : b32.setEnabled(true); break;
               case 33 : b33.setEnabled(true); break;
               case 34 : b34.setEnabled(true); break;
               case 35 : b35.setEnabled(true); break;
               case 36 : b36.setEnabled(true); break;
               case 37 : b37.setEnabled(true); break;
               case 38 : b38.setEnabled(true); break;
               case 39 : b39.setEnabled(true); break;
               case 40 : b40.setEnabled(true); break;
               case 41 : b41.setEnabled(true); break;
               case 42 : b42.setEnabled(true); break;
               case 43 : b43.setEnabled(true); break;
               case 44 : b44.setEnabled(true); break;
               case 45 : b45.setEnabled(true); break;
               case 46 : b46.setEnabled(true); break;
               case 47 : b47.setEnabled(true); break;
               case 48 : b48.setEnabled(true); break;
           }
           }
          }
           }
           else{JOptionPane.showMessageDialog(this,"Select Car Number !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Account Not Found !");
            System.out.println(ex.getMessage());
        }     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nseatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nseatActionPerformed

    private void ncarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncarActionPerformed
    
    }//GEN-LAST:event_ncarActionPerformed

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
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel indv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JComboBox<String> ncar;
    public javax.swing.JTextField nseat;
    // End of variables declaration//GEN-END:variables

public String journey()
{Reservation r12=new Reservation();
        String jo="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+login.id.getText()+"'AND tcode = '"+r12.getCode()+"' ");
           if(rs.next())
           {
               jo=rs.getString(3);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nt Found !");
            System.out.println(ex.getMessage());
        }
       return jo;

}
public String from()
{Reservation r12=new Reservation();
        String fr="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+login.id.getText()+"'AND tcode = '"+r12.getCode()+"' ");
           if(rs.next())
           {
               fr=rs.getString(12);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nt Found !");
            System.out.println(ex.getMessage());
        }
       return fr;

}
public String to()
{Reservation r12=new Reservation();
        String too="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+login.id.getText()+"'AND tcode = '"+r12.getCode()+"' ");
           if(rs.next())
           {
               too=rs.getString(13);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nt Found !");
            System.out.println(ex.getMessage());
        }
       return too;

}
public String date()
{Reservation r12=new Reservation();
        String dd="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE id='"+login.id.getText()+"'AND tcode = '"+r12.getCode()+"' ");
           if(rs.next())
           {
               dd=rs.getString(10);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Nt Found !");
            System.out.println(ex.getMessage());
        }
       return dd;

}

public double money()
{Reservation r12=new Reservation();
        String mone="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from users WHERE id='"+login.id.getText()+"'");
           if(rs.next())
           {
               mone=rs.getString(6);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Not Found !");
            System.out.println(ex.getMessage());
        }
       return Double.parseDouble(mone);
}
public double FCost(){double FCOST=Double.parseDouble(Cost())*discount(); return FCOST;}
public String Cost()
{Reservation r12=new Reservation();
        String cost="";
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from reservations WHERE tcode='"+r12.getCode()+"'");
           if(rs.next())
           {
               cost=rs.getString(5);
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Not Found !");
            System.out.println(ex.getMessage());
        }
if(BDate().equals(date())){cost="0";}

       return cost;
}
 public double discount()
{Reservation r12=new Reservation();
        String Age="",IsPensioner="",tra="",kilo="",DAY="",MONTH="",BDate="",pst=""; double d=1;
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from users WHERE id='"+login.id.getText()+"'");
           if(rs.next())
           {
           Age=rs.getString(4);
            IsPensioner = rs.getString(5);
            tra=rs.getString(7);
            kilo=rs.getString(8);
            DAY=rs.getString(9);
            MONTH=rs.getString(10);
            pst=rs.getString(11);
            BDate=DAY+"/"+MONTH+"/"+"2023";
           }
           else{JOptionPane.showMessageDialog(this,"Code Not Found !");}
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Not Found !");
            System.out.println(ex.getMessage());
        }
   if(Integer.valueOf(tra)>50||Double.valueOf(kilo)>10000){if(BDate.equals(date())){d=0;} else if(pst.equals(to())) {d=0.5;} else{d=0.20;}}
   else{
            if(IsPensioner.equals("f") && Integer.valueOf(Age) < 70){
                d=1;
            }
            else if(IsPensioner.equals("f") && Integer.valueOf(Age) > 70){
               d=0.50;
            }
            else if(IsPensioner.equals("t") && Integer.valueOf(Age) > 70){
              d=0.70;
            }
            else if(IsPensioner.equals("t") && Integer.valueOf(Age) < 70){
              d=0.20;
            }
   }
            return d;
}

    public Object BDate() {
        Reservation r12=new Reservation();
        String Age="",IsPensioner="",tra="",kilo="",DAY="",MONTH="",BDate="",pst=""; double d=1;
try { Connection c=connection.connect();
            Statement st=c.createStatement();
         ResultSet rs=st.executeQuery("select * from users WHERE id='"+login.id.getText()+"'");
           if(rs.next())
           {
            DAY=rs.getString(9);
            MONTH=rs.getString(10);
            BDate=DAY+"/"+MONTH+"/"+"2023";
           }}catch(SQLException e){System.out.println(e.getMessage());}
return BDate;
    }
   
}
