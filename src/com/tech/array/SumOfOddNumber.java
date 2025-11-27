package com.tech.array;

import java.util.Arrays;

public class SumOfOddNumber {

	public static void main(String[] args) {
		
		int[] arr= {12, 34, 59, 45, 22};
		int sumOfOddNumbers=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sumOfOddNumbers+=arr[i];
			}
		}
		
		System.out.println("Sum Of Odd Numbers :"+sumOfOddNumbers);
		
	//using java 1.8
		
	int sumofOdd = Arrays.stream(arr).filter(t->t%2!=0).sum();
	System.out.println(sumofOdd);
	
	}
}
