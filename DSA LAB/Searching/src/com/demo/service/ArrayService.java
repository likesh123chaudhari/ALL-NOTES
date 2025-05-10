package com.demo.service;
//Searching 
//public class ArrayService 
//{
//	public static  int  sequencialSearch(int n,int[] arr) 
//	{	
//		for (int i=0;i<arr.length;i++) 
//		{
//			if( arr[i]== n)
//			{
//				return i;
//			}
//				
//		}
//		return -1;	
//	}
//}


//sequencial search
public class ArrayService
{
	public static int sequencialSearch(int num, int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num)
			{
				return i;
			}
		}
		return -1;
	}


//Binary Search
  public static int  binarySearch(int num,int low,int high,int [] arr) {
	  
	  System.out.println("binary search called "+low+"  ------  "+high);
	  if(low<=high)
	  {
		  int mid=(int)(low+high)/2;
	  
	  if(arr[mid]==num) 
	  {
		  return mid;
	  }
	  else if(arr[mid]<num){
		  return binarySearch(num,mid+1,high,arr);
		  
	  }
	  else {
		  return binarySearch(num,mid-1,low,arr);  
	  }
	  
	  
	 
  } else{
	  return -1;  
  }  
  }	



//Recursive
	public static int binarySearch1(int searchnum, int low, int high, int[] arr)
	{
		System.out.println("binary search called "+low+"  ------  "+high);
		
		//it will tell us are there numbers exists in the array
		if(low<=high)
		{
			int mid = (low+high) / 2;			
			if(arr[mid] == searchnum)
			{
				return mid;
			}
			else if(arr[mid] < searchnum)
			{
				return binarySearch(searchnum, mid+1, high, arr);
			}
			else
			{
				return binarySearch(searchnum, low, mid-1, arr);
			}
		}
		else
		{
			return -1;  
		}
	}
	



//Non-Recursive
	public static int binarySearchNR(int num,int[] arr) {
		int low=0;
	    int high=arr.length-1;
	    while(low<=high) 
	    {
	    	int mid=(low+high)/2;
	    	if(arr[mid]==num) {
	    		return mid;
	    	}
	    	else if(arr[mid]<num) {
	    		return mid+1;
	    	}
	    	else 
	    	{
	    		return mid-1;
	    	}
	    }return -1;
	}
	
}



















