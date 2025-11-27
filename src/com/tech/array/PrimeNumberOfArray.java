package com.tech.array;

public class PrimeNumberOfArray {

	public static void main(String[] args) {

		int a[] = {3, 12, 21, 11, 71, 96, 19, 41, 83, 101};
 
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=2;j<a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
			}
			System.out.println(a[i]+" -"+(flag==0?"Its Prime ":"Its Not Prime"));
		}
	
	}
}
