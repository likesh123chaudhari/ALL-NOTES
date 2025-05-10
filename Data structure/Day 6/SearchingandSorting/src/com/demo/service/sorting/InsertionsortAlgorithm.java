package com.demo.service.sorting;

import java.util.Arrays;

public class InsertionsortAlgorithm {
  public static void insertionSortAscending(int[] arr) {
	  for(int i=1;i<arr.length;i++) {  
		  //choose the element
		  int key=arr[i];
		  //last position of sorted array
		  int j=i-1;
		  //shift greater values to the right
		  while(j>=0 && arr[j]>key) { 
			  arr[j+1]=arr[j];
			  j--;
		  }
		  arr[j+1]=key;
		  System.out.println(Arrays.toString(arr));
	  }
  }
}
