package com.tech.string;
import java.util.*;
public class CountDublicateWords {

	public static void main(String[] args) {
		String str="Java is great and java is fun programming in java is Great";
	   String str1 = str.toLowerCase();
	   
	   Map<String,Integer> count=new HashMap();
	
	for(String word:str1.split("\\W+")) {
		count.put(word, count.getOrDefault(word, 0)+1);
	}
	
	for(Map.Entry<String, Integer> entry:count.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+": "+entry.getValue());
			
		}
	}
	
	
	
	
	
	
	
	
	
	}
}
