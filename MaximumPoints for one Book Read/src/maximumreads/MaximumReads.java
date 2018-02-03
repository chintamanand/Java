/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumreads;
import java.util.*;
public class MaximumReads {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int n=0,k=0;
        
        while(t-->0){
        System.out.println("Number of books");
        n=scan.nextInt();
        try{
            if(n==0){
            throw  new Exception (" ");
        }}
        catch(Exception e){
            System.out.println("Enter the correct Value: ");
            n=scan.nextInt();
        }
        System.out.println("Present value for number of books:"+n);
        
        System.out.println("Total Time: ");
        k=scan.nextInt();
        try{
            if(k==0){
            throw  new Exception (" ");
        }}
        catch(Exception e){
            System.out.println("Enter the correct Time should be greater than 0: ");
            n=scan.nextInt();
        }
        
        int a[]=new int[n];
        System.out.println("Enter Time taken for each books: ");
        for(int i=0;i<a.length;i++){
         a[i]=scan.nextInt();
        }
        
        int b[]=new int[n];
        System.out.println("Enter the values synchronized with the time array!!!");
        System.out.println("Enter points awarded for each book read: ");
        for(int i=0;i<a.length;i++){
         b[i]=scan.nextInt();
        }
        
        System.out.println("Processing Arrays......!!!");        
        System.out.println(" ");
        
        int res[]=new int[n];
        int div[]=new int[n];
        for(int i=0;i<a.length;i++){
         div[i]=(int)k/a[i];
         res[i]=div[i]*b[i];
         //System.out.println("The Resulting Array will be: "+res[i]);
        }
        Arrays.sort(res);
        System.out.println("The Maximum score the player can: "+res[2]);
        
        }
    }
    
}
