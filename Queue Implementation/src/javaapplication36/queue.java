/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.LinkedList;

 
public class queue {
 LinkedList queue=new LinkedList();
  queue(){
  
  }
  //here it gives all the methods that are supported by the linkedlist.
  public boolean isempty()
  {
   return queue.isEmpty();
  }
  public void enqueue(int n)
  {
    System.out.println("element inserted!"+n);
    queue.addLast(n);
  }
  public int size()
  {
    System.out.println("the size of the linked list:  "+queue.size());
    return queue.size();
  }
  public int dequeue(){
   return (int)queue.remove(0);
  }

  public int peek()
  {
   System.out.println("It will return the 1st element!"+queue.get(0));
   return (int)queue.get(0);
  }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Process Start from here");
        queue q1= new queue();
        q1.enqueue(4);
        q1.enqueue(2);   
        q1.enqueue(5); 
        q1.enqueue(6);
        q1.size();
        
        q1.peek();
        System.out.println("queue is empty or not? "+q1.isempty());
        //first in first out here -->4 is 1st input .
        System.out.println("dequeue will be look like: "+ q1.dequeue());
        q1.size();
        
        
        //Stack<String> stacky = new Stack<>();
        //System.out.println("1st element will be  :"+sample.peek());
       // stacky.
    }
    
}
