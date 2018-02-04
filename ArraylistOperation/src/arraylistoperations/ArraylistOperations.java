/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistoperations;
import java.util.*;
public class ArraylistOperations {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of testcases:");
        int t=scan.nextInt();
        int counter=0;
        int q=0;
        char q1;
        int sum=0;
        ArrayList<Integer>arr=new ArrayList<>();
        while(t-->0){
        System.out.println("Enter no of elements in Arraylist: ");
        q=scan.nextInt();
        for(int i=q;i>0;i--){
        System.out.println("Enter elements into the Arraylist: ");
        arr.add(scan.nextInt());
        }
        System.out.println("Number of Queries");
        int q2=0;
        q2=scan.nextInt();
        System.out.println("After Processing the ArrayList!!!!");
        System.out.println("Enter your choice: ");
        System.out.println("a) Adds     ");
        System.out.println("b) Sort     ");
        System.out.println("c) Reverse  ");
        System.out.println("d) size     ");
        System.out.println("e) Maximum    ");
        System.out.println("f) Minimum     ");
        System.out.println("g) Default     ");
        while(q2-->0){
        q1=scan.next().charAt(0);
        System.out.println("The choice u made: " +q1);
        switch(q1){    
            case 'a': 
                System.out.println("enter the values for arraylist: ");
                arr.add(scan.nextInt());
                break;
            case 'b': 
                Collections.sort(arr);
                for(int i=0;i<arr.size();i++){
                System.out.println("After Sorting, ArrayList Contains : " + arr.get(i));
                }
                break;
            case 'c': 
                Collections.reverse(arr);
                for(int i=0;i<arr.size();i++){
                System.out.println("After Reverse Order, ArrayList Contains : " + arr.get(i));
                }
                break;
            case 'd': 
                System.out.println("Size of the Arraylist will be: " +arr.size());
                break;
            case 'e': 
                int a=Collections.max(arr);
                System.out.println("Maximum value in the ArrayList: " +a);
                break;
            case 'f': 
                int b=Collections.min(arr);
                System.out.println("Minimum value in the ArrayList: " +b);
                break;
            default :
                System.out.println("default:U made wrong choice!!!"); 
                return;
        }
        }
        }
    }
    
}
