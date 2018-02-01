/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikeandchocolates;
import java.util.*;

public class tripmorphic{
    public static int cuberoot(int n){
     int m=n*n*n;
        return (m);
    }
    public static boolean check(int n){
        int m=n*n*n;
        while(n>0){
         if(n%10!=m%10)
           return false;
         n /= 10;
            m /= 10;
         } 
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t=0;
        int n=0;
        int i,j,k=0; 
        String str1="";
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("Enter the number to check :");
        n=scan.nextInt();
        str1 = String.valueOf(n);//this int convert into the string
        System.out.println("This is the value entered by the user:"+str1);
        System.out.println("Number of digits in the number:"+String.valueOf(n).length());
        int res1 = cuberoot(n);
        System.out.println("The cube root of the"+ n +"is"+res1);
        if(check(n)==true){
        System.out.println("1");
        }
        else
        {
        System.out.println("0");
        }}}}
