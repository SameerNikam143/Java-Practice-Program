package com.tech.number;
import java.util.*;
public class EvenOddProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Its even number "+num);
		}else {
			System.out.println("Its Odd number "+num);
		}
	}
}
