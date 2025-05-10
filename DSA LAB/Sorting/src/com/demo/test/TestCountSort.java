package com.demo.test;

import java.util.Arrays;

import com.demo.service.CountSortService;

public class TestCountSort 
{

	public static void main(String[] args) 
	{
		
		int[] arr = {2,9,7,4,1,8,4};
		System.out.println("Original array:" + Arrays.toString(arr));
		System.out.println("---------------------------------------");
		
		CountSortService.countSort(arr);
		
	}

}
