/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

class Item{
    int pid,stock,price;
    String desc;
    public Item(int pid,int stock,int price,String desc){
        this.pid=pid;
        this.stock=stock;
        this.price=price;
        this.desc=desc;
    }
    public void updateStock(int n,int ch){
        if(ch==1)
            stock+=n;
        else if(ch==2)
            stock-=n;
    }
    public int retPrice(){
        return price;
    }
    public int retPid(){
        return pid;
    }
    public String toString(){
        return new String("Product ID: "+pid+" Description: "+desc+" Price: "+price+" Stock: "+ stock);
    }
    public String toStringNoStock(){
        return new String("Product ID: "+pid+" Description: "+desc);
    }
}
class Order{
    int oid, val;
    ArrayList<Item> orders = new ArrayList<Item>();
    ArrayList<Integer> quantity = new ArrayList<Integer>();
    String loc,status;
    public Order (int oid,ArrayList<Item> orders,ArrayList<Integer> quantity){
        this.oid = oid;
        this.orders = orders;
        this.quantity = quantity;
        loc = "Warehouse";
        status = "Processing";
    }
    public void updateLoc(String locs){
        loc = locs;
    }
    public void updateStat(String stat){
        status = stat;
    }
    public void showLoc(){
        System.out.println("Order Location: "+loc);
    }
    public void showStat(){
        System.out.println("Order Status: "+status);
    }
    public void display(){
        System.out.println("Order ID: "+oid);
        System.out.println("Items");
        for(int i = 0; i<orders.size();i++){
            System.out.println(orders.get(i).toStringNoStock()+": "+quantity.get(i));
        }
        System.out.println("Status: "+status);
        System.out.println("Location: "+loc);
    }
}
public class OrderPlacementService {
    static ArrayList<Item> items;
    static ArrayList<Order> orders;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String adminpass = "AdminPass", userpass = "UserPass";;
        items=new ArrayList<Item>();
        orders=new ArrayList<Order>();
        int choice,usrchoice;
        do{
            System.out.println("1. Admin, 2. User, 3 Exit");
            usrchoice = sc.nextInt();
            switch (usrchoice) {
            	case 1:
                	System.out.println("Enter Password");
                	String pass = sc.next();
                	if(pass.equals("AdminPass")){
    		            do{
    		                System.out.println("1. Add Item 2. Modify Stock 3. Track Package 4. Modify Order 5.View Orders 6.Show Items 7.Exit");
    		                System.out.println("Enter choice");
    		                choice = sc.nextInt();
    		                switch(choice){
    		                    case 1: 
    		                        addItem(items);
    		                        break;
    		                    case 2:
    		                        modifyStock(items);
    		                        break;
    		                    case 3:
    		                        track();
    		                        break;
    		                    case 4:
    		                        modifyOrder(orders);
    		                        break;
    		                    case 5:
    		                        showOrders(orders);
    		                        break;
    		                    case 6:
    		                        showItems(items);
    		                        break;
    		                }
    		            }while(choice!=7);
    		        }
    		        else
    		        	System.out.println("Wrong Password");
    	        break;
                case 2:
                	System.out.println("Enter Password");
                	pass = sc.next();
                	if(pass.equals("UserPass")){
        	            do{
        	                System.out.println("1. View Items 2. Order Item 3. Track Package 4.Exit");
        	                System.out.println("Enter choice");
        	                choice = sc.nextInt();
        	                switch(choice){
        	                    case 1: 
                                    showItems(items);
                                    break;
                                case 2:
                                    order(orders,items);
                                    break;
                                case 3:
                                    track();
                                    break;    
        	                }
        	            }while(choice!=4);
                	}
                	else
                		System.out.println("Wrong Password");
                break;
            }
        }while(usrchoice!=3);
    }   
    public static void addItem(ArrayList<Item> items){
        System.out.println("Enter Item ID");
        int pid = sc.nextInt();
        System.out.println("Enter Item Description");
        String desc = sc.next();
        System.out.println("Enter Item Price");
        int price = sc.nextInt();
        System.out.println("Enter Item Stock");
        int stock = sc.nextInt();
        items.add(new Item(pid,stock,price,desc));
    }
    public static void modifyStock(ArrayList<Item> items){
        System.out.println("Enter item ID");
        int pid = sc.nextInt();
        for(int i=0;i<items.size();i++){
            if(items.get(i).pid==pid){
                System.out.println("Enter 1 to add, 2 to remove: ");
                int ch = sc.nextInt();
                System.out.println("Enter item stock");
                int stock = sc.nextInt();
                items.get(i).updateStock(stock,ch);
                break;
            }
            else
                System.out.println("No Such Item");
        }
    }
    public static void track(){
        System.out.println("Enter order ID");
        int oid = sc.nextInt();
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).oid==oid){
                orders.get(i).showStat();
                orders.get(i).showLoc();
            }
            else
                System.out.println("No Such Order");
        }
    }
    public static void modifyOrder(ArrayList<Order> orders){
        System.out.println("Enter order ID");
        int oid = sc.nextInt();
        for(int i=0;i<orders.size();i++){
            if(orders.get(i).oid==oid){
                System.out.println("Enter 1 to modify location, 2 to modify status: ");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.println("Enter location: ");
                        String loc=sc.next();
                        orders.get(i).updateLoc(loc);
                        break;
                    case 2:
                        System.out.println("Enter status: ");
                        String stat=sc.next();
                        orders.get(i).updateStat(stat);
                        break;
                }
                break;
            }
            else
                System.out.println("No Such Order");
        }
    }
    public static void showOrders(ArrayList<Order> orders){
        for(int i=0;i<orders.size();i++){
            orders.get(i).display();
        }
    }
    public static void showItems(ArrayList<Item> items){
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
    public static void order(ArrayList<Order> orders, ArrayList<Item> items){
        showItems(items);
        System.out.println("Enter the ID of the items you wish to order, Enter 0 to exit");
        ArrayList<Item> orderItem = new ArrayList<Item>();
        ArrayList<Integer> quantityList = new ArrayList<Integer>();
        int ID = 1,quantity, flag = 0;
        while(ID != 0){
        	ID = sc.nextInt();
        	for(int i = 0; i < items.size(); i++){
        		if(ID == items.get(i).pid){
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    orderItem.add(items.get(i));
                    items.get(i).updateStock(quantity , 2);
                    quantityList.add(quantity);
                    flag = 1;
                    break;
                }
        	}
            if(flag == 0)
                System.out.println("Item does not exist");
        }
        int oid = (int)(Math.random()*100);
        int val = 0;
        for(int i=0;i<orderItem.size();i++){
            val+=(orderItem.get(i).retPrice()*quantityList.get(i));
        }
        System.out.println("Total Payable: " + val);
        System.out.print("Press 1 to confirm: ");
        int ch = sc.nextInt();
        if(ch == 1)
            orders.add(new Order(oid,orderItem,quantityList));
        else
            System.out.println("Order Not Placed");
    }
}