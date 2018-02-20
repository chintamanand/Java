/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircase;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Staircase {

    static void staircase(int n) {
        // Complete this function
       char [][] a = new char[n][n];
       //int count=n;
       for(int i=1;i<=n;i++)
       {
       for(int j=1;j<=n;j++)
        {
         if((i+j)>n){
         System.out.print("#");
         }
         else{
         System.out.print(" ");}
        }
        System.out.println();}}
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
    
}
