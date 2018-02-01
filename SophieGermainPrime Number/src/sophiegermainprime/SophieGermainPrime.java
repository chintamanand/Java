/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophiegermainprime;
import java.util.*;
import java.util.Scanner;
public class SophieGermainPrime {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int t=0;
        int n=0,j=2;
        int flag=0;
        int i=0;
         Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        while(t-->0 ){
        System.out.println("Enter the number 'n': ");
        n=scan.nextInt();
        int a[]=new int[n];//for result storage.
        int b[]=new int[n];
        int c[]=new int[n];
         
         for(i=0;i<n;i++){
          b[i]+=i;
           c[i]+=2*b[i]+1;
            System.out.println("Elements in b: "+b[i]);
            System.out.println("Elements in c: "+c[i]);
         }
        
            System.out.println("size of array-b: "+b.length);
            System.out.println("size of array-c: "+c.length);
        //if(isprime(n)!=isprime(n1)){
        for(j=2;j<n;j++){
            for(i=0;i<n;i++){       
            if(b[i]%j!=0 && c[i]%j!=0){// && (b[i]%j<=1 && c[i]%j<=1)
              //if it is a prime
                a[i]+=b[i];
                System.out.println("Printing the result"+a[i]);
              }
            else{
                a[i]+=0;
            }} }
        //}
        
        }
    }   }

