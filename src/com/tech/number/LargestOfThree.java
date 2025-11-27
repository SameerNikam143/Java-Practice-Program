package com.tech.number;
import java.util.*;
public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Is Greater "+num1);
		}else if(num2>num3 && num2>num1) {
			System.out.println("Is Greater "+num2);
		}else {
			System.out.println("Is Greater "+num3);
		}
		
		
	}
}
