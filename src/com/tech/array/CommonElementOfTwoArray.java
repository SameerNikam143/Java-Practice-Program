package com.tech.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementOfTwoArray {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30, 40, 50 };
		int[] a2 = { 10, 30, 60, 50, 70 };

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}

		// using java 1.8
		Set<Integer> set = Arrays.stream(a2).boxed().collect(Collectors.toSet());

		Set<Integer> collect = Arrays.stream(a1).filter(set::contains).boxed().collect(Collectors.toSet());

		System.out.println(collect);
	}
}
