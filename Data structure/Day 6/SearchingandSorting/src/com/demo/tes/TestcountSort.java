package com.demo.tes;

import java.util.Arrays;

import com.demo.service.sorting.CountSortAlgorithm;

public class TestcountSort {

	public static void main(String[] args) {
		int[] arr= {5,7,3,2,7,6,9,9,8};
		int[] result=CountSortAlgorithm.coutSort(arr);
		System.out.println("Result : "+Arrays.toString(result));
	}

}
