package com.tech.array;

import java.util.Arrays;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
