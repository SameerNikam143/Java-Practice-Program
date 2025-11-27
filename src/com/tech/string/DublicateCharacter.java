package com.tech.string;
import java.util.*;
import java.util.Map.Entry;

public class DublicateCharacter {

	public static void main(String[] args) {
		
		String str="programming";
		boolean hasDublicates=false;
		Map<Character,Integer> count=new HashMap();
		
		for(Character ch:str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(Entry<Character,Integer> entry:count.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Dublicate Character is:"+entry.getKey());
			   hasDublicates=true;
			}
		}
		
		System.out.println(!hasDublicates?"No Dublicate Character Found":"");
		
	}
}
