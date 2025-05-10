package com.demo.test;

import java.util.Arrays;

import com.demo.service.MergeSortService;

public class TestMergeSort {

	public static void main(String[] args) 
	{
		int[] arr = {2, 10, 5, 7, 9, 3, 4, 11};
		
		MergeSortService.mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
