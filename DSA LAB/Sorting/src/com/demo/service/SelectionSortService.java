package com.demo.service;

import java.util.Arrays;

public class SelectionSortService 
{
	private static int findMin(int[] arr, int start, int end)
	{
		int minindex = start;
		int minvalue = arr[start];
		
		for(int i=start+1; i<end; i++)
		{
			if(arr[i]<arr[minindex])
			{
				minvalue = arr[i];//2
				minindex = i;//1
			}
		}
		return minindex;
	}
	
	public static void selectionSortAsc(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int minindex=findMin(arr, i, arr.length);
			
			
			int temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		
		System.out.println("Iteration is :" +i + "--->" + i + "swapping with" + minindex);
		System.out.println(Arrays.toString(arr));
		}
	}
	
	
	public static int findMax(int[] arr,int start,int end ) 
	{
		int maxindex=start;
        int maxvalue =arr[start];
        for (int i=start+1;i<end;i++)
        {
        	if(arr[i]>arr[maxindex])
        	{
        		maxvalue =arr[i];
        		maxindex=i;       
        	}
        
        }	return maxindex;
	}  
       
        public static void selectionSortDesc(int[] arr)
        {
        	for(int i=0; i<arr.length-1; i++)
        	{
        		int maxindex = findMax(arr, i, arr.length);
        		
        		int temp = arr[i];
        		arr[i] = arr[maxindex];
        		arr[maxindex] = temp;
        		
        		System.out.println("Iteration is : "+i + "--->" + i + "swapped with " + maxindex);
        		System.out.println(Arrays.toString(arr));
        	}
        }
        
        	
        public static int findNthMax(int[] arr, int num)
        {
        	int maxindex=-1;
        	
        	
        	for(int i=0; i<num; i++)
        	{
        		maxindex = findMax(arr, i, arr.length);
        		
        		System.out.println("Max no is : "+arr[maxindex]);
        		
        		if(i<num-1)
        		{
        			int temp = arr[i];
        			arr[i] = arr[maxindex];
        			arr[maxindex] = temp;
        		}
        	}
        	System.out.println("Max no is : "+arr[maxindex]);
        	return arr[maxindex];
        	
        }
        
        public static int findNthMin(int[] arr, int num)
        {
        	int minindex = -1;
        	
        	for(int i=0; i<num; i++)
        	{
        		minindex = findMin(arr,i,arr.length);
        		
        		if(i>num+1)
        		{
        			int temp = arr[i];
        			arr[i] = arr[minindex];
        			arr[minindex] = temp;
        		}
        	}
        	System.out.println("Min no is : "+arr[minindex]);
        	return arr[minindex];
        	
        		
        	
        }
	
}



















