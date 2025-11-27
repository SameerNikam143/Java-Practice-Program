package com.tech.string;

public class MakeFirstCharacterSmallemainingCaptial {

	public static void main(String[] args) {
		
		String str="welcome to java";
		
		String[] words = str.split("\\s");
		StringBuffer sb = new StringBuffer();
		for(String word:words) {
			String first = word.substring(0, 1);
			String second = word.substring(1);
			sb.append(first.toLowerCase()+second.toUpperCase()).append(" ");
		}
		
		System.out.println(sb);
	}
}
