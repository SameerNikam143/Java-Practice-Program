package com.tech.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenElementOfTwoArray {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 6, 7, 8, 9, 10 };

		int[] arr = new int[a1.length + a2.length];
		int index = 0;

		for (Integer num : a1) {
			if (num % 2 == 0) {
				arr[index++] = num;
			}
		}

		for (Integer num : a2) {
			if (num % 2 == 0) {
				arr[index++] = num;
			}
		}

		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}

		// using java 1.8

		int[] array = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).filter(t -> t % 2 == 0).toArray();

		System.out.println(Arrays.toString(array));
	}
}
