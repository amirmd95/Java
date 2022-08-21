package com.arrays.operations;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the capacity of an array");
		int capacity=sc.nextInt();
		int arr[]=new int[capacity];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		insert(arr,size,capacity);

	}

	private static void insert(int[] arr, int size,int capacity) {
		int key=20;
		if(size>=capacity)
		{
			System.out.println("Not Possibe");
		}
		else {
		arr[size]=key;
		System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
