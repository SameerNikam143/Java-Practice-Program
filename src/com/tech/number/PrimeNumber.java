package com.tech.number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		int num=sc.nextInt();
		
		int temp=0;
		for(int i=2;i<num;i++) {
		
		if(num%i==0) {
			temp=temp+1;
			
		}
		}
		
		if(temp==0) {
			System.out.println("Its Prime Number "+num);
		}else {
			System.out.println("Its Not Prime Number "+num);
		}
		
	}
}
