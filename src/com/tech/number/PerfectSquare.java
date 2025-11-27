package com.tech.number;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int num=25;
		int sqrt=(int)Math.sqrt(num);
		
		if(sqrt*sqrt==num) {
			System.out.println(num+" Is Prefect Square");
		}else {
			System.out.println(num+" Is Not Prefect Square");
		}
	}
}
