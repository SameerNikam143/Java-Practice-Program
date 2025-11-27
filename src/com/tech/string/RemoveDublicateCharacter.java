package com.tech.string;
import java.util.*;
public class RemoveDublicateCharacter {

	public static void main(String[] args) {
		
		String str="programming";
		
		Set<Character> set=new LinkedHashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for(Character ch:str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
		
		
		
	}
}
