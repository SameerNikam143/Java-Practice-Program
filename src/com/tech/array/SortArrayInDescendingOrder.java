package com.tech.array;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		
		int[] arr= {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

		//using java 1.8
		
		int[] array = Arrays.stream(arr)
		   .mapToObj(a->a).sorted(Comparator.reverseOrder())
               .mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(array));
		
		Object[] array2 = Arrays.stream(arr).mapToObj(a->Integer.valueOf(a)).sorted(Comparator.reverseOrder()).toArray();
		
	   System.out.println(Arrays.toString(array2));	
		
	}
}
