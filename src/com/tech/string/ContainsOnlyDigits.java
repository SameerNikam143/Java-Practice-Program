package com.tech.string;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		
		String str="12d3";
		boolean digits=true;
		for(Character ch:str.toCharArray()) {
			if(!Character.isDigit(ch)) {
				digits=false;
			}
		}
		
		System.out.println(digits?"Its Contain Only Digits":"Its Does Not Contain Digits");
	}
}
