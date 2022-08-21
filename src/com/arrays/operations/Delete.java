package com.arrays.operations;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key=");
		int key=sc.nextInt();
        delete(arr,size,key);
	}

	private static void delete(int[] arr, int size, int key) {
		int index=findIndex(arr,size,key);
		for(int i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<size-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	private static int findIndex(int[] arr, int size, int key) {
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]==key)
			{
				return i;
				
			}
		}
		return -1;
	}
}
	
