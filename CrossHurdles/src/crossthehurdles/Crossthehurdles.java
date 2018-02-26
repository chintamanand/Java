/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crossthehurdles;
import java.util.*;
public class Crossthehurdles {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int t;
        int n;
        System.out.println("Enter the number of test-cases: ");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("Enter the number of hurdles: ");
        n=scan.nextInt();
        try{
            if(n<=0){
            throw new Exception();
            }}
        catch(Exception e){
         System.out.println("Enter the Correct values for hurdles: ");
         n=scan.nextInt();
        }
        
        int e[]=new int[n];
        int h[]=new int[n];
        System.out.println("Creating and Processing the Arrays!");
        System.out.println(" ");
        System.out.println("Enter the energy levels for charchter: ");
        for(int i=0;i<n;i++){
         e[i]=scan.nextInt();
        }
          
        System.out.println("Enter the hurdle height: ");
        for(int i=0;i<n;i++){
         h[i]=scan.nextInt();
        }
        boolean flag=true;
        int roll=0;
        int boost=0;
        //int rollover[]=new int[n];
        for(int i=0;i<n-1;i++){
         if(e[i]>=h[i]){
          roll=e[i]-h[i];
          boost=roll+i+1;
          
          e[i+1]+=boost;
         // System.out.println(e[i]);
          //System.out.println("Game Continous");
          flag=true;
         }else{
             flag=false;
        // System.out.println("Game Over!!!");
         } }
        if(flag==true){
        System.out.println("Game Win!!!");
        }
        else{
        System.out.println("Game Over!");
        }
        
        }
    }
    
}
