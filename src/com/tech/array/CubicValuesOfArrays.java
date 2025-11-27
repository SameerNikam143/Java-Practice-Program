package com.tech.array;

import java.util.Arrays;

public class CubicValuesOfArrays {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		
		int[] c=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			c[i]=arr[i]*arr[i]*arr[i];
		}
		
		System.out.println(Arrays.toString(c));
		
		
	//using java 1.8
		
	int[] cubic = Arrays.stream(arr).map(a->a*a*a).toArray();
	System.out.println(Arrays.toString(cubic));	
  
		
	}
}

