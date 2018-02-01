/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yesxorno;
import java.util.*;
/**
 *
 * @author mahe
 */
public class YesXorNo {
    public static void main(String[] args) {
        // TODO code application logic here
        int t=0;
        int n=0;
        int count=0;
        int i,j,k=0; 
        String str1="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("Enter size for array1 and arry2:");
        n=scan.nextInt();
        int array1[]=new int [n];
        int array2[]=new int [n];
        System.out.println("Enter the values for array1:");
        for(i=0;i<n;i++){
        array1[i]=scan.nextInt();
        }
        System.out.println("processing the array1......");
        System.out.println("Enter the values for array2:");
         for(i=0;i<n;i++){
        array2[i]=scan.nextInt();
        }
        int d[]=new int [n];
        for(i=0;i<n;i++){
        for(j=0;j<n;j++){
         d[i]+=array1[i]^array2[j];//exclusie-or operator in the java.
         //System.out.println("The values for d[i]:"+d[i]);
        }}
        for(i=0;i<n;i++){
         if(d[i]==array1[i] || d[i]==array2[i])
         {
          count++;
         }
        
        }
         if(count%2==0){
             System.out.println("Yes");
         }
        }
    }
    
}
