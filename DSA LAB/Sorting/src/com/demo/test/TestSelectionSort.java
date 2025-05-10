package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.service.SelectionSortService;

public class TestSelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr= {22,25,1,6,12,10,45};
		int choice=0;
		
		do {
			System.out.println("1. Selection sort ascending \n2. Selection sort descending");
			System.out.println("3.Nth max \n 4.Nth min \n5. Exit");
			
			System.out.println("Enter the choice");
			
			choice =sc.nextInt(); 
			
			switch(choice)
			{
				case 1:
					SelectionSortService.selectionSortAsc(arr);
					break;
				case 2:
					SelectionSortService.selectionSortDesc(arr);
					break;
				case 3:
					int max = SelectionSortService.findNthMax(arr, 5);
					System.out.println("Maximum is : " +max);
					break;
				case 4:
					int min = SelectionSortService.findNthMin(arr, 4);
					System.out.println("Minimum is : " +min);
					break;
				case 5:
					sc.close();
					System.out.println("Thank you!!");
					break;
				default:
					System.out.println("wrong choice");
					break;
			}
	
		}while(choice!=5);
	}
}
