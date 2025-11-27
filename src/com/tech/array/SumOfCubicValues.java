package com.tech.array;

public class SumOfCubicValues {

	public static void main(String[] args) {
		
		int []arr= {1, 2, 3, 4, 5};
		
		int sumOfCubicValues=0;
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			sumOfCubicValues+=num*num*num;
		}
		System.out.println("Sum Of Cubic Values :"+sumOfCubicValues);
		
	}
}
