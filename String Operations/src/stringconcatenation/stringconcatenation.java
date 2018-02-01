/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconcatenation;

/**
 *
 * @author MAHE
 */

public class stringconcatenation {
    public static void main(String[] args) {
        // TODO code application logic here
      String text1 = "ganga";
        int m=4;
        int n=9;
        String text2 = "godavari ";
        String total = text2 +  m + n ;
        System.out.println(":"+total);
        String total2= text1 +(text2+( m+n));
        System.out.println(":"+total2);
        int num=text2.length();
        char a = text2.charAt(3);
        System.out.println("char at 3rd position:"+a);
        text2.trim();
        System.out.println("After trimed is:"+text2);
        String text3 =text2.toUpperCase();
        System.out.println("After converting to uppercase letter is:"+text3);
        String text4=text2.substring(3);
        System.out.println("The substring is: "+text4);
        System.out.println(3>=3);
    }   

    private static int indexOf(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
