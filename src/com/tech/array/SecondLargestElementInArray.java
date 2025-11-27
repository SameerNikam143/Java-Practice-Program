package com.tech.array;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElementInArray {

	
	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
		
		//using java 1.8
		
		int asInt = Arrays.stream(arr).mapToObj(a->a).sorted(Comparator.reverseOrder())
		  .mapToInt(Integer::intValue).skip(1).findFirst().getAsInt();
		System.out.println(asInt);
	}
}
