package com.arrays.searching;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=repetative(arr,size);
		System.out.println(res);

	}

	private static int repetative(int[] arr, int size) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int ele:arr)
		{
			if(!map.containsKey(ele))
			{
				
				map.put(ele, 1);
			}
			return ele;
	
		}
		System.out.println(map);
		return -1;
	}
	
	 
//Brute Force solution 
	//Time complexity=O(n^2)
	//Space complexity=O(1)
	/*
	 * private static int repetative(int[] arr, int size) {
	
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count++;
				}
			}
			if(count>0)
			{
				return arr[i];
			}

		}
		return -1;
		 */
	}
	
/*
 * XOR Solution 
 * 1. Computing XOR for 1 to N-1 number
 * 2.Computing XOR for Array Element
 * 3.Compute above two
 * 

	
	private static int repetative(int[] arr, int n) {
		int res = 0;
        for (int i = 0; i < n - 1; i++)
            res = res ^ (i + 1) ^ arr[i];
        res = res ^ arr[n - 1];
             
        return res;
	}
 */


