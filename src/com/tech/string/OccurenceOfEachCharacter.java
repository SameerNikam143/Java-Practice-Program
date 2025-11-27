package com.tech.string;
import java.util.*;
public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		
		String str="java is great java is fun";
		
		Map<Character,Integer> count=new HashMap();
		
		for(Character ch:str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:count.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
