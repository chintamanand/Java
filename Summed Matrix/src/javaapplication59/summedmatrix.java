/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author mahe
 */
public class summedmatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t=0;
        int i=0,j=0;
        int n=0,q=0;
        int count=0;
        int [][]a=new int[10][10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        while(t-->0){
           System.out.println("Enter the size of the array :");
           n=scan.nextInt();
           System.out.println("Enter the values for matrix");
           for(i=0;i<n;i++){
           for(j=0;j<n;j++){
            a[i][j]+=scan.nextInt();
           }
           }
          // System.out.println("The values for matrix"+a[i][j]);
           System.out.println("Enter the value to search:");
           q=scan.nextInt();
           for(i=0;i<n;i++){
           for(j=0;j<n;j++){
            if(a[i][j]==q){
             count++;
            }}}
           System.out.println("The count of "+q+" is "+count);
    }
    }}
