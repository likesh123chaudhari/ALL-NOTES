package com.demo.tes;

import java.util.Arrays;

import com.demo.service.sorting.QuicksortAlgorithm;

public class TestQuicksortAlgorithm {

	public static void main(String[] args) {
		int[] arr= {6,3,7,8,8,4,3,9,1,10};
		QuicksortAlgorithm.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
