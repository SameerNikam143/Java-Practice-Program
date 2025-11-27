package com.tech.array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDublicateFromArray {
	
	

	public static void main(String[] args) {
		int[] arr={10, 10, 20, 20, 30};
		
	/*	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int num:arr) {
			set.add(num);
		}
		
		int[] array = set.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(array));
*/
		

		int n=arr.length;
		
		//Arrays.sort(arr);
		
		int temp[]=new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
		
		
		int[] array = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(array));
	}
}
