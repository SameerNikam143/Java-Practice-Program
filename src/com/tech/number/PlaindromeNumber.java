package com.tech.number;

public class PlaindromeNumber {

	public static void main(String[] args) {
		int num=1211;
		int t=num;
		int rev=0;
		while(t>0) {
			int rem=t%10;
			rev=rev*10+rem;
			t/=10;
		}
		
		
		if(num==rev) {
			System.out.println("Its Plaindrome Number "+num);
		}else {
			System.out.println("Its Not Plaindrome Number "+num);
		}
	}
}
