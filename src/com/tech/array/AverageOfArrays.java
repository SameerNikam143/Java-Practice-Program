package com.tech.array;

import java.util.*;

public class AverageOfArrays {

	public static void main(String[] args) {
		
		int[] arr={1, 2, 3, 4, 5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		double average=sum/arr.length;
		
		System.out.println(average);
		
		
	//using java 1.8 
		
		double average1 = Arrays.stream(arr).average().getAsDouble();
		System.out.println(average1);
		
		
	}
}
