package com.tech.number;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check armstrong");
		int num=sc.nextInt();
		
		int t1=num;
		int length=0;
		while(t1>0) {
			++length;
			t1/=10;
			
		}
		
		int t2=num;
		int arm=0;
		while(t2>0) {
			int rem=t2%10;
			int multi=1;
			for(int i=1;i<=length;i++) {
				multi*=rem;
			}
			arm+=multi;
			t2/=10;
			
		}
		
		if(arm==num) {
			System.out.println("Its Armstrong Number "+num);
		}else {
			System.out.println("Its Not Armstrong Number "+num);
		}
	}
}
