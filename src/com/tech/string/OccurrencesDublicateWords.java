package com.tech.string;
import java.util.*;
import java.util.Map.Entry;
public class OccurrencesDublicateWords {

	
	public static void main(String[] args) {
		String str="This is test.This test! is easy.";
		Map<String,Integer> count=new HashMap();
		
		String[] words = str.split("\\W+");
		for(String word:words) {
			count.put(word, count.getOrDefault(word, 0)+1);
		}
		
		for(Entry<String,Integer> entry:count.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}
}
