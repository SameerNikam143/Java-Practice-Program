package com.tech.string;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="madam";
		int length = str.length();
		String result="";
		for(int i=0;i<=length/2;i++) {
			if(str.charAt(i)==str.charAt(length-1-i)) {
				result="Its Palindrome";
						
			}else {
				result="Its Not Palindrome";
			}
		}
		
		System.out.println(result);
		
		
		//or
		
		String res = new StringBuffer(str).reverse().toString();
		System.out.println(str.equals(res));
	}
}
