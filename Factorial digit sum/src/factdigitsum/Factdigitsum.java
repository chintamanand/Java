/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factdigitsum;
import java.util.*;
public class Factdigitsum {
    public static void main(String[] args) {
        // TODO code application logic here
        int t=0;
        int j=0;
        int m=0;
        int[] factorial = new int[10];	
        String solution = "";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the testcases:");
        t=scan.nextInt();
        while(t-->0){
           System.out.println("Enter the Number :");
           m=scan.nextInt();
           
           Scanner sc = new Scanner(System.in);
		factorial[0]=1;
		factorial[1] = 1;
		for(int i=2;i<10;i++)
		{
			factorial[i] = i*factorial[i-1];
			//System.out.println(factorial[i]);	
		}
		
		int T = sc.nextInt();
		while(T-->0)
		{
			int N = sc.nextInt();
			boolean bool = sol(N,9);
			
			if(bool){
				System.out.println(solution);	
			}
			else
				System.out.println(-1);
			solution = "";
		}
		
	}

	static long sum(long i)
	{
		long x = 0l;
		while(i>0)
		{
			x += factorial[(int)i%10];
			i= i/10;
		}
		return(long) x;
	}

	static boolean sol(long sum , int digit )
	{
		//System.out.println("sum "+ sum + " digit"+digit);
		if(sum==0)
			return true;
		else if(factorial[digit]>sum && digit>=0)
		{
			return sol(sum,--digit);
		}
		else if(factorial[digit]<=sum && digit>=0)
		{
			solution = digit+solution;
			return sol(sum-factorial[digit],digit);
		}
		else
			return false;
	}


	
}
                
       
