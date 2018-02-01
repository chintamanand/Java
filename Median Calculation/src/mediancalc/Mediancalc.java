/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediancalc;
import java.util.*;
public class Mediancalc {
public static double median(int scores[]){
    double median=0;
      double pos1 = Math.floor((scores.length - 1.0) / 2.0);
      double pos2 = Math.ceil((scores.length - 1.0) / 2.0);
      if (pos1 == pos2 ) {
         median = scores[(int)pos1];
      } else {
         median = (scores[(int)pos1] + scores[(int)pos2]) / 2.0 ;
      }
 return (double) median;
}
   public static void main(String[] args) {
 
      int scores[] = new int[] {4,1,8,6,3};
 
     Arrays.sort(scores);
      System.out.print("Sorted Scores: ");
      for (int x : scores) {
        System.out.print(x + " ");
      }
      System.out.println("");
  double median = 0;
       median=median(scores);
     
 
      System.out.println("Median: " + median);
 
   }
}
    

