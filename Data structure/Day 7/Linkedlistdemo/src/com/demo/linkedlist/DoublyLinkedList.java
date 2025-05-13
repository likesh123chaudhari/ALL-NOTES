package com.demo.linkedlist;

import com.demo.linkedlist.SinglyLinkedList.Node;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
	}
	
	public void addNode(int value){
		//list is empty , add at the begining
		Node newNode=new Node(value);
		if(head==null) {
			//add at the first position
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			//add at the end
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			
		}
	}
	
	public void addByValue(int num,int value) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node newNode=new Node(num);
			//add at the first position
			if(head.data==value) {
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}else {
				Node temp=head;
				while(temp.next!=null && temp.data!=value) {
					temp=temp.next;
				}
				if(temp.data==value) {
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next=newNode;
					//if we are adding in between
					if(temp.next!=null) {
						temp.next.prev=newNode;
					}
				}
			}
			
		}
		
	}
	
	public void deleteByValue(int value){
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			//delete from the begining
			if(head.data==value) {
				head=temp.next;
				head.prev=null;
				temp.next=null;
						
			}else {
				while(temp.next!=null && temp.data!=value) {
					temp=temp.next;
				}
				if(temp.data==value) {
					//to delete in between and the last node
					temp.prev.next=temp.next;
					//only for delete in between
					if(temp.next!=null) {
						temp.next.prev=temp.prev;
					}
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println("Value not found "+value);
				}
			}
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void displayDataReverse() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
			
		}
	}

}
