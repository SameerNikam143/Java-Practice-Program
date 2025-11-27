package com.tech.string;

public class ContainDigitsOrLetters {

	public static void main(String[] args) {
		String str="same45hhh";
		boolean containLetterOrDigit=true;
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetterOrDigit(str.charAt(i))) {
				containLetterOrDigit=false;
			}
		}
		
		System.out.println(containLetterOrDigit?"Contain Letter or Digits":"Not Contain Letter or Digits");
	}
}
