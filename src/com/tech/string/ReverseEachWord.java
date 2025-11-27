package com.tech.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str="java is great and fun";
		StringBuffer result = new StringBuffer();
		for(String word:str.split("\\W+")) {
			StringBuffer sb = new StringBuffer();
			sb.append(word).reverse().append(" ");
			result.append(sb);
		}
		System.out.println(result);
		
	}
}
