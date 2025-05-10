package com.demo.service;

import java.util.Arrays;

public class MergeSortService 
{
	public static void merge(int[] arr, int start, int mid, int end)
	{
		//length of leftarray
		int left = mid - start+1;
		
		//length of rightarray
		int right = end-mid;
		
		//create temporary arrays for storing the elements
		int[] leftarr = new int[left];
		int[] rightarr = new int[right];
		
		//copy the elements into the left temporary array
		for(int i=0; i<left; i++)
		{
			leftarr[i] = arr[start + i];
		}
		
		//copy the elements into the right temporary array
		for(int i =0; i<right; i++)
		{
			rightarr[i] = arr[mid + 1 + i];
		}
		
		int i=0;
		int j=0;
		int k = start;
		
		while(i<left && j<right) 
		{
			if(leftarr[i] < rightarr[j]) 
			{
				arr[k] = leftarr[i]; 
				i++; 
				k++;
			}
			else
			{
				arr[k] = rightarr[j]; 
				j++;
				k++;
			}
		}
		
		//take all remaining elements from leftarray
		while(i<left)
		{
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		
		
		//take all remaining elements from rightarray
		while(j<right)
		{
			arr[k] = rightarr[j];
			j++;
			k++;
		}
		
		System.out.println(start + "," + mid + "," + end);
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));
	}
		
		public static void mergeSort(int[] arr, int start, int end)
		{
			if(start < end)
			{
				int mid = (start + end)/2;
				
				//sort left subtree
				mergeSort(arr, start, mid);
				
				//sort right subtree
				mergeSort(arr, mid+1, end);
				
				//merge the arrays
				merge(arr, start, mid, end);
			}
		}
		
		
		
		
		
		
	
	
}
