package com.tech.string;

public class ContainOnlyLetters {

	public static void main(String[] args) {
		String str="same6er";
		boolean letters=true;
		for(Character ch:str.toCharArray()) {
			if(!Character.isLetter(ch)) {
				letters=false;
			}
		}
		
		System.out.println(letters?"Contain Only Letters":"Not Contian Letters");
	}
}
