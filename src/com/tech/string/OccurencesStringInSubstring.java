package com.tech.string;

public class OccurencesStringInSubstring {

	public static void main(String[] args) {
		
		String str="java is great. java is fun. java is powerful";
		
		String word="java";
		
		String[]parts = str.split(word, -1);
  
	int count=	parts.length-1;
		
	System.out.println(count);	
	}
}
