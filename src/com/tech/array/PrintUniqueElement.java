package com.tech.array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class PrintUniqueElement {

	public static void main(String[] args) {
		int[] arr= {10, 20, 40, 20, 10};
		
	  LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
	  for(Integer num:arr) {
		  set.add(num);
	  }
	  
	  System.out.println(set);
	  
	  
	  int[] array = Arrays.stream(arr).distinct().toArray();
	  System.out.println(Arrays.toString(array));
	  
	}
}
