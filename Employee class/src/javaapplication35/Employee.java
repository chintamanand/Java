/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication35;

import java.io.*;
public class Employee {

   String name;
   int age;
   String designation;
   double salary;
   int exp;

   // This is the constructor of the class Employee
   public Employee(String name) {
      this.name = name;
   }

   // Assign the age of the Employee  to the variable age.
   public void empAge(int empAge) {
      age = empAge;
      System.out.println(""+empAge);
   }

   /* Assign the designation to the variable designation.*/
   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   /* Assign the salary to the variable	salary.*/
   public void empSalary(double empSalary) {
      salary = empSalary;
   }
 public void exp(int exp){
       this.exp=exp;
      //System.out.println("print the experience: "+exp);
      }
   /* Print the Employee details */
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}
 class EmployeeTest extends Employee {
       int exp;
       public void exp(int exp){
       this.exp=exp;
       System.out.println("print the experience of the employeeTest: "+exp);
       }
   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("James Smith");
      EmployeeTest empTwo = new EmployeeTest("Mary Anne");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();
      empOne.exp(15);

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");//this overriding the method.
      empTwo.empSalary(500);
      empTwo.printEmployee();
      empTwo.exp(10);
   }

    public EmployeeTest(String name) {
        super(name);
    }
    public void empAge1(int empAge) {
       super.empAge(empAge);
        age = empAge;
   }
}

