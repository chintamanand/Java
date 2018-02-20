/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
public class Notepad extends JFrame implements ActionListener{
    JFrame f;
    JTextArea a;
    JMenu file;
    JMenu edit;
    JMenu Help;
    JMenuItem new1;
    JMenuItem cut;
    JMenuItem copy;
    JMenuItem paste;
    JMenuItem selectall;
    JMenuBar mb;
    
    public Notepad(){
    f=new JFrame("Notepad");
    
    mb=new JMenuBar();
    file=new JMenu("File");    
    edit=new JMenu("Edit");    
    Help=new JMenu("Help");
    
    new1=new JMenuItem("New");
    file.add(new1);
    
    cut=new JMenuItem("Cut");
    edit.add(cut);
    
    copy=new JMenuItem("Copy");
    edit.add(copy);
    
    paste=new JMenuItem("Paste");
    edit.add(paste);
    
    selectall=new JMenuItem("Selectall");
    edit.add(selectall);
    
    a=new JTextArea();    
    a.setBounds(5,5,360,320); 
     
    edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectall);    
    mb.add(file);mb.add(edit);mb.add(Help);    
    
    f.add(a);
    
    cut.addActionListener((ActionListener)this);    
    copy.addActionListener((ActionListener)this);    
    paste.addActionListener((ActionListener)this);    
    selectall.addActionListener((ActionListener)this);  
    
    f.setJMenuBar(mb); 
    f.setLayout(null);
    f.setSize(600,600);  
    f.setVisible(true);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
       if(e.getSource()==cut)    
        a.cut();    
       if(e.getSource()==paste)    
        a.paste();    
       if(e.getSource()==copy)    
        a.copy();    
       if(e.getSource()==selectall)    
      a.selectAll();   }
    
}
