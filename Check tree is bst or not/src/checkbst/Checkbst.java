
package checkbst;
import java.util.*;
 class Node{
        Node left,right;
        int data;
     public Node(int data){
      left=right=null;
      this.data=data;
     }
    }
public class Checkbst {
    static Node insert(Node root,int data){
       Node cur;
    if(root==null){
     return new Node(data);
    }
    else{
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
   static boolean isbst(Node root){
    Node curr=root;
    if(curr==null){
      return true;
     }
     
      if(curr.left==null && curr.right==null){
       return true;}
      
      if(curr.left!=null && curr.right!=null)
       return (isbst(curr.left) && isbst(curr.right));
      
     return false;
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
            System.out.println("The given tree is binary tree or not: "+isbst(root));
    }}
