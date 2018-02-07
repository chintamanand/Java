/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencetomobilekeypadsequence;
import java.util.*;
public class Sentencetomobilekeypadsequence {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String a="";
        int t=0;
        String output=" ";
        System.out.println("Enter the number of testcases: ");
        t=scan.nextInt();
        while(t-->0){
        System.out.println("ONLY UPPER-CASE LETTERS!!");
        System.out.println("Enter the string to convert the value: ");
        a=scan.next();
        String[] seq={"2","22","222",
                      "3","33","333",
                      "4","44","444",
                      "5","55","555",
                      "6","66","666",
                      "7","77","777","7777",
                      "8","88","888",
                      "9","99","999","9999"
                     };
        for(int i=0;i<a.length();i++){
         if(a.charAt(i)  ==' '){
           output+="0";
         }
         else{
            int position=a.charAt(i) - 'A';
            output+=seq[position];
            try{
             if(position>=seq.length){
                 throw new Exception();
             }
            }
            catch (Exception e){
                System.out.println("Enter the UpperCase letters Only");
                a=scan.next();
            }
         }
        System.out.println("After conveting the value into keypad sequence: "+output);}
        //System.out.println("After conveting the value into keypad sequence: "+a.length());
        }
        
    }
    
}
