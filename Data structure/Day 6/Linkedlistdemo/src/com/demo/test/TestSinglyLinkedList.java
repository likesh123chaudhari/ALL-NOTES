package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList mlist=new SinglyLinkedList();
		mlist.addNode(12);
		mlist.addNode(15);
		mlist.addNode(7);
		mlist.addNode(10);
		mlist.addNode(8);
		mlist.displayData();
		//mlist.addByPosition(100, 1);
		//mlist.addByPosition(200, 3);
		//mlist.addByPosition(300, 8);
		//mlist.addByPosition(300, 15);
		//mlist.addByValue(100, 7);
		//mlist.addByValue(200, 12);
		//mlist.addByValue(300,8);
		//mlist.addByValue(400, 20);
		//mlist.deleteByPosition(5);
		//mlist.deleteByPosition(3);
		//mlist.deleteByPosition(1);
		//mlist.deleteByPosition(5);
		mlist.deleteByValue(8);
		mlist.deleteByValue(7);
		mlist.deleteByValue(12);
		mlist.deleteByValue(18);
		mlist.displayData();

	}

}
