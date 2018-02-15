/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp;
import java.util.*;
public class OTP {
    
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of the password: ");    
    int n=scan.nextInt();
    Random rand=new Random();
    String org="0123456789";
    if(n==0){
     try{
      throw new Exception();
     }
     catch(Exception e){
     System.out.println("error"+e);
     }
    }
    if(n<=5 && n!=0){
    char otp[]=new char[n];
    for(int i=0;i<n;i++){
     otp[i]= org.charAt(rand.nextInt(org.length()));
    }
    System.out.println("Generated Password will be: ");
    for(int i=0;i<n;i++){
    System.out.print(otp[i]);}
    }
    else{
      String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String nor="abcdefghijklmnopqrstuvwxyz";
      String special="!@#$%^&*_=+-/.?<>)";
      
      String all=cap+nor+special+org;

      char otp[]=new char[n];
      for(int i=0;i<n;i++){
       otp[i]=all.charAt(rand.nextInt(all.length()));
      }
      System.out.println("Generated Password will be: ");
      for(int i=0;i<n;i++){
       System.out.print(otp[i]);
      }
     }
    
    }
    
}
