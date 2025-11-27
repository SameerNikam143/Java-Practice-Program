package com.tech.array;

import java.util.Arrays;

public class PositiveNumber {

	
	public static void main(String[] args) {
		int arr[]={67, -4, 3, -5, 44};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}

	//using java 1.8
		
   int[] positive = Arrays.stream(arr).filter(t->t>0).toArray();
   System.out.println(Arrays.toString(positive));

	}
}
