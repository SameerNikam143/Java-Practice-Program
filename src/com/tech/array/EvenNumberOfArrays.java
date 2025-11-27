package com.tech.array;

import java.util.Arrays;

public class EvenNumberOfArrays {

	
	public static void main(String[] args) {
		
		int arr[]={23, 45, 89, 34, 12};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
         if(arr[i]%2!=1) {
        	 System.out.println(arr[i]);
         }
		}
		
		
   //using java 1.8
		
	int[] even = Arrays.stream(arr).filter(t->t%2==0).toArray();	
	System.out.println(Arrays.toString(even));	
		
		
		
	}
}
