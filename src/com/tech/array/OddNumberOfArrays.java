package com.tech.array;

import java.util.Arrays;

public class OddNumberOfArrays {

	public static void main(String[] args) {
		int arr[]={23, 45, 67, 34, 78};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
		
	//using java 1.8 
	
	int[] odd = Arrays.stream(arr).filter(t->t%2!=0).toArray();
	System.out.println(Arrays.toString(odd));
	
	
	
	}
	
}
