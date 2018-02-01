/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
public class JavaApplication33 {
    public static void main(String[] args) {
        StringBuffer sample=new StringBuffer("hello");
        sample.append("world!");
        System.out.println("The original string will be:"+sample);
        sample.insert(1,"Java");
        System.out.println("THE modified string will be:"+sample); 
        sample.replace(1,3,"Java");  //in the output we will see the result as different.
        System.out.println("The replaced string will be:"+sample);
        //StringBuffer sb=new StringBuffer("Hello");  
        //sb.replace(1,3,"Java");  
        //System.out.println(sb);//prints HJavalo  
        sample.delete(1,3);  
        System.out.println(sample);
        sample.delete(1,5); 
        System.out.println(sample);
        sample.reverse();  
System.out.println(sample);
StringBuffer sample1=new StringBuffer("anand");
System.out.println(sample);
 if(sample1.equals(sample)){System.out.println("both are same");}
      else{
      System.out.println("not same");
    }
    }
}
