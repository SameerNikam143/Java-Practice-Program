package com.tech.string;

public class RemoveCharacterFromString {
	
	public static String removeCharacter(String str,int i) {
		return str.substring(0, i)+str.substring(i+1);
	}

	public static void main(String[] args) {
		
		String s="welcome";
		String removeCharacter = removeCharacter(s, 3);
		System.out.println(removeCharacter);
		
		
	}
}
