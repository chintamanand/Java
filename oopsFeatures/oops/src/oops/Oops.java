/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oops;
import java.util.*;
//three features of OOPS
class A {
    //1.Encapsulation means hiding the data and members in order to protect them from being modified.
    //we can do this by using Acces Modifiers-->provide the Degree of access control to each variable.
 public String a1;
 String a2;
 protected String a3;
 
 public A(String a1,String a2,String a3){
  this.a1=a1;
  this.a2=a2;
  this.a3=a3;
 }
 //these get and set methods are 2 Accessor Method which can be used to access and Modify the Varibales
 
 public String geta1String(){
 return a1;
 }
 public String geta2String(){
 return a2;
 }
public void seta3String(){
 this.a3="anand";
}
public String geta3String(){
 return a3;
}
}
//2.polymorphism -->each Class is the subclass of Object class.
//Every Object in java will have more than one IS-A Relationship like ->"B is subclass of A and A is subclass of Object Class"
//Any Object which Satisifies more than one IS-A relationshio is called polymorphic

//3.Inheritance is a way oby which a class can inherit the what is already there in another existing class.
//here in SubClass-B can Access Members and methods of Class-A depending on the Access modifiers.
//Inheritance are of 2 types:1.Implementation INheritance 2.Interface Inheritance
class B extends A{
 public String b1;
 public String b2;
 public String b3;
    public B(String b1, String b2, String b3) {
        super(b1, b2, b3);
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
    }
 @Override
  public void seta3String(){
 this.a3="kiran";
}
 public String geta2b1String(){
     //As b1 is private Variable,it can be accesed from subclass 
     //private variables are inly accessible from declaring class itself
 return b1 + " "+super.geta2String();
 }
 
   public String getStringfromsupervariable(){
      return super.a3;
     //return super.a2;-->it may give Error has it is private variable which is confined only to declaring Class
     //return super.a1;//>It won't give any error has it is having Public has the access modifier --which can be accessible from all class
   }
   
public String getb1String(){
 return b1;
 }
public String getb2String(){
 return b2;
 }
public String getb3String(){
 return b3;
 }
}


public class Oops extends B{
    public Oops(String a1, String a2, String a3) {
        super(a1, a2, a3);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ");
      A a=new A("mohan1","ramesh1","suresh1");
      System.out.println("The a1 value in Class-A: "+a.geta1String());
      System.out.println("The a2 value in Class-A: "+a.geta2String());
      System.out.println("The a3 value in Class-A: "+a.geta3String());
      System.out.println(" ");
      
      B b=new B("mohan2","ramesh2","suresh2");
      System.out.println("The b value in Class-B: "+b.getb1String());
      System.out.println("The b value in Class-B: "+b.getb2String());
      System.out.println("The b value in Class-B: "+b.getb3String());
      System.out.println(" ");
      //Subclass-B can Access all the methods present in the Class-A
      System.out.println("This values are obtained From class-A and Class-B: "+b.geta2b1String());
      System.out.println("Private Varibale a2 can't be Accessed from Class-A");
      System.out.println("This value is obtained From class-A: "+b.getStringfromsupervariable());
      System.out.println(" ");
      
      A a1=new B("mohan3","ramesh3","suresh3");
      //a1 can only Access class-A methods and variable as its reference type is of A
      //a1 can't access the Subclass-B
    }
}
