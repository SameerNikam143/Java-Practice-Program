package com.tech.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberProgram {

	public static void main(String[] args) {

	/*	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream()
		   .filter(t -> t % 2 == 0)
		       .forEach(a -> System.out.println(a));
		List<Integer> collect = list.stream()
		       .filter(t -> t % 2 != 0)
		           .collect(Collectors.toList());
		System.out.println(collect);
	*/
		
	List<Integer> list = Arrays.asList(14,6,2,8,3,15,45,7,56,23,78,90,45,34);	
  /*  Integer max = list.stream()
           .max((a,b)->a.compareTo(b)).get();	
	              System.out.println(max);
	Integer min = list.stream()
	    .min((a,b)->a.compareTo(b)).get();
	        System.out.println(min);
	*/
	
  /* Integer integer = list.stream()
   *      .collect(Collectors.maxBy((a,b)->a.compareTo(b)))
   *          .get();
	System.out.println(integer);
	Integer integer2 = list.stream()
	     .collect(Collectors.minBy((a,b)->a.compareTo(b)))
	        .get();
	System.out.println(integer2);
	*/
/*	
   int max = list.stream()
		   .mapToInt(Integer::intValue)
		       .max()
		         .getAsInt();
	System.out.println(max);
	int min = list.stream()
			 .mapToInt(Integer::intValue)
			    .min()
			      .getAsInt();
	System.out.println(min);
*/
	

	
/*long count = list.stream().count();
	System.out.println(count);
	Long collect = list.stream().collect(Collectors.counting());
	System.out.println(collect);
*/
	
	
	
   /* long average = list.stream()
    		.collect(Collectors.averagingDouble(a->a))
    		  .longValue();
	System.out.println(average);
	
	double average1 = list.stream()
			  .mapToInt(Integer::intValue)
			     .average()
			       .getAsDouble();
	System.out.println(average1);
	*/
	
	
/*	int sum = list.stream()
 *         .mapToInt(Integer::intValue)
 *            .sum();
	System.out.println(sum);
	
	*/
	
	/*List<Integer> collect = list.stream()
	 *        .map(a->a+5)
	 *           .collect(Collectors.toList());
	System.out.println(collect);
	
	*/
	
/*	list.stream()
	    .sorted()
	      .forEach(a->System.out.println(a));
	list.stream()
	     .sorted(Comparator.reverseOrder())
	           .forEach(a->System.out.println(a));
*/	
/*	boolean allMatch = list.stream().allMatch(a->a%2==0);
	System.out.println(allMatch);
	
	boolean anyMatch = list.stream().anyMatch(t->t%2==0);
	System.out.println(anyMatch);
	
	boolean noneMatch = list.stream().noneMatch(t->t%2==0);
	System.out.println(noneMatch);
	
*/
	
/*	
	Integer integer = list.stream().findAny().get();
	System.out.println(integer);
	Integer integer2 = list.stream().findFirst().get();
	System.out.println(integer2);
	
 */
	
	
/*	list.stream()
	    .filter(t->Collections.frequency(list, t)>1)
	        .distinct()
	            .forEach(a->System.out.println(a));
	
	list.stream()
	    .distinct()
	      .forEach(a->System.out.println(a));
	
	list.stream()
	     .map(a->a*a*a)
	        .forEach(a->System.out.println(a));
*/	
/*	List<String> list2 = Arrays.asList("sameer","manish","gokul");
	list2.stream()
	   .map(String::toUpperCase)
	        .forEach(a->System.out.println(a));
*/
	
/*	double asDouble = list.stream()
 *      .mapToInt(Integer::intValue)
 *           .average()
 *               .getAsDouble();
	System.out.println(asDouble);
	
	double asDouble2 = list.stream()
	          .map(a->a*a)
	               .mapToInt(Integer::intValue)
	                    .average()
	                       .getAsDouble();
	System.out.println(asDouble2);
*/
	
/*	double asDouble = list.stream()
			.map(a->a*a)
			   .filter(t->t>200)
			      .mapToInt(Integer::intValue)
			         .average()
			            .getAsDouble();
	System.out.println(asDouble);
*/
	
/*	list.stream()
	  .map(String::valueOf)
	     .filter(t->t.startsWith("1"))
	        .map(Integer::valueOf)
	           .forEach(a->System.out.println(a));
*/
	
/*	HashSet<Integer> h = new HashSet();
	list.stream().filter(t->!h.add(t)).forEach(a->System.out.println(a));
*/
	
//	list.stream().sorted((a,b)->b.compareTo(a)).forEach(a->System.out.println(a));
	
	}
}
