/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraudulentactivity;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author mahe
 */
public class Fraudulentactivity {
    public static double median(int s[]){
    double median=0;
    Arrays.sort(s);
    //System.out.print("Sorted Scores: ");
      for (int x : s) {
      //  System.out.print(x + " ");
      }
      double pos1 = Math.floor((s.length - 1.0) / 2.0);
      double pos2 = Math.ceil((s.length - 1.0) / 2.0);
      if (pos1 == pos2 ) {
         median = s[(int)pos1];
      } else {
         median = (s[(int)pos1] + s[(int)pos2]) / 2.0 ;
      }
 return (int) median;
}
public static int activityNotifications(int[] expenditure, int d) {
        // Complete this function
    //int a[]=new int[n];
    int count=0,sum=0;
    int j=0,i=0;
    int n=expenditure.length;
    int n1=0;
    int z=d;
    int a[]=new int[d];
      int c=d-1;//it act as a Ending index to split the array
    while(n-->0 && c<n){
        
    //it will spilt this arry into specific range
    for(i=0;i<n-1;i++){
        a=Arrays.copyOfRange(expenditure, i, c);
    System.out.println("The sub-Array will be: "+a[i]);
    n1=a.length;
    // System.out.println("Give the size:"+n1);
    //for(i=d;i<n;i++){
      //int a[]=Arrays.copyOfRange(expenditure, 0, d);//this doesn't required.
     //n1=a.length;if(n1%2==0){}
      System.out.println("the median will be :"+median(a));
   if(expenditure[d]>= 2*median(a)){ 
//&&d <n
       count+=1;//notification count
        //System.out.println("the notification count will be :"+count);
        //System.out.println("Proccessing....!!!");
        //System.out.println("Now the Sub-array will change.");
        }else
           {
               count+=0;
               return count;
           }
            j++;
            c++;
             }}
             return count;    
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter total number of days:");
        int n = in.nextInt();
        System.out.println("Enter number of d-days requires for bank:");
        int d = in.nextInt();
        System.out.println("Enter ur expenditure for" + n +":");
        int[] expenditure = new int[n];
        for(int expenditure_i = 0; expenditure_i < n; expenditure_i++){
            expenditure[expenditure_i] = in.nextInt();
        }
      
        int result = activityNotifications(expenditure, d);
        System.out.println("The Notification Count will be:"+result);
        in.close();
    }
}
