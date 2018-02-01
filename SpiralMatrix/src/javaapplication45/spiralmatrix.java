/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author mahe
 */
public class spiralmatrix 
{
    // Function print matrix in spiral form
   public static void spiralPrint(int m, int n, int a[][])
    { Scanner scan=new Scanner(System.in);
        int i=0,k=0,l=0;
    
        while(k<m && l<n){
       
        for(i=l;i<n;i++){
            System.out.println(a[k][i]+" ");
    }k++;
    for(i=k;i<m;i++){
    System.out.println(a[i][n-1]+" ");}
    }n--;
    if(k<m){
    for(i=n-1;i>=l ;i--){
    System.out.println(a[m-1][i]+" ");
     }
    m--;
    }
    if(l<n){
    for(i=n;i>=k;i++){
     System.out.println(a[i][l]+" ");
    }l++;
    }
    }
    // driver program
    public static void main (String[] args) 
    {
        int R = 4;
        int C = 4;
        int a[][] = { {1,  2,  3,  4 },
                      {5,  6,  7,  8 },
                      {9, 10, 11, 12 },
                      {13, 14, 15, 16}
                    };
        spiralPrint(R,C,a);
    }
}