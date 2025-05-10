package com.demo.tes;

import java.util.Arrays;
import java.util.stream.Stream;

import com.demo.service.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {21,2,5,1,7,8,10,3};
		//BubbleSortAlgorithm.bubbleSortAscending(arr);
		//BubbleSortAlgorithm.bubbleSortDescending(arr);
		BubbleSortAlgorithm.improvedBubbleSortDescending(arr);
		System.out.println(Arrays.toString(arr));
		//Stream.of(arr).forEach(System.out::println);

	}

}
