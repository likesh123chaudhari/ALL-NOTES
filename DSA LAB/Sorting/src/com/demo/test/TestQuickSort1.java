package com.demo.test;

import java.util.Arrays;


import com.demo.service.QuickSortService1;

public class TestQuickSort1 
{

	public static void main(String[] args) 
	{
		int[] arr = {6,3,7,8,8,4,3,9,1,10};
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------");
		
		QuickSortService1.partition(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
