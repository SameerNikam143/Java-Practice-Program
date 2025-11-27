package com.tech.array;

import java.util.stream.IntStream;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] num={1,2,4,5,6,7};
		int len=7;
		int res=len*(len+1)/2;
		
		int sum=0;
		for(Integer n:num) {
			sum+=n;
		}
		
		int missingNumber=res-sum;
		System.out.println(missingNumber);
		
	//using java 1.8

	int l=	num.length+1;
	
	int expectedSum  = IntStream.rangeClosed(1, l).sum();
	
	int actualSum = IntStream.of(num).sum();
	
	int m=expectedSum-actualSum;
	
	System.out.println(m);
		

	}
}
