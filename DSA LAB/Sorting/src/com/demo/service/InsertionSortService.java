package com.demo.service;

import java.util.Arrays;

public class InsertionSortService 
{
	
	public static void insertionSort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			//Pick the element
			int temp = arr[i];
			 
		 	//take last position of sorted array
			int last = i-1;
			
			
			//shift the greater elements to right
			while(last>=0 && arr[last]>temp)
			{
				arr[last+1]=arr[last];
				last--;
				
			}
			
			
			//insert the elements
			arr[last+1]=temp;
			System.out.println(Arrays.toString(arr));
			
			
		
			
		}
	}
	
	
}
