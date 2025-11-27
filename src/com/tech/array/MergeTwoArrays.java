package com.tech.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int num1[]= {1, 2, 3, 4, 5};
	    int num2[]={6, 7, 8, 9, 10};
	    System.out.println(Arrays.toString(num1));
	    System.out.println(Arrays.toString(num2));
	    
	    int num3[]=new int[num1.length+num2.length];
	    int index=0;
	    
	    for(Integer n:num1) {
	    	num3[index]=n;
	    	index++;
	    }
	    
	    for(Integer n:num2) {
	    	num3[index]=n;
	    	index++;
	    }
	    
	    System.out.println(Arrays.toString(num3));
	    
	    //using java 1.8
	    
	
	    List<Integer> list1 = Arrays.asList(1,2,3,4);
	    List<Integer> list2 = Arrays.asList(5,6,7,8,9,10);
	   
	    Stream<Integer> concat = Stream.concat(list1.stream(), list2.stream());
	    List<Integer> list = concat.toList();
	    System.out.println(list);
	}
}
