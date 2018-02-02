/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivearray;
import java.util.*;
import java.util.Scanner;
public class ConsecutiveArray {
    static boolean isconsecutive(int b[],int m){
        int max=getmax(b,m);
        System.out.println("The maximum value in the array: "+max);
        int min=getmin(b,m);
        System.out.println("The minimum value in the array is: "+min);
         
        boolean visited[]=new boolean[m];
        
        if(max-min+1==m){
        for(int i=0;i<m;i++){
        if(visited[b[i]-min]!=false){
        return false;
        }
        visited[b[i]-min]=true;
        }
        return true;
        }
        return false; //if (max - min  + 1 != n)
    }
    public static boolean isconsecutive(int b[]){
    return true;
    }
      static int getmax(int b[],int m){
        int max=b[0];
        for(int i=0;i<m;i++){
         if(b[i]>max){
          max=b[i];
         }
        }
     return max;
    }
      static int getmin(int b[],int m){
        int min=b[0];
        for(int i=0;i<m;i++){
         if(b[i]<min){
          min=b[i];
         }
        }
     return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int index=0;
        int n=0;
        boolean result=true;
        while(t-->0){
        System.out.println("enter the size of the array: ");
        n=scan.nextInt();
        System.out.println("Enter the Integer values for array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]+=scan.nextInt();
        }
        //int b[]=Arrays.copyOfRange(a, 0, n);
        if(isconsecutive(a,n)==true){     
            System.out.println("Array elements are consecutive");
        }
        else
        {
            System.out.println("Array elements are not consecutive");
        }
        
        System.out.println(" ");
        System.out.println("Other simple method will be....");
        System.out.println(" ");
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
         if((a[i+1]-a[i])==1)
         {
          //result=true;
          System.out.println("This array element is consecutive number");
         }
         else{
         /// result=false;
          System.out.println("this array Element is NOT consecutive number");
         }
         
        }
       
         
        }
    }
    
}
