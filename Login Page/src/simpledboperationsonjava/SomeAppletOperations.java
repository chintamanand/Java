/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledboperationsonjava;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
public class SomeAppletOperations extends JFrame implements ActionListener{
    Button b1;
    TextField Username,Password;
    Label l1,l2;
    Container container=getContentPane();
     JCheckBox showPassword=new JCheckBox("Show Password");
      JButton resetButton=new JButton("RESET");
      JButton b12=new JButton("Login");
    public SomeAppletOperations()
    {
    l1=new Label("Enter Username: ");   
    l1.setBounds(50,150,100,30);
    Username=new TextField(10);
    Username.setBounds(150,150,150,30);
    l2=new Label("Enter Password: ");
    l2.setBounds(50,220,100,30);
    Password=new TextField(10);
    Password.setBounds(150,220,150,30);
    showPassword.setBounds(150,250,150,30);
    resetButton.setBounds(200,300,100,30);
    b12.setBounds(50,300,100,30);
    b12.addActionListener((ActionEvent ae) -> {
        String str1  =Username.getText();
        String str2 =Password.getText();
        if(str1.equals("admin")&&str2.equals("admin")){
            JOptionPane.showMessageDialog(null, "Login Successful!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Login Failed!!!");
        }
    });
    add(b12);
    add(Username);  
    add(Password);  
    add(l1);
    add(l2);
    add(showPassword);     
    add(resetButton);
    setSize(180, 180);  
    setLayout(null);
    setVisible(true);  
    }
    
    public void setLayoutManager()
   {
       container.setLayout(null);
   }
    
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        SomeAppletOperations s = new SomeAppletOperations(); 
        s.setTitle("Login Form");
        s.setVisible(true);
        s.setBounds(10,10,370,600);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == resetButton) {
            l1.setText("");
            l2.setText("");
        }}

    private void addActionEvent() {
       resetButton.addActionListener(this);
       // showPassword.addActionListener(this);
    }

    
    
}
