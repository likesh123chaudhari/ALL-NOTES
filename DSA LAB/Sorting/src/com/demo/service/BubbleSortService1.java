package com.demo.service;

import java.util.Arrays;

public class BubbleSortService1 {

	public static  void bubbleSortAs(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j-1]>arr[j]) 
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
				System.out.println("Iteration:"+i);
				System.out.println(Arrays.toString(arr));
				
			}
		}
		
	}
	public static void bubbleSortDs(int[] arr) 
	{
		for (int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++) 
			{
				if(arr[j-1]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				System.out.println("Iteration:"+i);
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	
	public static void imporvedBubbleSortAs(int[] arr)
	{
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++)
	    {
			flag=false;
			for(int j=1;j<arr.length-i;j++) 
			{
				
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag=true;
				}
				if(!flag) {
					break;
				}
				System.out.println("Iteration:"+i+"------"+flag);
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	public static void imporvedBubbleSortDs(int[] arr)
	{
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++)
	    {
			flag=false;
			for(int j=1;j<arr.length-i;j++) 
			{
				
				if(arr[j-1]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag=true;
				}
				if(!flag) {
					break;
				}
				System.out.println("Iteration:"+i+"------"+flag);
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	
	
}
