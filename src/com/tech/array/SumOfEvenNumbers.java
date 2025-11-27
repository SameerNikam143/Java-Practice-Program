package com.tech.array;

import java.util.Arrays;

public class SumOfEvenNumbers {

	
	public static void main(String[] args) {
		
		int[] arr={56, 78, 45, 79, 34};
		
		int sumOfEvenNumbers=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sumOfEvenNumbers+=arr[i];
			}
		}
		System.out.println("Sum Of Even Numbers :"+sumOfEvenNumbers);
		
	//using java 1.8
		
		int sumofeven = Arrays.stream(arr).filter(t->t%2==0).sum();
		System.out.println(sumofeven);
	}
}
