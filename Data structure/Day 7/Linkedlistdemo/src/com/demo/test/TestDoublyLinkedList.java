package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList ob=new DoublyLinkedList();
		ob.addNode(12);
		ob.addNode(15);
		ob.addNode(45);
		ob.addNode(35);
		ob.addNode(23);
		ob.addNode(33);
		ob.addNode(67);
		ob.displayData();
		ob.addByValue(44, 35);
		ob.displayData();
		System.out.println("------------------------");
		/*ob.deleteByValue(67);
		ob.deleteByValue(35);
		ob.deleteByValue(12);
		ob.deleteByValue(88);
		ob.displayData();*/
		ob.displayDataReverse();
	}

}
