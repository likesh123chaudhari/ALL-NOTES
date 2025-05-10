package com.demo.service.sorting;

import java.util.Arrays;

public class HeapSortAlgorithm {
	     //arr-->array  n=number of elements 
		//i=root of the tree to convert in min heap 
		public static void heapifyMin(int[] arr,int n,int i) {
			int left=2*i+1;
			int right=2*i+2;
			int smallest=i;
			//is left child value > parent value
			if(left<n && arr[left]<arr[smallest]) {
				smallest=left;
			}
			if(right<n && arr[right]<arr[smallest]) {
				smallest=right;
			}
			if(smallest!=i) {
				//swap smallest and i
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
				heapify(arr,n,smallest);
				
			}
		}
	
		public static void heapSortDescending(int[] arr) {
			//convert the tree into max heap
			for(int i=(arr.length/2)-1;i>=0;i--) {
				heapifyMin(arr,arr.length,i);
			}
			
			int n=arr.length;
			//sort the array
			for(int i=n-1;i>=0;i--) {
			//swap first element with the last element
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			System.out.println(Arrays.toString(arr));
			//to adjust the tree with root 0
			heapifyMin(arr,i,0);
			
			}
		}
	
    //arr-->array  n=number of elements 
	//i=root od the tree to cinvert in heap 
	public static void heapify(int[] arr,int n,int i) {
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		//is left child value > parent value
		if(left<n && arr[left]>arr[largest]) {
			largest=left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest=right;
		}
		if(largest!=i) {
			//swap largest and i
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
			
		}
	}
	
	public static void heapSort(int[] arr) {
		//convert the tree into max heap
		for(int i=(arr.length/2)-1;i>=0;i--) {
			heapify(arr,arr.length,i);
		}
		
		int n=arr.length;
		//sort the array
		for(int i=n-1;i>=0;i--) {
		//swap first element with the last element
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		System.out.println(Arrays.toString(arr));
		//to adjust the tree with root 0
		heapify(arr,i,0);
		
		}
	}
	
	
}
