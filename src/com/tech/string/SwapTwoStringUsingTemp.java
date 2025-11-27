package com.tech.string;

public class SwapTwoStringUsingTemp {

	public static void main(String[] args) {

		String a = "hello";
		String b = "world";
		System.out.println(a);
		System.out.println(b);

		System.out.println("--------------------");
		String temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}
