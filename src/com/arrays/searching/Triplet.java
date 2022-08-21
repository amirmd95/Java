package com.arrays.searching;

import java.util.HashSet;

public class Triplet {

	public static void main(String[] args) {
		int a[]={ 1, 4, 45, 6, 10, 8 };
		int sum=22;
		triple(a,sum);
		

	}
/*
	private static void triple(int[] a, int sum) {
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
		
	}
*/

	private static void triple(int[] a, int sum) {
		for(int i=0;i<a.length-2;i++)
		{
			HashSet set=new HashSet();
			int temp=sum-a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(set.contains(temp-a[j]))
				{
					int res=temp-a[j];
					System.out.println(a[i]+" "+a[j]+" "+res);
					
				}
				set.add(a[j]);
			}
		}
		
	}
}
