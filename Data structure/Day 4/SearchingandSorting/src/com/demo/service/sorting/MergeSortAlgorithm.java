package com.demo.service.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {
	
	public static void merge(int[] arr,int start,int mid,int end) {
		//length of leftarray
		int n1=mid-start+1;  
		//length of right array
		int n2=end-mid;
		//temporary arrays
		int[] leftarray=new int[n1];
		int[] rightarray=new int[n2];
		//copy data to temp array
		for( int i=0;i<n1;i++) {
			leftarray[i]=arr[start+i];
		}
		for( int i=0;i<n2;i++) {
			rightarray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) {
				arr[k]=leftarray[i];
				i++;
			}else {
				arr[k]=rightarray[j];
				j++;
			}
			k++;
		}
		//all remaining elements of array leftarray
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		////all remaining elements of array rightarray
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		System.out.println(start+","+mid+","+end);
		System.out.println(Arrays.toString(leftarray));
		System.out.println(Arrays.toString(rightarray));
		System.out.println("--------------");
	}
	
	public static void mergeSort(int[] arr,int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			//left tree of the sort
			mergeSort(arr,start,mid);
			//right sub tree
			mergeSort(arr,mid+1,end);
			//merge the arrays
			merge(arr,start,mid,end);
		}
	}

}
