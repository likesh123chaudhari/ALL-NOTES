package com.demo.tes;

import java.util.Scanner;

import com.demo.service.searching.ArrayService;

public class TestSearch {

	public static void main(String[] args) {
		int[] arr= {23,24,12,6,7,56,7};
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enetr number for searching");
		int n=sc.nextInt();
		int pos=ArrayService.sequentialSearch(n,arr);
		if(pos!=-1) {
			System.out.println("Number found at position : "+pos);
		}else {
			System.out.println("number not found");
		}*/
		int[] arr1= {1,3,4,6,15,17,45,68};
		System.out.println("enetr number for searching");
		int searchnum=sc.nextInt();
		//int pos1=ArrayService.binarySearch(searchnum, 0, arr1.length-1, arr1);
		int pos1=ArrayService.binarySearchNonRecurssive( arr1,searchnum);
		if(pos1!=-1) {
			System.out.println("Number found at position : "+pos1);
		}else {
			System.out.println("number not found");
		}

	}

}
