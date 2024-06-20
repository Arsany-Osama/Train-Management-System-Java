/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trainproject;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.sun.jndi.cosnaming.IiopUrl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import trainproject.ClassReserv;
import trainproject.Reset;
import trainproject.homepage;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Random;
import trainproject.ClassReserv;
import trainproject.homepage;
import trainproject.seats;

/**
 *
 * @author mark
 */
public class Reservation extends javax.swing.JFrame {
    ButtonGroup CarBus = new ButtonGroup(); //to creat a relationShip Between RadioButtons (bus and car)
    ButtonGroup One_Round = new ButtonGroup(); // relationShip Between (One_way and Round)
    
    /**
     * Creates new form ReservationList
     */
    public Reservation() {
        initComponents();

        //show current date to user 
        
        Date time = new Date();
        
        SimpleDateFormat SDF = new SimpleDateFormat("MMM-dd-YYYY"); 
        
        /*SimpleDateFormate is used to Formatting date (MMM ===> Month , dd ===> day , YYYY ====> Year)*/
        
        String convert = SDF.format(time);
        
        LabelDate.setText(convert); //because setText take String parameter
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ComboMyLocation = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ComboWhereToGo = new javax.swing.JComboBox<>();
        TextKilometers = new javax.swing.JTextField();
        TextCost = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ButtonCost1 = new javax.swing.JButton();
        RadioButtonOne_Way = new javax.swing.JRadioButton();
        round = new javax.swing.JRadioButton();
        LabelDate = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textAdddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        startime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        journey = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        arrivetime = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        durationtime = new javax.swing.JTextField();
        indivs = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        comboind = new javax.swing.JComboBox<>();
        asdfgh = new javax.swing.JLabel();
        rdays = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboMyLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "Alex", "Cairo", "Asyut", "Aswan" }));
        ComboMyLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMyLocationActionPerformed(evt);
            }
        });
        jPanel1.add(ComboMyLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 139, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 90, 30));

        ComboWhereToGo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "Alex", "Cairo", "Asyut", "Aswan" }));
        ComboWhereToGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboWhereToGoActionPerformed(evt);
            }
        });
        jPanel1.add(ComboWhereToGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 139, -1));

        TextKilometers.setEditable(false);
        TextKilometers.setText("0");
        TextKilometers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextKilometersActionPerformed(evt);
            }
        });
        jPanel1.add(TextKilometers, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 120, -1));

        TextCost.setEditable(false);
        TextCost.setText("0");
        TextCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCostActionPerformed(evt);
            }
        });
        jPanel1.add(TextCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 120, -1));

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("L.E");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, 27));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 380, -1, 27));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 759, 130, 40));

        ButtonCost1.setBackground(new java.awt.Color(102, 102, 102));
        ButtonCost1.setText("Search Train");
        ButtonCost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCost1ActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 120, 35));

        buttonGroup1.add(RadioButtonOne_Way);
        RadioButtonOne_Way.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        RadioButtonOne_Way.setText("One-Way");
        jPanel1.add(RadioButtonOne_Way, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, 100, 30));

        buttonGroup1.add(round);
        round.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        round.setText("Round");
        round.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundActionPerformed(evt);
            }
        });
        jPanel1.add(round, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 760, 100, 30));

        LabelDate.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        LabelDate.setForeground(new java.awt.Color(255, 255, 255));
        LabelDate.setText("0");
        LabelDate.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                LabelDateVetoableChange(evt);
            }
        });
        jPanel1.add(LabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 147, 31));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        jPanel1.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 139, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..", "VIP", "First Class", "Second Class", "Noraml Class" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, -1));

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("K.m");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, 27));

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("/");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 10, 20));

        textAdddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAdddressActionPerformed(evt);
            }
        });
        jPanel1.add(textAdddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 260, -1));

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 10, 27));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 139, -1));

        startime.setEditable(false);
        startime.setText("0");
        jPanel1.add(startime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 120, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hrs.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 30, 20));

        journey.setEditable(false);
        journey.setText("0");
        journey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journeyActionPerformed(evt);
            }
        });
        jPanel1.add(journey, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 120, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Train no. :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel16.setText("2024");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Kilometers :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cost :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Start time :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, 20));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Arrive time :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        arrivetime.setEditable(false);
        arrivetime.setText("0");
        jPanel1.add(arrivetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 120, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Time Duration");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, 20));

        durationtime.setEditable(false);
        durationtime.setText("0");
        jPanel1.add(durationtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 120, -1));

        indivs.setEditable(false);
        indivs.setText("1");
        indivs.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(indivs, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 120, -1));
        indivs.getAccessibleContext().setAccessibleParent(this);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Individuals :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 80, 20));

        comboind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48" }));
        comboind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboindActionPerformed(evt);
            }
        });
        jPanel1.add(comboind, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 100, -1));

        asdfgh.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        asdfgh.setForeground(new java.awt.Color(240, 240, 240));
        asdfgh.setText("Remain Days :");
        jPanel1.add(asdfgh, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, -1, 20));

        rdays.setEditable(false);
        rdays.setText("0");
        rdays.setRequestFocusEnabled(false);
        jPanel1.add(rdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 120, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Date :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 80, 30));

        date.setEditable(false);
        date.setText("0/0/2023");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 120, 30));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Ticket Code :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        code.setEditable(false);
        code.setText("0");
        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 120, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainproject/images/Reservation design.png"))); // NOI18N
        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void LabelDateVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_LabelDateVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelDateVetoableChange

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void roundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundActionPerformed

    private void ButtonCost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCost1ActionPerformed

      if(RadioButtonOne_Way.isSelected() == false && round.isSelected() == false){
            JOptionPane.showMessageDialog(this, "One_way or Round?");
        }
        else if(type.getSelectedItem().toString().equals("..")){JOptionPane.showMessageDialog(this, "Choose Train Type");}
        else if(day.getSelectedItem().toString().equals("Day")||month.getSelectedItem().toString().equals("Month")){JOptionPane.showMessageDialog(this,"Select Date you want travel in");}
        else{
        String m=ComboMyLocation.getSelectedItem().toString();
        String t=ComboWhereToGo.getSelectedItem().toString();
        String d=day.getSelectedItem().toString();
        String mon=month.getSelectedItem().toString();
        String c=type.getSelectedItem().toString();
        Reservation polymer=new ClassReserv();
        ClassReserv c1=new ClassReserv();
        ClassReserv c2=new ClassReserv(c1.getKilometers(m,t),RadioButtonOne_Way.isSelected() );
        ClassReserv c3=new ClassReserv(c1.getCost(m,t), c,RadioButtonOne_Way.isSelected(),round.isSelected());
        
      int indv=Integer.parseInt(comboind.getSelectedItem().toString());
        double cost=c3.getcost(); double FinalCost=cost*indv;
        int stime=c1.getsTime(m, t); int atime=c1.getaTime(m, t); int dtime=atime-stime;
        String sstime="",aatime="";

      if(stime>12) {sstime=(stime-12)+" PM";}
        else if(stime==12){sstime=12+":00";}
        else sstime=stime+" AM";
      if(atime>12) {aatime=(atime-12)+" PM";}
        else if(atime==12){aatime=12+":00";}
        else aatime=atime+" AM";
       
        generateRandomCode();
        code.setText(getCode());
        journey.setText(String.valueOf(c1.getJourneyNo(m, t)));
        TextKilometers.setText(String.valueOf(c2.getKilometers()));
        TextCost.setText(String.valueOf(FinalCost));
        startime.setText(sstime);
        arrivetime.setText(aatime);
        durationtime.setText(String.valueOf(dtime));
        indivs.setText(comboind.getSelectedItem().toString());
        date.setText(d+"/"+mon+"/"+"2024");
       
          Date time = new Date(); 
        
            SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/YYYY");  
            /*SimpleDateFormate is used to Formatting date (MM ===> Month (number) , dd ===> day , YYYY ====> Year)*/
            
            String currectDate = SDF.format(time); // Convert From time Object To Readable date String 

            Date time2 = new Date(2024-1900,Integer.parseInt(mon),Integer.parseInt(d));
            String ReservationDate = SDF.format(time2); // Convert from ReservationDate object to Readable date String 
            
            DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate d1 = LocalDate.parse(currectDate , formate1);
            LocalDate d2 = LocalDate.parse(ReservationDate , formate1);
            
            long daysBetween = ChronoUnit.DAYS.between(d1, d2); /* long datatype because DAYS.between return long(the difference between days) note: ChronoUnit.DAYS.between return negative or positive number  negative number means the first date is less than the second datepositive number means the first date is bigger than the second date*/
     long db=daysBetween-30;
            rdays.setText(ReservationDate);
            
            if(db >= 0){
                rdays.setText(String.valueOf(db-1));
            }
            else{ // if daysBetween return negative number
                JOptionPane.showMessageDialog(this, "Select Future Date!");
           // rdays.setText(String.valueOf(db * -1)); //convert to positive number
            }
        }
        
    }//GEN-LAST:event_ButtonCost1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String d=day.getSelectedItem().toString();
        String mon=month.getSelectedItem().toString();
        Date time = new Date(); 
            SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/YYYY");  
            String currectDate = SDF.format(time);
            Date time2 = new Date(2024-1900,Integer.parseInt(mon),Integer.parseInt(d));
            String ReservationDate = SDF.format(time2);
            DateTimeFormatter formate1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            LocalDate d1 = LocalDate.parse(currectDate , formate1);
            LocalDate d2 = LocalDate.parse(ReservationDate , formate1);
        long daysBetween = ChronoUnit.DAYS.between(d1, d2); /* long datatype because DAYS.between return long(the difference between days) note: ChronoUnit.DAYS.between return negative or positive number  negative number means the first date is less than the second datepositive number means the first date is bigger than the second date*/
     long db=daysBetween-30;
            rdays.setText(String.valueOf(db));
            
        String m=ComboMyLocation.getSelectedItem().toString();
        String t=ComboWhereToGo.getSelectedItem().toString();
        String c=type.getSelectedItem().toString();
if(RadioButtonOne_Way.isSelected() == false && round.isSelected() == false){
            JOptionPane.showMessageDialog(this, "One_way or Round?");
        }
else if( (m.equals("Alex")&&t.equals("Alex")) || (m.equals("Cairo")&&t.equals("Cairo")) || (m.equals("Giza")&&t.equals("Giza")) || (m.equals("Aswan")&&t.equals("Aswan")) || (m.equals("..")&&t.equals("..")) )
        {JOptionPane.showMessageDialog(this, "Please Select Different Areas");}
else if(day.getSelectedItem().toString().equals("Day")||month.getSelectedItem().toString().equals("Month")){JOptionPane.showMessageDialog(this, "Enter Specific Date");}
else if (c.equals("..")){JOptionPane.showMessageDialog(this, "Enter Train Type");}
else if(textAdddress.getText().isEmpty()){JOptionPane.showMessageDialog(this, "Enter your Address!");}
else if(journey.getText().equals("0")||TextKilometers.getText().equals("0")||TextCost.getText().equals("0")||startime.getText().equals("0")||arrivetime.getText().equals("0")||durationtime.getText().equals("0"))
        {JOptionPane.showMessageDialog(this, "Extract Reservation Data");}
else if (db<=0){JOptionPane.showMessageDialog(this, "Select Future Date!");}
else {
    String id=login.id.getText();
    String one=code.getText();
    String two=journey.getText();
    String three=TextKilometers.getText();
    String four=TextCost.getText();
    String five=startime.getText();
    String six=arrivetime.getText();
    String seven=durationtime.getText();
    String eight=indivs.getText();
    String nine=date.getText();
    String ten=String.valueOf(db);
    String n11=m;
    String n12=t;
    String n13=c;
    String n15="";
    String n14=textAdddress.getText();
    if(RadioButtonOne_Way.isSelected() == true){n15="OneWay";}
    else{n15="Round";}
    next(id,one,two,three,four,five,six,seven,eight,nine,ten,n11,n12,n13,n14,n15);
  seats s=new seats(); dispose(); s.setVisible(true);

     }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void TextCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCostActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_TextCostActionPerformed

    private void TextKilometersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextKilometersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextKilometersActionPerformed

    private void ComboWhereToGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboWhereToGoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboWhereToGoActionPerformed

    private void ComboMyLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMyLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMyLocationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        homepage h=new homepage();
        dispose();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textAdddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAdddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAdddressActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void journeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_journeyActionPerformed

    private void comboindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboindActionPerformed

    
  
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
               
            }
         
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ButtonCost1;
    public javax.swing.JComboBox<String> ComboMyLocation;
    public javax.swing.JComboBox<String> ComboWhereToGo;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JRadioButton RadioButtonOne_Way;
    public javax.swing.JTextField TextCost;
    public javax.swing.JTextField TextKilometers;
    private javax.swing.JTextField arrivetime;
    private javax.swing.JLabel asdfgh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField code;
    private javax.swing.JComboBox<String> comboind;
    private javax.swing.JTextField date;
    public javax.swing.JComboBox<String> day;
    private javax.swing.JTextField durationtime;
    private javax.swing.JTextField indivs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField journey;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JTextField rdays;
    private javax.swing.JRadioButton round;
    private javax.swing.JTextField startime;
    public javax.swing.JTextField textAdddress;
    public javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
static String thiscode="";
    public static String generateRandomCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        thiscode=sb.toString();
        return sb.toString();
    }

public String getCode() {
        return this.thiscode;
    }

   private void next(String id,String tcode ,String journey, String kilo,String cost,String stime,String atime,String duration,String ind,String Date,String rdays,String from,String to,String type,String address,String way) 
    {
        Connection c=connection.connect();
       if(c!=null)
       {
        try {
            PreparedStatement st=c.prepareStatement("INSERT INTO `reservations`(`id`, `tcode`, `journey`, `kilometers`, `cost`, `stime`, `atime`, `duration`, `individuals`, `Date`, `rdays`, `tfrom`, `tto`, `type`, `Address`, `way`)VALUES ('"+id+"','"+tcode+"','"+journey+"','"+kilo+"','"+cost+"','"+stime+"','"+atime+"','"+duration+"','"+ind+"','"+Date+"','"+rdays+"','"+from+"','"+to+"','"+type+"','"+address+"','"+way+"')");
            int res=st.executeUpdate();
            
            
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
               
                                     }
       }else {JOptionPane.showMessageDialog(this,"No Connection!");}
    }
}