package com.tech.array;

import java.util.Arrays;

public class MoveAllZeroTOEnd {
	
	static void moveZeroElementToEnd(int[] a) {
		int len=a.length;
		int count=0;
		
		for(int i=0;i<len;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		
		while(count<len) {
			a[count++]=0;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,0,45,34,0,67,2,0,6,67,45,2,0,10};
		moveZeroElementToEnd(a);
		
		System.out.println(Arrays.toString(a));
	}
}
