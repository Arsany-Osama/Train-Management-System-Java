/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainproject;

import trainproject.Reservation;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
interface time{public int getaTime(String m,String t); public int getsTime(String m,String t);  }
abstract class count implements time{public abstract void c();}
public class ClassReserv extends Reservation implements time{
    private double kilometers,cost;
    private boolean oneway,round;
    String clas;
        public ClassReserv() {
    }
    public ClassReserv  (double kilometers, boolean oneway) {

      //  this.oneway = oneway;
        if(oneway==false)
        {this.kilometers=kilometers*2;
        }
        else if(oneway==true)
        this.kilometers = kilometers;
        else  {JOptionPane.showMessageDialog(this, "Enter way type"); this.kilometers=0;}
    }
     public ClassReserv(double cost, String clas,boolean oneway,boolean round) {
        if(round==true)
        {
         switch (clas)
         {
         case "VIP" : this.cost=((cost*0.5)+cost)*2.0;           break;
         case "First Class" :this.cost=((cost*0.25)+cost)*2.0;   break;
         case "Second Class" : this.cost=((cost*0.05)+cost)*2.0; break;
         case "Noraml Class" : this.cost=(cost)*2.0;             break;
         }
        }
        else if (oneway==true)
         {
         switch (clas)
         {
         case "VIP" : this.cost=(cost*0.5)+cost;           break;
         case "First Class" :this.cost=(cost*0.25)+cost;   break;
         case "Second Class" : this.cost=(cost*0.05)+cost; break;
         case "Noraml Class" : this.cost=cost;             break;
         }
         
        }
        else  { this.cost=0;}
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOneway(boolean oneway) {
        this.oneway = oneway;
    }
public double getKilometers()
{return kilometers;}
public double getcost()
{return cost;}
    public void setClas(String clas) {
        this.clas = clas;
    }
    public int getJourneyNo(String m,String t)
    {
     if(m.equals("Alex") && t.equals("Asyut")){
         return 1; 
        }
        else if(m.equals("Asyut") && t.equals("Alex")){
             return 2;
        }
        else if(m.equals("Alex") && t.equals("Cairo")){
             return 1;
        }
        else if(m.equals("Cairo") && t.equals("Alex")){
             return 2;
        }
        else if(m.equals("Alex") && t.equals("Aswan")){
            return 1;
        }
        else if(m.equals("Aswan") && t.equals("Alex")){
             return 2;
        }
        else if(m.equals("Aswan") && t.equals("Cairo")){
             return 2;
        }
        else if(m.equals("Cairo") && t.equals("Aswan")){
             return 1;
        }
        else if(m.equals("Aswan") && t.equals("Asyut")){
            return 2;
        }
        else if(m.equals("Asyut") && t.equals("Aswan")){
             return 1;
        }
        else if(m.equals("Asyut") && t.equals("Cairo")){
             return 2;
        }
        else if(m.equals("Cairo") && t.equals("Asyut")){
             return 1;
        }
        else return 0;
    }
     public int getsTime(String m,String t)
    {
        if(getJourneyNo(m, t)==1)
        {
         if(m.equals("Alex")){
         return 7; 
        }
        else if(m.equals("Cairo")){
             return 10;
        }
        else if(m.equals("Asyut")){
             return 15;
        }else if(m.equals("Aswan")){
             return 23;
        }
        else return 0;
        }
        else if(getJourneyNo(m, t)==2)
        {
                 if(m.equals("Aswan")){
         return 7; 
        }
        else if(m.equals("Asyut")){
             return 15;
        }
        else if(m.equals("Cairo")){
             return 20;
        }else if(m.equals("Alex")){
             return 23;
        }
        else return 0;
        }
        else return 0;
    }
     
      public int getaTime(String m,String t)
    {
    if(getJourneyNo(m, t)==1)
        {
         if(t.equals("Alex")){
         return 7; 
        }
        else if(t.equals("Cairo")){
             return 10;
        }
        else if(t.equals("Asyut")){
             return 15;
        }else if(t.equals("Aswan")){
             return 23;
        }
        else return 0;
        }
        else if(getJourneyNo(m, t)==2)
        {
                 if(t.equals("Aswan")){
         return 7; 
        }
        else if(t.equals("Asyut")){
             return 15;
        }
        else if(t.equals("Cairo")){
             return 20;
        }else if(t.equals("Alex")){
             return 23;
        }
        else return 0;
        }
        else return 0;
    }

    public double getKilometers(String m,String t) {
             if(m.equals("Alex") && t.equals("Asyut")){
         return kilometers=594.4; 
        }
        else if(m.equals("Asyut") && t.equals("Alex")){
             return kilometers=594.4;
        }
        else if(m.equals("Alex") && t.equals("Cairo")){
             return kilometers=213.5;
        }
        else if(m.equals("Cairo") && t.equals("Alex")){
             return kilometers=213.5;
        }
        else if(m.equals("Alex") && t.equals("Aswan")){
            return kilometers=1058.7;
        }
        else if(m.equals("Aswan") && t.equals("Alex")){
             return kilometers=1058.7;
        }
        else if(m.equals("Aswan") && t.equals("Cairo")){
             return kilometers=850.27;
        }
        else if(m.equals("Cairo") && t.equals("Aswan")){
             return kilometers=850.27;
        }
        else if(m.equals("Aswan") && t.equals("Asyut")){
            return kilometers=507.8;
        }
        else if(m.equals("Asyut") && t.equals("Aswan")){
             return kilometers=507.8;
        }
        else if(m.equals("Asyut") && t.equals("Cairo")){
             return kilometers=375.6;
        }
        else if(m.equals("Cairo") && t.equals("Asyut")){
             return kilometers=375.6;
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Select Different Areas");
            return kilometers=0;
        }
        
    }

    public double getCost(String m,String t) {
       
        if(m.equals("Alex") && t.equals("Asyut")){
         return cost=110;
        }
        else if(m.equals("Asyut") && t.equals("Alex")){
             return cost=110;
        }
        else if(m.equals("Alex") && t.equals("Cairo")){
             return cost=58;
        }
        else if(m.equals("Cairo") && t.equals("Alex")){
             return cost=58;
        }
        else if(m.equals("Alex") && t.equals("Aswan")){
            return cost=180;
        }
        else if(m.equals("Aswan") && t.equals("Alex")){
             return cost=180;
        }
        else if(m.equals("Aswan") && t.equals("Cairo")){
             return cost=136;
        }
        else if(m.equals("Cairo") && t.equals("Aswan")){
             return cost=136;
        }
        else if(m.equals("Aswan") && t.equals("Asyut")){
            return cost=85;
        }
        else if(m.equals("Asyut") && t.equals("Aswan")){
             return cost=85;
        }
        else if(m.equals("Asyut") && t.equals("Cairo")){
             return cost=75;
        }
        else if(m.equals("Cairo") && t.equals("Asyut")){
             return cost=75;
        }
        else{
           // JOptionPane.showMessageDialog(this, "Please Select Different Areas");
            return cost=0;
        }
    }

    public boolean isOneway() {
        return oneway;
    }

    public String getClas() {
        return clas;
    }
    
    
    
}
