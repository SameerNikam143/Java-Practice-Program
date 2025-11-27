package com.tech.array;

import java.util.Arrays;

public class MaxAndMinValueOfArrays {

	public static void main(String[] args) {
		
		int num[]= {23, 4, 32, 5, 75};
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("Min Value of Array :"+num[0]);
		System.out.println("Max Value of Array :"+num[num.length-1]);
	
	//using java 1.8
		
	int max = Arrays.stream(num).max().getAsInt();
		System.out.println(max);
	int min = Arrays.stream(num).min().getAsInt();
		System.out.println(min);
	}
}
