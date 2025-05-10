package com.demo.service;

import java.util.Arrays;

public class CountSortService 
{
	public static int[] countSort(int arr[]) 
	{
		//find the maximum number
	     int max = findMax(arr);
	     
	     
	     System.out.println(Arrays.toString(arr));
	     System.out.println("Maximum number is : " +max);
	     System.out.println("-------------------------------");
	     
	     //create a count array of size max+1
	     int[] count = new int[max+1];
	     
	     System.out.println("create a count array of size max+1");
	     System.out.println(Arrays.toString(count));
	     System.out.println("-------------------------------");
	     
	     
	     //initialize all elements to 0 
	     for(int i=0; i<count.length; i++)
	     {
	    	 count[i] = 0;
	     }
	     
	     System.out.println("initialize all elements to 0 ");
	     System.out.println(Arrays.toString(count));
	     System.out.println("-------------------------------");
	     
	     //add count of individual elements in count array
	     for(int i=0; i<arr.length; i++)
	     {
	    	 count[arr[i]]++;
	     }
	     System.out.println("count of individual elements");
	     System.out.println(Arrays.toString(count));
	     System.out.println("-------------------------------");
	     
	     //find cumulative sum
	     for(int i=1; i<count.length; i++)
	     {
	    	count[i] = count[i-1] + count[i];
	     }
	     
	     System.out.println("cumulative sum :");
	     System.out.println(Arrays.toString(count));
	     System.out.println("-------------------------------");
	     
	     
	     //create resultant array of size arr
	     int[] res = new int[arr.length];
	     
	     System.out.println("create resultant array of size arr");
	     System.out.println(Arrays.toString(res));
	     System.out.println("-------------------------------");
	     
	     //place the numbers using cumulative sum in the resultant array
	     for(int i=0; i<arr.length; i++)
	     {
	    	 int index = count[arr[i]]-1;
	    	 res[index] = arr[i];
	    	 count[arr[i]]--;
	     }
	     
	     System.out.println("RESULTANT ARRAY IS : ");
	     System.out.println(Arrays.toString(res));
	     
		return res;
	     
	     
	}

	private static int findMax(int[] arr) 
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

}
