/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciprime1;
 import java.util.*;
/**
 *
 * @author mahe
 */
public class Fibonacciprime1 {
    public static void main (String[] args)
	{
	    String nos;
	    int i,l;
	    String s[]={"2","3","5","13","89","233","1597","28657","514229","433494437","2971215073","99194853094755497","1066340417491710595814572169","19134702400093278081449423917","475420437734698220747368027166749382927701417016557193662268716376935476241"};
	    l=s.length;
	    Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of testcases:");
	    int t=sc.nextInt();
             
	    sc.nextLine();
           // System.out.println("enter the number to check:");
	    while(t-->0)
	    {System.out.println("enter the number to check:");
	        nos=sc.nextLine();
	        for(i=0;i<l;i++)
	            if(s[i].equals(nos))
	                break;
	        if(i==1){
	            System.out.println(0);}
                else{
	            System.out.println(1);}
	    }
	}
}
    
    
