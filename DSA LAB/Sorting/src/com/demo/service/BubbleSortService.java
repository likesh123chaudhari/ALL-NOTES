package com.demo.service;

import java.util.Arrays;

public class BubbleSortService {
//	public static void bubblesort(int [] arr) {
//		for(int i=0;i<arr.length;i++) 
//		{
//			for (int j=1;j<arr.length-i;j++) 
//			{
//				if (arr[j-1]>arr[j])
//				{
//				     int temp=arr[j];
//				     arr[j]=arr[j-1];
//				     arr[j-1]=temp;
//				     
//			   }
//			}
//			System.out.println("iteration:"+i);
//			System.out.println(Arrays.toString(arr));
//		}
//		
//	}

		public static void bubbleSortAscending(int[] arr)
		{
			for(int i =0; i<arr.length; i++)
			{
				for(int j=1; j<arr.length-i; j++)
				{
					if(arr[j-1]>arr[j])
					{
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
				
				System.out.println("Iteration : "+i);
				System.out.println(Arrays.toString(arr));
			}
		}
		
		public static void bubbleSortDescending(int[] arr)
		{
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=1; j<arr.length-i; j++)
				{
					if(arr[j-1]<arr[j])
					{
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
				}
				
				System.out.println("Iteration is: " +i);
				System.out.println(Arrays.toString(arr));
			}
		}
	
		public static void improvedBubbleSortAscending(int[] arr)
		{
			boolean flag = false;
			for(int i =0; i<arr.length; i++)
			{
				flag = false;
				for(int j=1; j<arr.length-i; j++)
				{
					if(arr[j-1]>arr[j])
					{
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
						flag = true;
					}
				}
				if(!flag)
				{
					break;
				}
				
				System.out.println("Iteration is: "+i);
				System.out.println(Arrays.toString(arr));
			}
		}
	
	
		public static void improvedBubbleSortDescending(int[] arr)
		{
			boolean flag = false;
			for(int i =0; i<arr.length; i++)
			{
				flag = false;
				for(int j=1; j<arr.length-i; j++)
				{
					if(arr[j-1]<arr[j])
					{
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
						flag = true;
					}
				}
				if(!flag)
				{
					break;
				}
				
				System.out.println("Iteration is: "+i);
				System.out.println(Arrays.toString(arr));
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	
	
	
	
}
