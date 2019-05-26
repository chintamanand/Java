/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ropecutting;
import java.util.*;

/**
 *
 * @author mahe
 */

public class Ropecutting {
    static int minvalue(int a[]) {
        int small=100000000;
          for(int i=0; i<a.length; i++)
       {
           if(small > a[i])
           {
               small = a[i];
           }
           
       }
return small;
      }
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int d=scan.nextInt();
        while(d-->0){
        
            System.out.println("enter size of the array:");
            int n=scan.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            System.out.println("enter element in the array:");
            for(i=0;i<n;i++){
            a[i]=scan.nextInt();
            }
           // int b[]=new int[n];
            Arrays.sort(a);
            for(i=0;i<n;i++){
            System.out.println("After sorting the array with the .sort function:"+a[i]);
            }
           int min1=a[0];
           int count=0;
            System.out.println(min1+" this value is not used ever!!!");
           // int min2=0;
       
       //give the function call to this 
            
      //while(small >= 0){
       for(i=0;i<n;i++){
          // System.out.println("before subtraction"+a[i]);
           int small=minvalue(a);
           for(int j=0;j<a.length;j++){
                a[j]=a[j]-small;
      
     //  System.out.println("Array after subtraction"+a[i]);
       
if(a[j]>0){
       count++; }
       System.out.print(count + " ");
      }
       if(count == 0) 
           break;
	
       }}
    }
    
}
