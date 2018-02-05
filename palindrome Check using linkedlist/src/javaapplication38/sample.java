/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;
import java.io.*;
import java.util.*;
public class sample {
  LinkedList queue=new LinkedList();
   Stack st = new Stack();
  sample(){
  
  }
  public void pushCharacter(char ch){
  st.push(ch);
  }
  public char popCharacter(){
  return (char)st.pop();
  }
  public void enqueueCharacter(char ch){
   queue.addLast(ch);
  }
  public char dequeueCharacter(){
  return  (char)(queue.remove(0));
  }
  
       public static void main(String[] args) {
        System.out.println("Enter the word to check it is palindrome or not: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        sample p = new sample();

        // Enqueue/Push all chars to their respective data structures:
        for (char ch : s) {
            p.pushCharacter(ch);
            p.enqueueCharacter(ch);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
    
    

