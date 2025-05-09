package com.demo.service.sorting;

import java.util.Arrays;

public class CountSortAlgorithm {
	public static int[] coutSort(int arr[]) {
		//find maximum number
		int max=findMax(arr);  
		System.out.println("max : "+max);
		//create a count array of size max+1
		int[] count=new int[max+1];
		//initialize all elements to 0
		for(int i=0;i<count.length;i++) { 
			count[i]=0;
		}
		
		
		//add count of indivitual elements in count array
		for(int i=0;i<arr.length;i++) { 
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
		//find cumulative sum
		for(int i=1; i<count.length;i++) { 
			count[i]=count[i-1]+count[i];
		}
		System.out.println(Arrays.toString(count));
		//create output array of size arr
		int[] output=new int[arr.length];
		//place numbers using cumulative sum in output array
		
		for(int i=0;i<arr.length;i++) {
			int pos=count[arr[i]]-1;
			output[pos]=arr[i];
			count[arr[i]]--;
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

}
