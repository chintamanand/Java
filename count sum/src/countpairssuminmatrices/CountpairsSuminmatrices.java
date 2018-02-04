/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countpairssuminmatrices;
import java.util.*;
public class CountpairsSuminmatrices {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int counter=0,n=0,m=0;
        int sum=0;
        while(t-->0){
        System.out.println("Enter number of rows and columns: ");
        m=scan.nextInt();
        n=m;
        System.out.println("number of rows is "+m+" Columns will be :"+n);
        System.out.println("sum of the pair should be: ");
        sum=scan.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Take input for matrix1: ");
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
           a[i][j]=scan.nextInt();  
         }
        }
        
        System.out.println("Take input for matrix2: ");
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
           b[i][j]=scan.nextInt();  
         }
        }
        
        int i=0;
        int a1[]=new int[m*n];
        int b1[]=new int[m*n];
        int k=0;
        //while(k<m*n){}
        for(i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){  
            a1[k++]=a[i][j];
           // b1[k++]=b[i][j];
           System.out.println("Matrix1 in the Array form will be: "+a1[k-1]);
        }
        }
        int z=0;
        for(i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){  
            b1[z++]=b[i][j];
           // b1[k++]=b[i][j];
           System.out.println("Matrix2 in the Array form will be: "+b1[z-1]);
        }
        }
        
        for(i=0;i<a1.length;i++){
          for(int j=0;j<b1.length;j++){
              if(sum==a1[i]+b1[j]){
               counter++;
              }
              else{
               counter=counter+0;
              }
          }}   
           System.out.println("No of pairs present in the 2matrix: "+counter);  
        }
    }
    
}
