package com.demo.beans;

import java.util.Arrays;

public class MyArray {
      private int[] arr;
      private int count;

	public MyArray() {
		super();
		arr=new int[10];
		count=0;
	}
	public MyArray(int size) {
		super();
		arr=new int[size];
	}
	public MyArray(int[] arr) {
		super();
		this.arr = arr;
		count=arr.length;
	}
	public void add(int x) {
		if(count<arr.length) {
			arr[count]=x;
			count++;
		}
	}
	public int getLength() {
		return arr.length;
	}
	public int getSum() {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//rottate the array by n locations
	public void rotateArray(int n) {
		//check n < array.length
		if(n>=arr.length) {
			System.out.println("rotation is not possible, n should be < "+arr.length);
		}else {
			
			for(int count=1;count<=n;count++) {
				//store arr[0] in temp
				int temp=arr[0];
				//shift all elements one location on left
				for(int i=1;i<arr.length;i++) {
					arr[i-1]=arr[i];					
				}
				//assign the first value at the last location
				arr[arr.length-1]=temp;
				System.out.println("rotation---> "+count);
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		
		//copy temp into last location
	}
	public int[] reverseArray(boolean flag) {
		if(flag) {
			//inplace reverse
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			//create a new array
			int[] arr1=new int[arr.length];
			for(int i=arr.length-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
				
			}
			return arr1;
		}
	}
	public int findMax() {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	//replace index with values in the array
	public int[] replaceIndexValue() {
		//find maximum value
		int max=findMax();
		//create a new array with size max+1
		int[] newarr=new int[max+1];
		//initialize it with -1
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=-1;
		}
		//then from old array read value and index, at value position add index
		for(int i=0;i<arr.length;i++) {
			 int pos=arr[i];
		     newarr[pos]=i;
			
		}
		return newarr;
	}
	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + "]";
	}
	
	
      
      
}
