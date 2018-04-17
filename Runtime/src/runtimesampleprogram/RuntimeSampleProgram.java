/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package runtimesampleprogram;
import java.util.*;
public class RuntimeSampleProgram {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Runtime.getRuntime().exec("notepad");
        System.out.println("All the availble processor running:"+Runtime.getRuntime().availableProcessors());
        //shutdown system
        //Runtime.getRuntime().exec("shutdown -s -t 0");
        //Runtime.getRuntime().exec("shutdown -r -t 0");//Restart system
         Runtime r=Runtime.getRuntime();  
  System.out.println("Total Memory: "+r.totalMemory());  
  System.out.println("Free Memory: "+r.freeMemory());  
    
  for(int i=0;i<10000;i++){  
   new RuntimeSampleProgram(); 
      //annoynmous creation of object -->so,this is the garbage
  }  
  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
  System.gc();  
  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
    }}
