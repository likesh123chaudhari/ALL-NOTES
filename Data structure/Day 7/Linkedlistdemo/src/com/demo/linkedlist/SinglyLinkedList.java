package com.demo.linkedlist;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int val) {
			this.data=val;
			this.next=null;
		}
	} //end of Node class
	
	//initialize the list
	public SinglyLinkedList() {
		head=null;
	}
	public int findSum() {
		int sum=0;
		Node temp=head;
		while(temp!=null) {
			sum=sum+temp.data;
			temp=temp.next;
		}
		return sum;
	}
	
	//add by position
	public void addByPosition(int value,int pos){
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode=new Node(value);
			//adding at the first position
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				int count=0;
				Node temp=head;
				for(int i=0;temp.next!=null && i<pos-2;i++) {
					temp=temp.next;
					count++;
				}
				System.out.println("count :"+count);
				if(count==pos-2) {
				newNode.next=temp.next;
				temp.next=newNode;
				}else {
					System.out.println("position is out of bounds---> "+pos);
				}
				
			}
		}
		
	}
	
	//add value after the num
	public void addByValue(int value,int num){
		//check the list is empty
		if(head==null) {
			System.out.println("list is empty");
		}else {
			
			Node newNode=new Node(value);
			Node temp=head;
			//place temp at the node with num
			while(temp.next!=null && temp.data!=num ) {
				temp=temp.next;
			}
			//add the node after num
			if(temp.data==num) {
			  newNode.next=temp.next;
			  temp.next=newNode;
			}else {
				System.out.println("num not found "+num);
			}
		}
	}
	
	//add a node at the end
	public void addNode(int val){
		//create a new node
		Node newNode=new Node(val);
		//check list is empty
		if(head==null) {
			head=newNode;
		}else {
	        //place temp at the begining	
			Node temp=head;
			//place temp at the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			//add newNode after last node
			temp.next=newNode;
		}
	}
	
	//display data from the linked list
	public void displayData() {
		//place temp at the begining
		Node temp=head;
		//this loop will take the temp beyond last node
		//so that it will display data from last node
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		//it will add newline character
		System.out.println();
	}
	
	//delete by position and return value which is deleted
	public int deleteByPosition(int pos) {
		Node temp=head;
		//delete from the head
		if(pos==1) {
			head=temp.next;
			temp.next=null;
			return temp.data;
		}else {
			//delete in between or last node
			Node prev=null;
			int count=0;
			for(int i=0;temp.next!=null && i<pos-1;i++) {
				prev=temp;
				temp=temp.next;
				count++;
			}
			if(count==pos-1) {
				prev.next=temp.next;
				temp.next=null;
				return temp.data;
			}else {
				//position id beyond the length of the list
				System.out.println("position is out of bounds "+pos);
				return -1;
			}
		}
	}
	
	public void deleteByValue(int value) {
		Node temp=head;
		//check whetehr to delete the first node
		if(head.data==value) {
			head=temp.next;
			temp.next=null;
			
		}else {
			//delete from middle or from end
			Node prev=null;
			while(temp.next!=null && temp.data!=value) {
				prev=temp;
				temp=temp.next;
			}
			if(temp.data==value) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println("value not found "+value);
			}
		}
		
	}
	

}
