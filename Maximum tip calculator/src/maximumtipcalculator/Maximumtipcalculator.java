/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumtipcalculator;
import java.util.*;
public class Maximumtipcalculator {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
        int t;
        int n;
        System.out.println("Enter the number of test-cases: ");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("Enter number of orders: ");
        n=scan.nextInt();
        try{
            if(n<=0){
            throw new Exception();
            }}
        catch(Exception e){
         System.out.println("Enter valid number of orders: ");
         n=scan.nextInt();
        }
        int a[]=new int[n];
        int b[]=new int[n];
        int max[]=new int[n];
        
        System.out.println("Enter amount for each order: ");
        for(int i=0;i<n;i++){
        a[i]=scan.nextInt();
        }
        
        System.out.println("Enter amount for each order: ");
        for(int i=0;i<n;i++){
        b[i]=scan.nextInt();
        }
        
        int x=0;
        int y=0;
        System.out.println("Number of orders R can takes: ");
        x=scan.nextInt();
        System.out.println("Number of orders A can takes: ");
        y=scan.nextInt();
        
        int max1=0;
        int sum=0;
        //Arrays.sort(a);
        //Arrays.sort(b);
        if(n>=x+y){
        for(int i=0;i<n;i++){
         if(a[i]>=b[i]){
          max[i]=a[i];
          sum+=max[i];
         }
         else{
          max[i]=b[i];
          sum+=max[i];
         }
         System.out.println(max[i]);
        }
        System.out.println(sum);
        }
        else{
         System.out.println("Notpossible to take the orders!!!");
        }
    }}
    
}
