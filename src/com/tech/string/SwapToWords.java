package com.tech.string;

public class SwapToWords {

	public static void main(String[] args) {
		String a="hello";
		String b="world";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------");
		a=a+b;
		b=a.substring(0, b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}
}
