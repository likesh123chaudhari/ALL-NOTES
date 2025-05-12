package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestOrdermgnt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		int choice=0;
		do {
		System.out.println("1.add new order\n2.Delete order\n3. modify customer mobile");
		System.out.println("4. add new item in existing order\n5. delete item from existing order\n");
		System.out.println("6. Modify qty for existing order for a particular item");
		System.out.println("7.display all\n8.display order of a customer");
		System.out.println("9. display orders that has some particular item\n10.calculate bill for a particular order");
		System.out.println("11.exit\nchoice:");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	boolean status=oservice.addNewOrder();
        	if(status) {
        		System.out.println("order placed");
        	}else {
        		System.out.println("duplicate order");
        	}
        	break;
        case 2:
        	System.out.println("enter customer no to delete order");
        	int cid=sc.nextInt();
        	status=oservice.deleteOrderById(cid);
        	if(status) {
        		System.out.println("order deleted successfully");
        	}else {
        		System.out.println("not found");
        	}
        	
        	break;
        case 3:
        	System.out.println("enter customer no to delete order");
        	cid=sc.nextInt();
        	System.out.println("enetr new mobile number");
        	String nmob=sc.next();
        	status=oservice.modifyMobile(cid, nmob);
        	if(status) {
        		System.out.println("mobile number modification done");
        	}else {
        		System.out.println("not found");
        	}
        	break;
        case 4:
        	System.out.println("enter customer id");
        	cid=sc.nextInt();
        	status=oservice.addItemsInOrder(cid);
        	if(status) {
        		System.out.println("added items");
        	}else {
        		System.out.println("not added");
        	}
        	break;
        case 5:
        	System.out.println("enter customer id");
        	cid=sc.nextInt();
        	System.out.println("enter itemnumber to delete");
        	int ino=sc.nextInt();
        	status=oservice.deleteItem(cid,ino);
        	if(status) {
        		System.out.println("deleted successfully");
        	}else {
        		System.out.println("Not Found" );
        	}
        	
        	break;
        case 6:
        	System.out.println("enter customer id");
        	cid=sc.nextInt();
        	System.out.println("enetr item number to change qty");
        	int iid=sc.nextInt();
        	System.out.println("enetr new qty");
        	int nqty=sc.nextInt();
        	status=oservice.modifyQuantity(cid,iid,nqty);
        	if(status) {
        		System.out.println("modification done");
        	}else {
        		System.out.println("not found");
        	}
        	break;
        case 7:
        	Map<Customer,List<Item>> cmap=oservice.getAll();
        	cmap.forEach((c,olist)->{System.out.println(c+" : ");
        	System.out.println(olist);});
        	break;
        case 8:
        	System.out.println("enetr customer id,to search order");
        	cid=sc.nextInt();
            oservice.getOrderById(cid); 
        	break;
        case 9:
        	System.out.println("enter item id to search in all orders");
        	ino=sc.nextInt();
        	List<Customer> clist=oservice.getAllCustomersByItemno(ino);
        	if(clist!=null) {
        		clist.forEach(System.out::println);
        	}else {
        		System.out.println("no customers have ordered the item " + ino);
        	}
        	break;
        case 10:
        	System.out.println("enter customer id to calculate the bill");
        	cid=sc.nextInt();
        	double bill=oservice.getBillForOrder(cid);
        	if(bill!=0) {
        		System.out.println("Bill amount: "+bill);
        	}else {
        		System.out.println("customer not found");
        	}
        	break;
        case 11:
        	sc.close();
        	System.out.println("Thank you for visiting....");
        	break;
        }
		}while(choice!=11);
	}

}
