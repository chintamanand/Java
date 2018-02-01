/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromedeciandbinary;
import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author mahe
 */
public class Palindromedeciandbinary {
   static boolean isplaindrome(int n){
     int r,sum=0,temp;      
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum){ 
      return true; 
  }
  else    {
   return false;    
  }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int temp=0;
        int sum=0;
        int n=0;
          Boolean result= true;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        while(t-->0){
        System.out.println("enter the number to check: ");
        n=scan.nextInt();
         int b=Integer.parseInt(String.valueOf(Integer.toString(n,2)));
          
         
          if(isplaindrome(n) && isplaindrome(b)){
          System.out.println(" 1 ");
          }else{
            System.out.println(" 0 ");  
          }
          }
         System.out.println(4+1.0f);
    }}
    

