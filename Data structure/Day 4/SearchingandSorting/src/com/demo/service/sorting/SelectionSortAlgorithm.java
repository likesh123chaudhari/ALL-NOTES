package com.demo.service.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {
	private static int findMin(int [] arr,int start,int end) {
             int minidx=start;
             int min=arr[start];
             for(int i=start+1;i<end;i++) {
            	 if(arr[i]<min) {
            		 min=arr[i];
            		 minidx=i;
            	 }
             }
             return minidx;
             
	}
	
	public static void selectionSortAscending(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			//find minimum number from unsorted array
			int minidx=findMin(arr,i,arr.length);
			//swap number at minidx with starting position of unsorted array
			int temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
			System.out.println("iteration "+i+"-->"+i+"Swapped with "+minidx);
			System.out.println(Arrays.toString(arr));
			
		}
	}
	
	public static void selectionSortDescending(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			//find minimum number from unsorted array
			int maxidx=findMax(arr,i,arr.length);
			//swap number at maxidx with starting position of unsorted array
			int temp=arr[i];
			arr[i]=arr[maxidx];
			arr[maxidx]=temp;
			System.out.println("iteration "+i+"-->"+i+"Swapped with "+maxidx);
			System.out.println(Arrays.toString(arr));
			
		}
	}
	
	private static int findMax(int[] arr,int start, int end) {
		int maxidx=start;
		int max=arr[start];
		for(int i=start+1;i<end;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxidx=i;
			}
		}
		return maxidx;
	}
	
	public static int findNthMax(int[] arr, int n) {
		int maxidx=-1;
		int i=0;
		for( i=0;i<n;i++) {
			maxidx=findMax(arr, i, arr.length);
			System.out.println("max number "+i+"--->"+arr[maxidx]);
			if(i<n-1) {
			  int temp=arr[i];
			  arr[i]=arr[maxidx];
			  arr[maxidx]=temp;
			}
			
		}
		System.out.println("max number "+n+"--->"+arr[maxidx]);
		return arr[maxidx];
	}

}
