package com.tech.number;

public class NeonNumber {
	
	public static void main(String[] args) {
		int num=9;
		int n=9*9;
		
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		
		String result=num==sum?"Its Neon Number "+num:"Its Not Neon Number "+num;
	
	  System.out.println(result);
	
	}

}
