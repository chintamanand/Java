/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;
import java.util.*;
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j=0,h=0;
        int sum[] = new int[16];
        int a[][]= {{1 ,1 ,1 ,0 ,0 ,0},
                    {0, 1, 0, 0, 0, 0},
                    {1 ,1 ,1 ,0 ,0 ,0},
                    {0 ,0, 2 ,4 ,4 ,0},
                    {0 ,0 ,0 ,2 ,0 ,0},
                    {0, 0, 1, 2, 4, 0} };
     for(i=0;i<4;i++){
         for(j=0;j<4;j++){
           
           sum[h]= a[i][j] + a[i][j+1] + a[i][j+2]
                    + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1]
                    + a[i+2][j+2];
            h++;
         }
      }
    Arrays.sort(sum);
    System.out.println(sum[15]);
    }
    
}
