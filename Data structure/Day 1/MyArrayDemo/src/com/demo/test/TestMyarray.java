package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.MyArray;

public class TestMyarray {

	public static void main(String[] args) {
		MyArray ob=new MyArray(5);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ob.getLength();i++) {
			System.out.println("enetr number");
			int n=sc.nextInt();
			ob.add(n);
		}
		System.out.println(ob);
		//find sum of all elements in the array
		//System.out.println("Sum : "+ob.getSum());
		//rotate array by 3 locations
		//ob.rotateArray(3);
		
		//System.out.println("after 3 rotations");
		//System.out.println(ob);
		
		//reverse array by creating a copy
		//System.out.println(Arrays.toString(ob.reverseArray(true)));
		//System.out.println(ob);
		//replace index and value
		System.out.println(Arrays.toString(ob.replaceIndexValue()));
	}

}
