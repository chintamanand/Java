/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablenumber;
import java.util.*;
public class AmicableNumber {
static int d=50;

    int change(int d){
        d=d+50;
        return d;
    }
     static int sumdivisor(int a){
        int res=0;
        for(int i=2;i<Math.sqrt(a);i++){
        if(a%i==0){
            //this is one of the divisor
            if(i==a/i){
                res+=i;
            }else{
            res+=i+a/i;
            }} }
        return res+1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int c=45;
        int i=1;
       
        AmicableNumber a1=new AmicableNumber();
        System.out.println(" "+a1.d);
        System.out.println("After the change: "+a1.change(d));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of TestCases: ");
        int t=scan.nextInt();
        System.out.println("Enter the 1st Number: ");
        int a=scan.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int b=scan.nextInt();
         while(t-->0){
         System.out.println("Sum of the divisors for the "+a +" is :"+sumdivisor(a));
         System.out.println("Sum of the divisors for the "+b +" is :"+sumdivisor(b));
         int res1=sumdivisor(a);
         int res2=sumdivisor(b);
         if(res1==b && res2==a){
         System.out.println(" 1 ");
         }
         else{
         System.out.println(" 0 ");
         }
        }
      
    }
    
}
