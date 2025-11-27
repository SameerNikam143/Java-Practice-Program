package com.tech.array;

import java.util.Arrays;

public class FindSecondSmallest {

	public static void main(String[] args) {
		int[] arr= {10, 20, 5, 2, 30};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j] ) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
		
		int asInt = Arrays.stream(arr).sorted().skip(1).findFirst().getAsInt();
		System.out.println(asInt);
		
	}
}
