package com.tech.number;

public class CountDigits {

	public static void main(String[] args) {
		
		int num=124465;
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		
		System.out.println("Number of Digits "+count);
	}
}
