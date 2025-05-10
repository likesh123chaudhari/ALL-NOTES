package com.demo.service;

import java.util.Arrays;

public class QuickSortService1 
{
	public static int partition(int[] arr, int start, int end)
	{
		int pivot=start;
		int i = start;
		int j = end;
		
		while(i<j)
		{
	
			//increment i
			while(i<end && arr[i]<= arr[pivot])
			{
				i++;
				System.out.println("increment i : " +i);
				System.out.println(Arrays.toString(arr));
			}
			
			//decrement j
			while(j>pivot && arr[j]> arr[pivot])
			{
				j--;
				System.out.println("decrement j : " +j);
				System.out.println(Arrays.toString(arr));
			}
			
			//if i<j then swap i & j
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				System.out.println("------------------------------");
				System.out.println("Swapped i & j" + Arrays.toString(arr));
			}
		}
		
		//if above condition is false then swap pivot & j
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j] = temp;
		
		System.out.println("------------------------------");
		System.out.println("Swapped pivot & j" + Arrays.toString(arr));
		
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Pivot position : "+j+", Pivot number : " +arr[j]);
		
		System.out.println(j+ " " + "swapped with " + pivot);
	
		return j;
	}
	
	public static void quickSort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			//this stores pivot in p position and return it
			int p = partition(arr,start, end);
			
			quickSort(arr, start, p-1);
			
			quickSort(arr, p+1, end);
		}
	}
	
	
	
}
