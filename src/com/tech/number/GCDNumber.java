package com.tech.number;

public class GCDNumber {
	
	public static int findGcd(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return findGcd(b, a%b);
		}
	}

	public static void main(String[] args) {
		int num1=54;
		int num2=24;
		
		int gcd = findGcd(num1, num2);
		
		System.out.println("Gcd f Two Number is "+gcd);
		
	}
}
