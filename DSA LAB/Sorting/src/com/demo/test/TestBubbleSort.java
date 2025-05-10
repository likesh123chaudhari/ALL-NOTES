package com.demo.test;

import java.util.Scanner;

import com.demo.service.BubbleSortService;
import com.demo.service.BubbleSortService1;

public class TestBubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr= {22,25,1,6,12,10,45};
		int choice=0;
		
		do {
			System.out.println("1. Bubble sort ascending \n2. Bubble sort descending");
			System.out.println("3. Improved Bubble sort ascending \n4. Improved Bubble sort descending\n5. Exit");
			
			System.out.println("Enter the choice");
			
			choice =sc.nextInt(); 
			
			switch(choice)
			{
			case 1:
//					BubbleSortService.bubbleSortAscending(arr);
				BubbleSortService1.bubbleSortAs(arr);
				break;
			case 2:
//					BubbleSortService.bubbleSortDescending(arr);
				BubbleSortService1.bubbleSortDs(arr);
				break;
			case 3:
//					BubbleSortService.improvedBubbleSortAscending(arr);
				BubbleSortService1.imporvedBubbleSortAs(arr);
				break;
			case 4:
//					BubbleSortService.improvedBubbleSortDescending(arr);
				BubbleSortService1.imporvedBubbleSortDs(arr);
				break;
			case 5:
				sc.close();
				System.out.println("Thank you!!");
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			}
			
		}while(choice!=5);
		
		
	}

}
