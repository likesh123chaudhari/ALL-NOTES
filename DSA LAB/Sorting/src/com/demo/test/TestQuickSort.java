package com.demo.test;

import java.util.Arrays;

import com.demo.service.QuicksortService;

//import com.demo.service.sorting.QuicksortAlgorithm;

public class TestQuickSort {

	public static void main(String[] args) {
		int[] arr= {6,3,7,8,8,4,3,9,1,10};
		QuicksortService.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
