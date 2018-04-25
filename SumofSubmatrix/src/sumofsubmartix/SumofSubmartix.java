/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumofsubmartix;
import java.util.*;
public class SumofSubmartix {
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        //this is the Size.
        int n=scan.nextInt();
        //Enter the size of Square Block in the matrix
        int k=scan.nextInt();
        int m=n;
        int a[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
         a[i][j]+=scan.nextInt();
        }
        }
        
        
        if(k>n){
            System.out.println("Invalid size of the Square Block");
        }
        if(k<n){
            for(int i=0;i<m-k+1;i++){
                for(int j=0;j<n-k+1;j++){
                int sum = 0;
                for (int p = i; p < k+i; p++)
                    for (int q = j; q < k+j; q++)
                        sum += a[p][q];
                System.out.print(sum+ " "); 
                
                }
            }
        }
    }
    
    
}
