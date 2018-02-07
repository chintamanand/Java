/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranversaloftree;
import java.util.*;
class node{
 node left,right;
 int data=0;
 public node(int data){
  left=right=null;
  this.data=data;
 }
}
public class Tranversaloftree {
    static void levelOrder(node root){
      Queue<node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            node curr = queue.remove();
            System.out.print(curr.data + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
    }
    static void inorder(node root){
     if(root==null){
        //System.out.print(" 0 "); 
     }
     else{
       inorder(root.left);
       System.out.print("Inorder : "+root.data);
       inorder(root.right);
       
     }}
    static void preorder(node root){
      if(root==null){
        //System.out.print(" 0 "); 
      }
      else{
        System.out.print("Preorder : "+root.data );
        inorder(root.left);
        inorder(root.right);
     }}
    static void postorder(node root){
      if(root==null){
        //System.out.print(" 0 "); 
      }
      else{
        
        inorder(root.left);
        inorder(root.right);
        System.out.print("Postorder : "+root.data );
     }}
    
    static node insert(node root,int data){
        node curr;
        if(root==null){
         return new node(data);
        }
        else{
         if(data<=root.data){
          curr=insert(root.left,data);
          root.left=curr;
         }else{
          curr=insert(root.right,data);
          root.right=curr;
         }
        }
        return root;
    }
    static int size(node root){
     int size=0;
      if(root==null){
       return 0;
       }
      else{
       return size(root.left)+1+size(root.right);
      }
    }
    
    static int getheight(node root){
    return root == null ? -1 : 1 + Math.max(getheight(root.left), getheight(root.right));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node in the tree: ");
            int T=sc.nextInt();
            node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getheight(root);
            System.out.println("The height of the tree will be : "+ height);
            
            inorder(root);
            System.out.println(" ");
            System.out.println(" ");
            preorder(root);
            System.out.println(" ");
            System.out.println(" ");
            postorder(root);
           
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("This is level order traversal for Tree: ");
            levelOrder(root);
            System.out.println(" ");
            System.out.println("The size of the tree will be: "+size(root));
           
    }
    
}
