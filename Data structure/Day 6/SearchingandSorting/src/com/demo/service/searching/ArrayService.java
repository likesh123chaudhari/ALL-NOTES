package com.demo.service.searching;

public class ArrayService {
	public static int sequentialSearch(int n,int[] arr) {
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]==n) {
				  return i;
			  }
		  }
		  return -1;
	}
	public static int binarySearchNonRecurssive(int[] arr,int searchnum) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(int)(low+high)/2;
			if(arr[mid]==searchnum) {
				return mid;
			}else if(arr[mid]<searchnum) {
				low=mid+1;
			}else {
				high=mid-1;
			}
						
		}
		return -1;
	}
	
	public static int binarySearch(int searchnum,int low,int high,int[] arr) {
		//it will tell us are there numbers exists in the array
		System.out.println("binary search called "+low+"  ------  "+high);
		if(low<=high) {
			//find mid position
			int mid=(int)(low+high)/2;
			if(arr[mid]==searchnum) {
				return mid;
			}else if(arr[mid]<searchnum) {
				return binarySearch(searchnum,mid+1,high,arr);
			}else {
				return binarySearch(searchnum,low,mid-1,arr);
			}
		}else {
			return -1;
		}
	}

}
