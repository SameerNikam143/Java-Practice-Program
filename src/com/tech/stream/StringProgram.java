package com.tech.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringProgram {

	
	public static void main(String[] args) {
		
	/*	String str="welcome to java";
		Arrays.asList(str.split(" "))
		      .forEach(a->System.out.println(a+" :"+a.length()));
	*/
		
	
/*	String str="welcome to java";
	List<String> list = Arrays.asList(str.replaceAll(" ", "").split(""));
		
	list.stream()
	   .filter(t->Collections.frequency(list, t)>1)
	      .distinct()
	         .forEach(a->System.out.println(a));
*/
		

/*  String str="welcome to java";
  String reverse = str
		  .chars()
		     .mapToObj(a->String.valueOf((char)a))
		        .reduce((a,b)->b+a)
		          .get();
  System.out.println(reverse);
 */
		
 
	/*String str="welcome to java";
	str.chars()
	      .mapToObj(a->(char)a)
	           .distinct()
	               .forEach(a->System.out.print(a));
  */
		
/*	String str="mdam";
	boolean bool = Arrays.asList(str)
	   .stream()
	      .anyMatch(t->t.equals(new StringBuffer(t).reverse().toString()));
	System.out.println(bool);
*/

 /* String str="welcome to java";
  Map<Character, Long> collect = 
		  str.chars()
		    .mapToObj(a->(char)a)
		      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                  collect.forEach((a,b)->System.out.println(a+" :"+b));
	*/
	
		
/*	String str="welcome to java";
	Character first = str.chars()
	    .mapToObj(a->(char)a)
	         .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	            .entrySet()
	               .stream()
	                 .filter(t->t.getValue()>1)
	                   .map(a->a.getKey())
	                      .findFirst()
	                        .get();
       System.out.println(first);
		
	*/
		
		
  /* String str="welcome to java";
   Character character = str.chars()
     .mapToObj(a->(char)a)
        .collect(Collectors.groupingBy(a->a, LinkedHashMap::new, Collectors.counting()))
            .entrySet()
              .stream()
                 .filter(t->t.getValue()==1)
                    .map(a->a.getKey())
                        .findFirst()
                             .get();
		
		System.out.println(character);
		
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
