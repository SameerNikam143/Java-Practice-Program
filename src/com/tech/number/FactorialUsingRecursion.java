package com.tech.number;
import java.util.*;
public class FactorialUsingRecursion {
	
	public static int findFactorial(int n) {
		if(n<=1) {
			return n;
		}else {
			return n*findFactorial(n-1);
		}
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int num=sc.nextInt();
		
		int factorial = findFactorial(num);
		
		System.out.println(factorial);
		
	}
}
