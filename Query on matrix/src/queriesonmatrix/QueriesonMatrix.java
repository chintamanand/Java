/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queriesonmatrix;
import java.util.*;
public class QueriesonMatrix {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int t;
        int n=0,m=0;
        int q=0;
        System.out.println("Enter the number of test-cases: ");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("Enter size of the Matrix : ");
        System.out.println("Number of rows: ");
        m=scan.nextInt();
        System.out.println("Number of columns:");
        n=scan.nextInt();
        try{
            if(n<=0){
            throw new Exception();
            }}
        catch(Exception e){
         System.out.println("Enter valid Size: ");
         n=scan.nextInt();
        }
        int z[][]=new int[m][n];
        System.out.println("Creating and Processing the Matrix!!!");
        
        System.out.println("Enter Nuumber of queries: ");
        q=scan.nextInt();
        int a,b,c,d=0;
       
        while(q-->0){
        System.out.println("Enter ur query: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        int count=0;
        for(int i=a;i<=c;i++){//row run
         for(int j=b;j<=d;j++){//col run
          z[i][j]+=1;
         }
        }
        System.out.println("After modifying!!!");
        for(int i=0;i<z.length;i++){//row run
         for(int j=0;j<z[i].length;j++){//col run
          System.out.print(z[i][j]+" ");
         }
         System.out.println();
        }
        }
    }
    }  
}
