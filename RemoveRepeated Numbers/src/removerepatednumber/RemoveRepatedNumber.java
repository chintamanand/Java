/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removerepatednumber;
import java.util.*;
import java.util.Scanner;

public class RemoveRepatedNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        int count=0;
        Boolean result= true;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int index=0;
        while(t-->0){
        System.out.println("enter the size of the array: ");
        n=scan.nextInt();
        System.out.println("Enter the Integer values for array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]+=scan.nextInt();
        }
        //int b[]=Arrays.copyOfRange(a, 0, n);
        //System.out.println("Elements copied from a to b array: "+b);
         for(int i=0;i<n-1;i++){
          if(a[i+1]-a[i]==0){
            index=i;
            for(i=index;i<n-1;i++){//removes the specific array element
             a[i] = a[i + 1];
            //Shift the array postion towards left such that the array required element will be  removed
            }
          }
          System.out.println(a[i]);
         }
         
        }}
    
}
