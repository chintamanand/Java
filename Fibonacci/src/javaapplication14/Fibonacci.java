/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author MAHE
 */
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
     int i;
     int a=0,b=1;
     int count;
     Scanner d=new Scanner(System.in);
     System.out.println("enter the number :");
      count=d.nextInt(); 
     System.out.println(":-0");
     System.out.println(":-1");
     for(i=2;i<=count;i++){
        int c=a+b;
       System.out.println(":-"+c);
       a=b;
       b=c;
     }
    }
    
}
