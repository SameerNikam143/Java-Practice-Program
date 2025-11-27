package com.tech.string;
import java.util.*;
public class OccurrencesCharacter {

	
	public static void main(String[] args) {
		String str="programming";
		
		Map<Character,Integer> count=new HashMap();
		
		for(Character ch:str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:count.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
