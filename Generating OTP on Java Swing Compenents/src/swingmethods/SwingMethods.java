/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingmethods;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingMethods extends Frame implements ActionListener{
    JFrame f1;
    JButton b1;
    JLabel l1;
    JLabel l2;
    JTextField t;
    JTextArea a;
    JTextField t2;
    JLabel l3;
    JPasswordField pass;   
    public SwingMethods(){
    f1=new JFrame("Sample-1");
    
    //t=new JTextField();
    //t.setBounds(50,100, 100,30);
    
    a=new JTextArea();
    a.setBounds(150,200,250,200);
    
    pass=new JPasswordField();
    pass.setBounds(600,100,75,30);
    l1=new JLabel("Character Count: ");  
    l1.setBounds(50,50,300,30);  
    
    l2=new JLabel("Word Count: ");
    l2.setBounds(250,50,300,30);
    
    b1=new JButton("Click Here!!");
    b1.setBounds(150,450,100,30);
    b1.addActionListener((ActionListener)this);
    
    l3=new JLabel("Length of Password");
    l3.setBounds(450,50,150,30);
    
    t2=new JTextField();
    t2.setBounds(600,50 , 75, 30);
    f1.add(t2);
    f1.add(b1);
    
    f1.add(pass);
    f1.add(l1);
    f1.add(l2);
    f1.add(l3);
    f1.add(a);
    
    f1.setLayout(null);
    f1.setSize(300, 300);
    f1.setVisible(true);
    
    double x=f1.getAlignmentX();
    Boolean a1=f1.isVisible();
    //JOptionPane.showMessageDialog(this,"Isframe Is visible:- "+a1); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new SwingMethods();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1){
      String t12=a.getText();
      String words[]=t12.split("\\s");
      
      l1.setText("Character Count: "+t12.length());//Character count
      l2.setText("word count: "+words.length);//word count
     }
     String t1=a.getText();
     if(e.getSource()==b1){
      if(t1.isEmpty()){
         try{  
        JOptionPane.showMessageDialog(this,"Text Area Has no value in it!!!");
        }
      catch(Exception x){
          System.out.println(x);
      }}
         else{
                 JOptionPane.showMessageDialog(this,"Vaild Entry!!");
                 }
    }
     if(e.getSource()==b1){
      String org="0123456789";
      String l=t2.getText();
      int n=Integer.parseInt(l);
      if(n<=0){
       try{
        JOptionPane.showMessageDialog(this,"TextField Has no value!!!");
       }
       catch(Exception ex){
       JOptionPane.showMessageDialog(this,ex);
       }
      }
      Random rand=new Random();
      char otp[]=new char[n];
      for(int i=0;i<n;i++){
      otp[i]=org.charAt(rand.nextInt(org.length()));
      }
      String str="";
      str=Arrays.toString(otp);
      JOptionPane.showMessageDialog(this,"Generated OTP will be: "+str);
     }
     
     if(e.getSource()==b1){
      String g=t2.getText();
      if(g.equals("0")){
       JOptionPane.showMessageDialog(this,"Enter the Correct value");

      }
     }
         
}

}
