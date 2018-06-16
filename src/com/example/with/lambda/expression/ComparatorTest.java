package com.example.with.lambda.expression;

import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		    
		     List<Person> personList = Person.createShortList();
		     
		     // Print Asc
		     System.out.println("=== Sorted Asc Name using Lambda ===");
		     Collections.sort(personList, (Person p1, Person p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		 
		     for(Person p:personList){
		      System.out.println( p.getFirstName());
		     }
		     
		     // Print Desc
		     System.out.println("=== Sorted Desc Name using Lambda ===");
		     Collections.sort(personList, (p1,  p2) -> p2.getFirstName().compareTo(p1.getFirstName()));
		 
		     for(Person p:personList){
		       System.out.println( p.getFirstName());
		     }
		     
		   }
	
}
