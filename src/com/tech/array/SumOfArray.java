package com.tech.array;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
		//using java 1.8
		
		int sum2 = Arrays.stream(arr).sum();
		
		System.out.println(sum2);
		
	}
}
