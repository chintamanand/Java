/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofleafnodesinbst;
import java.util.*;
 class Node{
        Node left,right;
        int data;
    public Node(int data){
      left=right=null;
      this.data=data;
     }
    }
public class Sumofleafnodesinbst {
    static int leafsum(Node root){
    int sum=0;
    if (root == null)
            return 0;
      if (root.left == null && root.right == null){
            sum += root.data;
      }
        // propagate recursively in left
      else{ // and right subtree
        leafsum(root.left);
        leafsum(root.right);
      }
        return sum;
    }
    static Node insert(Node root,int data){
       Node curr;
        if(root==null){
          return new Node(data);
        } //data=2; rootdata=6
        else
        {
          if(root.data>=data){
           curr=insert(root.left,data);
           
           } 
          else
          {
           curr=insert(root.right,data);
           
          }
          return root;
        }   
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
