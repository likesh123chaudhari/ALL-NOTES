package com.demo.beans;

public class Array {
	private int [] arr;
	private int count;

	
	public Array(){
		super();
		arr=new int[10];
		count=0;
		
	}
	public Array(int size){
		super();
		arr=new int[size];
		count=0;
		
	}
	public Array(int[] arr) {
		super();
		this.arr = arr;
		count=arr.length;
	}
	public int getLength() {
		return arr.length;
		
	}
	public void add() {
		
		
	}
	
	
	

}
