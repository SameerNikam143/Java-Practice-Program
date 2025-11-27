package com.tech.string;

import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "sameer";

		Map<Character,Integer> count=new LinkedHashMap();
		
		for(Character ch:str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:count.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First Non-Repeated Character :"+entry.getKey());
		        break;
			}else {
				System.out.println("No Non-Repeated Character Found");
				break;
			}
		}


	}
}
