/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlistexample;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
public class JListExample extends JFrame implements ActionListener{
     JFrame f;
     JButton b;
     public JListExample(String s){
         f=new JFrame("Sample");
     DefaultListModel<String> l=new DefaultListModel<>();
        l.addElement("India");
        l.addElement("USA");
        l.addElement("France");
        l.addElement("Germany");
        
        JList<String> list1=new JList<>(l);
        list1.setBounds(100,100, 75,75);  
        
        b=new JButton("Click");
        b.setBounds(200,100,75,20);
        b.addActionListener((ActionListener)this);
        
        
        f.add(b);
        f.add(list1);
        
        //String data=list.getSelectedValue();
        f.setLayout(null);
        f.setSize(400,400);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
     }
      
   
    public static void main(String[] args) {
        // TODO code application logic here
        new JListExample("JList Sample");
        
    }
@Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b){
           String data="";
           data="The value clicked will be: ";
          // int n=list.getSelectedIndex();
        data+=list1.getSelectedValue();    
           
        JOptionPane.showMessageDialog(this,data);
       }
    }
    
}
