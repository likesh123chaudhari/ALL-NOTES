package com.demo.linkedlist;

import com.demo.beans.Employee;

public class SinglyLinkedListEmployee {
    Node head;
    class Node{
    	Employee data;
    	Node next;
		public Node(Employee data) {
			super();
			this.data = data;
			this.next = null;
		}
    	
    }
    public void addNode(Employee ob) {
    	Node newNode=new Node(ob);
    	//adding at the begining
    	if(head==null) {
    		head=newNode;
    	}else {
    		Node temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		//add at the end
    		temp.next=newNode;
    	}
    }
    public void addNodeByEmpno(Employee ob,int empno) {
    	if(head==null)
    		System.out.println("list is empty");
    	else {
    		Node newNode=new Node(ob);
    		//place the temp at the node which has given empno
    		Node temp=head;
    		while(temp.next!=null && temp.data.getEmpno()!=empno) {
    			temp=temp.next;
    		}
    		if(temp.data.getEmpno()==empno) {
    			newNode.next=temp.next;
    			temp.next=newNode;
    		}else {
    			System.out.println("empno not found "+empno);
    		}
    		
    	}
    	
    	
    }
    
    public Employee deleteByEmpno(int empno) {
    	if(head==null) {
    		System.out.println("list is empty");
    	}else {
    		Node temp=head;
    	    if(head.data.getEmpno()==empno){
    		   head=temp.next;
    		   temp.next=null;
    		   return temp.data;
    	    }else {
    	    	Node prev=null;
    		while(temp.next!=null && temp.data.getEmpno()!=empno) {
    			prev=temp;
    			temp=temp.next;
    		}
    		if(temp.data.getEmpno()==empno) {
    			prev.next=temp.next;
    			temp.next=null;
    			 return temp.data;
    		}else {
    			System.out.println("number not found "+empno);
    			return null;
    		}
    	  }
    	}
    	return null;
    	
    }
    //delete all nodes with given empname
    //display all nodes with salary > given salary
    
    public void displayData() {
    	if(head!=null) {
    		Node temp=head;
    		while(temp!=null) {
    			System.out.println(temp.data);
    			temp=temp.next;
    		}
    	}
    }
}
