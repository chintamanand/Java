/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allpossiblesubstring;
import java.util.*;
public class AllpossibleSubstring {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        String str=" ";
        int counter=0;
        while(t-->0){
        System.out.println("Enter the string conataining 1's and 0's: ");
        str=scan.next();
        try{
            if(str==null){
            throw  new Exception (" ");
             }
           }
        catch(Exception e){
            System.out.println("Enter the correct Value: ");
            str=scan.next();
        }
        String res1=" ";
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='1')
           {
	    for(int j=i+1;j<str.length();j++)
            {
	        if(str.charAt(j)=='1')
                {
	            counter++;
                }
	    }
	   }
        }
        
        System.out.println("The count will be: "+counter);
        }
    }}
