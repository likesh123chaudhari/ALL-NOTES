package com.demo.test;

import java.util.Scanner;

import com.demo.service.ArrayService;

public class TestSearch 
{
// public static void main(String[] args) 
// {
//	 int arr[]= {22,24,23,255,6,4,10};
//	 Scanner sc=new Scanner(System.in);
//	 System.out.println("enter the number");
//	 int n=sc.nextInt();
//	 int pos=ArrayService.sequencialSearch(n, arr);
//			 
//		 if(pos!=-1) {
//			 System.out.println("number is found");
//		 }
//		 else
//		 {
//			 System.out.println("not Found");
//		 }
//	 }

	 
//	public static void main(String[] args) 
//	{	
//		Scanner sc  = new Scanner(System.in);
//		int arr[] = {5,10,6,4,15,85};
//		System.out.println("Enter the number for searching");
//		int num = sc.nextInt();
//		
//		int pos = ArrayService.sequencialSearch(num, arr);
//		
//		if(pos != -1)
//		{
//			System.out.println("Number is found");
//		}
//		else
//		{
//			System.out.println("Number is not found");
//		}
//	}
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int arr[]= {1,12,13,14,25,26,27};
//		System.out.println("enter the number for binary search");
//		int num=sc.nextInt();
//		int pos = ArrayService.binarySearch(num,0,arr.length-1,arr);
//				{
//
//			if(pos != -1)
//			{
//				System.out.println("Number is found");
//			}
//			else
//			{
//				System.out.println("Number is not found");
//			}
//		}
//	}
	
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int arr[] = {10,20,25,36,49,64,81};
//		
//		System.out.println("Enter the number for binary searching");
//		int searchnum = sc.nextInt();
//		
//		int pos = ArrayService.binarySearch(searchnum, 0, arr.length-1, arr);
//		if(pos != -1)
//			{
//				System.out.println("Number is found");
//			}
//			else
//			{
//				System.out.println("Number is not found");
//			}
//		
//	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,25,36,49,64,81};
		
		System.out.println("Enter the number for binary searching");
		int num = sc.nextInt();
		int pos = ArrayService.binarySearchNR(num,arr);
		if(pos != -1)
			{
				System.out.println("Number is found");
			}
			else
			{
				System.out.println("Number is not found");
			}
		
	}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}	
 
 

