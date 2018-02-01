/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Samplethread extends Thread {
    public void run(){
     System.out.println("The Thread is Running...!!!");
     for(int i=0;i<5;i++){
         try {
             Thread.sleep(600);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
      System.out.println(i);
     }
     if(Thread.currentThread().isDaemon()){
     System.out.println("The Current thread is Daemon Thread!!");
     }
     else{
     System.out.println("It is not a daemon Thread!");
     }
      System.out.println("It gives the name of the current excuting Thread:"+Thread.currentThread().getName());
      System.out.println("The priority of currently excuting thread :"+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        // TODO code applicationlogic here
        Samplethread s=new  Samplethread();
        Samplethread s1=new Samplethread();
        Samplethread s2=new Samplethread();
        s.start();//here it will start the thread.
        //once the thread is start -->it will go to the running state.
       
        try{
            s.start();
        }
        catch(IllegalThreadStateException e){
        System.out.println("The Same thread s called for second time. Here the thread can't be start for twice it lead to Exception.");
        }
        try{
        s.join();
        }catch(Exception e){
        System.out.println(e);
        }
        s1.setDaemon(true);
        s1.start();
        s1.setPriority(MIN_PRIORITY);
        
        s2.start();
        s2.setPriority(MAX_PRIORITY);
        //as u check the output, it is due to sleep()-->as one thread is sleeping,the java scheduler picks the other 
        //thread in order the efficient usage of OS.
       
        System.out.println("If u call the Run() method dirctly from the main method then it will lose context-switching");
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getState());
        s1.setName("thread-sample0");
        System.out.println("After setting the name:"+s1.getName());
        System.out.println("It gives the name of the current excuting Thread:"+Thread.currentThread().getName()); 
        
    }
    
}
