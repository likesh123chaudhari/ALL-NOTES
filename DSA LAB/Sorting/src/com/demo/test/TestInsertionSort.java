package com.demo.test;

import java.util.Arrays;

import com.demo.service.InsertionSortService;

public class TestInsertionSort 
{

	public static void main(String[] args) 
	{
		int[] arr={3,7,9,8,1,2};
		System.out.println("Original array:" + Arrays.toString(arr));
		System.out.println("---------------------------------------");
		InsertionSortService.insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
