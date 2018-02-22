
package foodmenu;

import java.awt.Frame;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FoodMenu extends JFrame implements ActionListener{
    
JFrame f;
JCheckBox j1;
JCheckBox j2;
JCheckBox j3;
JCheckBox j4;
JCheckBox j5;
JCheckBox j6;
JLabel l1;
JButton b1;
    public FoodMenu(){
        f=new JFrame("Food Menu");
        
        l1=new JLabel("Please Select ur Menu: ");
        l1.setBounds(50,50,300,20);   
        
        j1=new JCheckBox("Briyani        : 100/-");
        j1.setBounds(100,100,150,20);
        
        j2=new JCheckBox("Mutton Briyani : 200/-");
        j2.setBounds(100,150,150,20);
        
        j3=new JCheckBox("Fish Curry     : 200/-");
        j3.setBounds(100,200,150,20);
        
        j4=new JCheckBox("Chicken Curry  : 150/-");
        j4.setBounds(100,250,150,30);
        
        j5=new JCheckBox("Mutoon Curry   : 220/-");
        j5.setBounds(100,300,150,30);
        
        j6=new JCheckBox("Fish Fry       : 100/-");
        j6.setBounds(100,350,150,30);
        
         JButton b=new JButton("Order It");  
        b.setBounds(100,550,150,30);  
        b.addActionListener((ActionListener)this);  
        
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        f.add(j5);
        f.add(j6);
        f.add(b1);
        f.add(l1);
        f.setLayout(null);
        f.setSize(400,400);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    // TODO code application logic here
     new FoodMenu();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         float amount=0;  
        String msg="";  
        if(ae.getSource()){
        if(j1.isSelected()){  
            amount+=100;  
            msg="Briyani : 100\n";  
        }  
        if(j2.isSelected()){  
            amount+=30;  
            msg+="Mutton Briyani: 200\n";  
        }  
        if(j3.isSelected()){  
            amount+=10;  
            msg+="Fish Curry : 200\n";  
        } 
        if(j4.isSelected()){  
            amount+=10;  
            msg+="Chicken Curry: 150\n";  
        } 
        if(j5.isSelected()){  
            amount+=10;  
            msg+="Mutoon Curry: 220\n";  
        } 
        if(j6.isSelected()){  
            amount+=10;  
            msg+="Fish Fry  : 100\n";  
        } 
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount); 
    }}}
