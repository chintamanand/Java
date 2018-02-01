/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author mahe
 */
public class Wrapperclass {

    /**
     * @param args the command line arguments
     */
    static int isprime(int n){
        int flag=0;
         if(n==0 || n==1){ 
             return 0;      
              }else{  
            for(int i=2;i<=n;i++){      
                if(n%i==0){      
                       return 0;
                   }  }//end of else  
                if(flag==0){ 
                  return n;
                } 
                else{
              return 0;
              }
                 }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=20;
        Integer i=Integer.valueOf(a);
        System.out.println("After converting the primitive value to the object value: "+i);
        //wrapper class mean converting the primitive into the object class and vice-versa.
        //In Autoboxing will automatically convert the primitive value into the object class
        Integer j=a;
        System.out.println("This AutoBoxing will convert into: "+j);
         System.out.println("");
        System.out.println("Here it will convert the object class into the primitive. ");
        System.out.println("");
        Integer k=new Integer(5);
        int b=k.intValue();
        System.out.println("Converting the object class into the primitive value: "+b);
        
        int k2=k;
        System.out.println("In Unboxing, the class will be converted into the primitive : "+k2);
        System.out.println("");
        double d=10.00;
        Double d1=d;
         System.out.println("This AutoBoxing will convert into: "+d1);
         
        int t=0,n=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        System.out.println("Enter the number 'n' to produce the sequence: ");
        n=scan.nextInt();
        int z[]=new int[n];
        int y[]=new int[n];
        for(i=0;i<n;i++){
          z[i]+=i;
          System.out.println(" "+z[i]);
          y[i]=isprime(z[i]);//isprime
          
        }
        
        while(t-->0 ){
             
        }
    }
    
}
