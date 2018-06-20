package com.example.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {

	   public static void main(String[] args) {       
		   Predicate<Integer> p = I -> (I>10);    
		   System.out.println(p.test(100));   
		   System.out.println(p.test(7));    
		//   System.out.println(p.test(true)); //CE          
	   }
}
