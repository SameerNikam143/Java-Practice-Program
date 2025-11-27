package com.tech.array;

import java.util.Arrays;

public class SumOfNegativeNum {

	public static void main(String[] args) {
		int []arr= {10, -23, 45, -10, 30};
		int sumOfNegativeNum=0;
		for(Integer num:arr) {
			if(num<0) {
				sumOfNegativeNum+=num;
			}
		}
		
		System.out.println(sumOfNegativeNum);
		
		//using java 1.8

		int sum = Arrays.stream(arr).filter(t->t<0).sum();
		System.out.println(sum);
	}
}
