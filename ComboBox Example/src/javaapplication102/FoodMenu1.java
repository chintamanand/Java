/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication102;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
public class FoodMenu1 extends JFrame implements ActionListener{
        JFrame f1;
        JComboBox cb;
        JLabel l2;
        JButton b;
    public FoodMenu1(){
        f1=new JFrame("COuntry Selection-1");
        
        String Country[]={"India","USA","UK","Srilanka","Africa"};
        l2 = new JLabel("Please Select ur Country ");
        l2.setBounds(50,50,300,20);   
        
        cb=new JComboBox(Country);
        cb.setBounds(50, 100,90,20);
        
        b=new JButton("OK");
        b.setBounds(200,100,75,20);
        b.addActionListener((ActionListener)this);
        
        f1.add(b);
        f1.add(cb);
        f1.add(l2);
        setLayout(null);
        setSize(400,400);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    // TODO code application logic here
     new FoodMenu1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         float amount=0;  
         String msg="";  
         if(ae.getSource()==b){
           msg=(String) cb.getItemAt(cb.getSelectedIndex());
           JOptionPane.showMessageDialog(this, msg);
          }
             
         }
    }
    

