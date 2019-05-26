/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package specialnumber;
import java.util.*;
public class SpecialNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
         a[i]+=scan.nextInt();
        }
        
        int bcount=0;
        
        for(int i=0;i<n;i++){
            int acount=0;
         for(int j=0;j<n;j++){
          if((a[j]%a[i])==0){
               acount++;
          }
          if(acount>1){
           bcount++;
          }
         }
        }
        System.out.println("This is the Divisiblity Check:"+bcount);
    }
    
}
