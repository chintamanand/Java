/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingmenu;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
public class JavaSwingMenu extends JFrame implements ActionListener{
    JFrame f;
    JMenu menu;
    JMenu submenu;
    JMenuBar mb;
    JMenuItem m1,m2,m3,m4;
    //JButton b;
    public JavaSwingMenu(){
        f=new JFrame("Sample");
        mb=new JMenuBar();
        menu=new JMenu("Menu");  
        submenu=new JMenu("Sub Menu"); 
        
        m1=new JMenuItem("Pen");        
        m4=new JMenuItem("Pencil"); 
        m3=new JMenuItem("noteBook"); 
        m2=new JMenuItem("Eraser"); 
        
        f.setJMenuBar(mb);
        mb.add(menu);
        menu.add(submenu); 
        menu.add(m1);
        menu.add(m2);
        submenu.add(m3);
        submenu.add(m4);
        
        f.setLayout(null);
        f.setSize(400,400);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaSwingMenu();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
    
}
