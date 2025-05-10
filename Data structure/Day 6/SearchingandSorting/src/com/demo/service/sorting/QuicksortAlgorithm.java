package com.demo.service.sorting;

import java.util.Arrays;

public class QuicksortAlgorithm {
	public static int partition(int[] arr,int start,int end) {
		int pivot=start;
		int i=start;
		int j=end;
		while(i<j) {
			//increment i
			while(i<end && arr[i]<=arr[pivot])
				i++;
			//decrement  j
			while(j>pivot && arr[j]>arr[pivot])
				j--;
			
			//if i<j swap i, j
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swap pivot and j
		int temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		System.out.println(Arrays.toString(arr));
		System.out.println("Pivot position : "+j+",Pivot number : "+arr[j]);
		System.out.println(j+"swapped with "+pivot);
		return j;
		
	}
	public static void quickSort(int[] arr,int start,int end) {
		//it places pivot at p position and return it
		if(start<end) {
		   int p=partition(arr,start,end);
		   quickSort(arr,start,p-1);
		   quickSort(arr,p+1,end);
		}
	}

}
