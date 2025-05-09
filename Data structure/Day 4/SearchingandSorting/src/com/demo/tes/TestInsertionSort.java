package com.demo.tes;

import java.util.Arrays;

import com.demo.service.sorting.InsertionsortAlgorithm;

public class TestInsertionSort {
public static void main(String[] args) {
	int[] arr= {3,2,5,1,7,8,5,9};
	InsertionsortAlgorithm.insertionSortAscending(arr);
	System.out.println(Arrays.toString(arr));
}

}
