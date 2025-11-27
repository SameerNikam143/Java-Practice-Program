package com.tech.number;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=8;
		
		int firstNum=0;
		int secondNum=1;
		
		for(int i=1;i<=num;i++) {
			System.out.println(firstNum);
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		}
		
	}
}
