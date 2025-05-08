package com.demo.tes;

import java.util.Arrays;

import com.demo.service.sorting.SelectionSortAlgorithm;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr= {12,34,2,5,45,36,7,58};
		//SelectionSortAlgorithm.selectionSortAscending(arr);
		//SelectionSortAlgorithm.selectionSortDescending(arr);
		
		//System.out.println(Arrays.toString(arr));
		int max=SelectionSortAlgorithm.findNthMax(arr, 5);
		System.out.println("5 rd maximum : "+max);
		

	}

}
