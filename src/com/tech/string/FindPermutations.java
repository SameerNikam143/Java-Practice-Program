package com.tech.string;

public class FindPermutations {

	public static void findPermutations(String str,String prefix) {
		if(str.isEmpty()) {
			System.out.println(prefix);
		}else {
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				
				String remaining=str.substring(0, i)+str.substring(i+1);
				findPermutations(remaining, prefix+ch);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str="ABC";
		
		findPermutations(str, "");
	}
}
