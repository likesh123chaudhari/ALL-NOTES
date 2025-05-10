package com.demo.tes;

import java.util.Arrays;

import com.demo.service.sorting.HeapSortAlgorithm;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {7,10,5,12,3,9,2,1};
		//HeapSortAlgorithm.heapSort(arr);
		HeapSortAlgorithm.heapSortDescending(arr);
        System.out.println(Arrays.toString(arr));
	}

}
