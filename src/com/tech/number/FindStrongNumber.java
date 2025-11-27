package com.tech.number;

public class FindStrongNumber {

	public static void main(String[] args) {
		int num=145;
		int t=num;
		int sum=0;
		while(t>0) {
			int rem=t%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			
			sum=sum+fact;
			t/=10;
			
		}
		
		if(num==sum) {
			System.out.println("Its Strong Number "+num);
		}else {
			System.out.println("Its Not Strong Number "+num);
		}
		
		
	}
}
