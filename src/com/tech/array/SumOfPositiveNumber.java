package com.tech.array;

import java.util.Arrays;

public class SumOfPositiveNumber {

	public static void main(String[] args) {
		int []arr={1, -2, 3, 3, 4};
		int sumOfPositiveNum=0;
		for(int num:arr) {
			if(num>0) {
				sumOfPositiveNum+=num;
			}
		}
		
		System.out.println(sumOfPositiveNum);
		
		//using java 1.8
		
		int sum = Arrays.stream(arr).filter(t->t>0).sum();
		System.out.println(sum);
		
	}
}
