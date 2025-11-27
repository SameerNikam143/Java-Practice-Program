package com.tech.string;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String str="java is great";
		
		String removedWhiteSpaces = str.replaceAll(" ", "");
	System.out.println(removedWhiteSpaces);
	}
}
