package com.tech.string;
import java.util.*;
public class RemoveDublicateWords {

	public static void main(String[] args) {
		String str="java is great and java is fun and java is powerful";
		
		Set<String> count=new HashSet();
		
		String[] words = str.toLowerCase().split("\\W+");
		
		StringBuffer sb = new StringBuffer();
		for(String word:words) {
			if(!count.contains(word)) {
				count.add(word);
				sb.append(word).append(" ");
			}
		}
		System.out.println(sb);
	}
}
