package com.tech.array;

public class SearchElementInArray {

	
	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		
		int search=30;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element :"+search);
				System.out.println("index of element :"+i);
				System.out.println("position :"+(i+1));
				break;
			}
		}
		
	
		
	}
}
