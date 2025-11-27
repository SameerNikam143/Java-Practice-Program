package com.tech.number;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int[] arr= {23, 67, 15 ,89 ,45 ,12 ,77, 9, 34, 61 };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Second largest in array "+arr[arr.length-2]);
		
		
		
		
		
	}
}
