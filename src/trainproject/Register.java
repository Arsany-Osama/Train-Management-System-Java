
package trainproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Month = new javax.swing.JComboBox<>();
        Day = new javax.swing.JComboBox<>();
        PreferredStation = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        no = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        yes = new javax.swing.JRadioButton();
        pass = new javax.swing.JPasswordField();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, -1, -1));

        Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        PreferredStation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "Alex", "Cairo", "Asyut", "Aswan" }));
        getContentPane().add(PreferredStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 700, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 228, 30, -1));

        buttonGroup1.add(no);
        no.setText("No");
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        age.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 260, 40));

        buttonGroup1.add(yes);
        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        getContentPane().add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, -1));

        pass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 260, 40));

        id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 260, 40));

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 260, 40));

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 680, 130, 40));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainproject/Main Register design.png"))); // NOI18N
        jLabel1.setText("Yes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1100, 810));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 120, 150));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        login l=new login();
        dispose();
        l.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
              String user=name.getText();
        String password= String.valueOf(pass.getPassword());
        String Id=id.getText();
        String Age=age.getText();
        String b;
        if(yes.isSelected()==true)
        { b="t";}
        else {b="f";}
        
        if(user.isEmpty()||password.isEmpty()||Id.isEmpty()|| (yes.isSelected()==false && no.isSelected()==false))
        {
        JOptionPane.showMessageDialog(this,"Data Not Completed");
        }
        else
        {
        userLogin(Id, user, password,Age,b);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Day;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JComboBox<String> PreferredStation;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton no;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton register;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables

   private void userLogin(String Id, String user, String password,String Age,String b) 
    {
        Connection c=connection.connect();
       if(c!=null)
       {
        try {
            PreparedStatement st=c.prepareStatement("INSERT INTO users (id,name,password,age,pensioner,Day,Month,PreferredSt) VALUES(?,?,?,?,?,?,?,?)");
       
            st.setString(1,Id);
            st.setString(2,user);
            st.setString(3, password);
            st.setString(4, Age);
            st.setString(5,b);
              String value2 = Day.getSelectedItem().toString();
            st.setString(6, value2);
            String value = Month.getSelectedItem().toString();
            st.setString(7, value);
            String value3 = PreferredStation.getSelectedItem().toString();
            st.setString(8, value3);
            int res=st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Account Stored");
            
            {}
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
               JOptionPane.showMessageDialog(this,"This ID used before");
                                     }
       }else {JOptionPane.showMessageDialog(this,"No Connection!");}
    }
}

    
 
  

