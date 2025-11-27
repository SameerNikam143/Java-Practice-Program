package com.tech.stream;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

	
	    public static void main(String[] args) {
	        List<Student> students = Arrays.asList(
	            new Student(11, "Amit", "Mumbai", 3, "Computer Science", "Male", 20),
	            new Student(32, "Priya", "Pune", 12, "Electrical", "Female", 21),
	            new Student(53, "Rohit", "Pune", 67, "Mechanical", "Male", 22),
	            new Student(44, "Sneha", "Nashik", 32, "Civil", "Female", 23),
	            new Student(75, "Kunal", "Aurangabad", 14, "Electronics", "Male", 24),
	            new Student(6, "Neha", "Thane", 22, "Computer Science", "Female", 22),
	            new Student(17, "Rahul", "Solapur", 7, "Electrical", "Male", 21),
	            new Student(38, "Pooja", "Kolhapur", 5, "Civil", "Female", 20),
	            new Student(19, "Siddharth", "Amravati", 1, "Mechanical", "Male", 23),
	            new Student(10, "Swati", "Jalgaon", 45, "Computer Science", "Female", 22)
	        );
	        
  
	
	        
	 
	 
	 //String str="hello world";
//	      
//	      String collect = Stream.of(str.split(" ")).map(a->new StringBuffer(a).reverse().toString())
//	      .collect(Collectors.joining(" "));
//	        System.out.println(collect);
	
/*	students.stream()
	            .filter(t->t.getRank()>=20 && t.getRank()<=50)
	                  .forEach(a->System.out.println(a));
	*/
	        
	/* Map<String, Long> collect =
			 students.stream()
			   .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
	                 System.out.println(collect);     
	 */       
	        
	 
	/*   Map<String, List<Student>> collect =
			   students.stream()
			       .collect(Collectors.groupingBy(Student::getDepartment));
	                      System.out.println(collect);   
	*/
	        
	/*    long count = students.stream().count();
	      System.out.println(count);  
	*/
	        
	 /*    Student student = students.stream().max(Comparator.comparing(Student::getAge)).get();
	      System.out.println(student);  
	 */
	 /*     Student student = students.stream()
	    		       .collect(Collectors.maxBy(Comparator.comparing(Student::getAge)))
	    		             .get();
	 */
	        
	 
/*	students.stream()
	   .filter(t->t.getAge()<=20)
	        .forEach(a->System.out.println(a));        
	*/
	        
/*	  students.stream()
	      .map(Student::getDepartment)
	           .distinct()
	                .forEach(a->System.out.println(a));
	       
	        
	  Set<String> collect = students.stream()
			  .map(Student::getDepartment)
			    .collect(Collectors.toSet());      
	               System.out.println(collect);     
	*/
	        
	 /*   double average = students.stream()
	    		.filter(t->t.getGender().equals("Male"))
	    		    .map(Student::getAge)
	                    .mapToInt(Integer::intValue)
	                        .average()
	                           .getAsDouble();
	                                     System.out.println(average);  
	*/
	        
	/*        Double collect = students.stream()
	        		   .filter(t->t.getGender().equals("Male"))
	                               .collect(Collectors.averagingDouble(Student::getAge));
	        System.out.println(collect);
*/	        
	        
	
	/*  Entry<String, Long> entry = students.stream()
	    .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
	      .entrySet()
	          .stream()
	            .max(Map.Entry.comparingByValue())
	                .get();
	        
	      System.out.println(entry);  
	*/
	        
	 
/*	   students.stream()
	      .filter(t->t.getAddress().equals("Pune"))
	         .forEach(a->System.out.println(a));
	  
	 */
	        
	        
	 /*  students.stream()
	      .filter(t->t.getName().startsWith("S"))
	          .forEach(a->System.out.println(a));     
	*/        
	        
	/*        Student student = students.stream()
	        		.sorted(Comparator.comparing(Student::getRank))
	        		    .skip(1)
	        		       .findFirst()
	        		            .get();
	                                    System.out.println(student);      
	*/        
	        
	        
	/* students.stream()
	    .sorted(Comparator.comparing(Student::getRank))
	       .forEach(a->System.out.println(a));       
	*/
	        
	/*   Map<String, Optional<Student>> collect = students.stream()
			   .collect(Collectors.groupingBy(Student::getDepartment, Collectors.maxBy(Comparator.comparing(Student::getRank))));
	                    collect.forEach((a,b)->System.out.println(a+" :"+b.get()));      
	*/
	        
	        
/*	   Map<String, Double> collect = students.stream()
			   .collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getRank)));
	                   System.out.println(collect);     
*/	        
	 
	        
/*	students.stream()
	   .filter(t->t.getName().startsWith("S") && t.getAddress().startsWith("A"))
	         .forEach(a->System.out.println(a));
	        
	*/
	        
	  
	  /*  students.stream()
	       .sorted(Comparator.comparing(Student::getRank).reversed())
	             .forEach(a->System.out.println(a));
	*/        
	        
	        
	        
	        
	        
	        
	        
	    }
	

}
