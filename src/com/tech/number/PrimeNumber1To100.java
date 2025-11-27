package com.tech.number;

public class PrimeNumber1To100 {

	public static void main(String[] args) {
		
		for(int i=2;i<100;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp+=1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
		}
	}
}
