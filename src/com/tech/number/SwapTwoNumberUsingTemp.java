package com.tech.number;

public class SwapTwoNumberUsingTemp {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		System.out.println("----------------");
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
	}
}
