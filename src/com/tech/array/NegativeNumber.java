package com.tech.array;

import java.util.Arrays;

public class NegativeNumber {

	public static void main(String[] args) {
		int arr[]= {-45, 32, -7, 3, -6};
		
		for(Integer n:arr) {
			if(n<0) {
				System.out.println(n);
			}
		}
		
		
//using java 1.8
		
	int[] negative = Arrays.stream(arr).filter(t->t<0).toArray();
	System.out.println(Arrays.toString(negative));	
	
	
	}
}
