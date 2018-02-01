/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;
public class JavaApplication34 {
    public static void main(String[] args) {
        // TODO code application logic here
        
      StringBuilder str = new StringBuilder("hello ");
      System.out.println("string = " + str);

      // appends the boolean argument as string to the StringBuilder
      str.append(true);
      
      // print the StringBuilder after appending
      System.out.println("After append = " + str);
      str=new StringBuilder("anand");
      System.out.println("the new string will be= "+str);
      str.append('c');
      System.out.println("the new string will be= "+str);
        char[] cArr = new char[]{' ','o','n','l','i','n','e'};

      /* appends the string representation of char array argument to this StringBuilder */
     StringBuilder str1= str.append(cArr);
      
      // print the StringBuilder after appending
      System.out.println("After append = " + str1);
      if(str1.equals(str)){System.out.println("both are same");}
      else{
      System.out.println("not same");
      }
    }
    
}
