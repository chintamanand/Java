/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converthestring;
import java.util.*;

public class ConvertheString {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of TestCases: ");
        int t=scan.nextInt();
        String str1=" ";
        //StringBuffer str2=new StringBuffer();
        StringBuffer str4 = new StringBuffer("");
        int i=0,j=0;
        int n=0;
        while(t-->0){
        System.out.println("Enter the String:");
         
        StringBuffer str3;
        str3 = new StringBuffer(scan.next());
        //str3=scan.next();
        n=str3.length();
        System.out.println("Size fo the String: "+n);
        int []b=new int[n];
        int []c=new int[n];
        
        String sb=str3.toString();
        String sb1="";//this is an emoty string.
        String sb2="";
        char[] a=sb.toCharArray();
        //System.out.println(a);
        for(i=0;i<a.length;i++){
         if (a[i] == 'a' || a[i]  == 'e' || a[i] == 'i' || a[i]  == 'o' || a[i]  == 'u'
                || a[i]  == 'A' || a[i] == 'E' ||a[i] == 'I' || a[i]  == 'O' || a[i]  == 'U') {
        sb1=sb.replaceAll( "[aeiouAEIOU]", "" );
            
       }}
         System.out.println("The String Without the Vowels: "+sb1);
        System.out.println("Processing the string......!!!! ");
        
       for(i=0;i<sb1.length();i++){
                if(Character.isUpperCase(sb1.charAt(i)))
	            {
	               sb1 = sb1.substring(0,i)+String.valueOf(sb1.charAt(i)).toLowerCase()+ sb1.substring(i+1);
    	            } else {
	                sb1 = sb1.substring(0,i)+String.valueOf(sb1.charAt(i)).toUpperCase()+ sb1.substring(i+1);
    	            }
	            } 
        //System.out.println("Replacing all consonants with #: "+sb1.replaceAll( "[bcdfghjklmnpqrstvuwxyzBCDFGHJKLMNPQRSTVXYZ ]", "#" ));
        System.out.println("At the end the string present is: "+sb1);
        }}
    }
    

