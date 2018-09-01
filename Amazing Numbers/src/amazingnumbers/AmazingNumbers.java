/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package amazingnumbers;
import java.util.*;
public class AmazingNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int n=0;
        
        boolean result=true;
        while(t-->0){
        System.out.println("enter the Number to Check: ");
        n=scan.nextInt();
        int count=0;
         for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println("All the divisor for number-"+n+"will be : "+i);
            }}
            if(count==3){
             System.out.println(" 1 ");
            }
            else{
            System.out.println(" 0 ");
            }
        
        }
    }
    
}
