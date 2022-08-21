package com.arrays.searching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int uniqueValue=unique(arr,size);
		System.out.println(uniqueValue);

	}
//Approch 3
	//2*(sum of element without duplicate)-sum of array
	private static int unique(int[] arr, int size) {
		int sum1 = 0,sum2=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				sum1=sum1+arr[i];
				map.put(arr[i], 1);
				
			}
			sum2=sum2+arr[i];
		}
		int res=2*sum1-sum2;
		return res;
		
	}

	/*
	 * Approch 2
	 * private static int unique(int[] arr, int size) {
	
		int XOR=0;
		
		for(int i=0;i<size;i++)
		{
			XOR=XOR^arr[i];
			
		}
		return XOR;
	}
	 */

	

/*
 * Approch 1
 * 	private static int unique(int[] arr, int size) {
		for(int i=1;i<size;i++)
		{
			int c=0;
			for(int j=i-1;j<size;j++)
			{
				
					if(arr[i]==arr[j] && i!=j)
					{
						c++;
					}
				
			}
			if(c==0)
			{
				return arr[i];
			}
		}
		return 0;
	}
	*/

}
