/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightofabst;
import java.util.*;
class Node{
 Node left,right;
 int data;
 public Node(int data){
  left=right=null;
  this.data=data;
 }}
public class Heightofabst {
   public static int getheight(Node root){
    return root == null ? -1 : 1 + Math.max(getheight(root.left), getheight(root.right));
   }
   public static Node insert(Node root,int data){
    Node cur;//it act like a current pointer
       if(root==null){
        return new Node(data);
       }
       else
       {
        if(data <= root.data){
         cur=insert(root.left,data);
         root.left=cur;
        }else{
         cur=insert(root.right,data);
         root.right=cur;
        }
        return root;
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node in the tree: ");
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getheight(root);
            System.out.println("The height of the tree will be : "+height);
        }	
    
}
