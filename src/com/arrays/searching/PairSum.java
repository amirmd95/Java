package com.arrays.searching;

import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {
		int a[]= { 1, 4, 45, 6, 10, 8 };
		int length=a.length;
		int x=16;
		pairSum(a,length,x);
	}
/* brute force solution
 * 
 
	private static void pairSum(int[] a, int length,int x) {
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]+a[j]==x)
				{
					System.out.println("the pair :"+a[i]+" "+a[j]);
				}
				
				
			}
			
		}
		
		
		
	}
	*/

	private static void pairSum(int[] a, int length, int x) {

    HashSet set=new HashSet();
    for(int i=0;i<length;i++)
    {
    	int temp=x-a[i];
    	if(set.contains(temp))
    	{
    		System.out.println("("+a[i]+" "+temp+")");;
    	}
    	set.add(a[i]);
    }
		
	}

}
