package com.example.with.lambda.expression;

public class TestSquare {

	public static void main(String[] args) {
		
		InterfSquare i = a -> a*a;
		System.out.println("square of 5 is : "+i.squareit(5));
		System.out.println("square of 7 is : "+i.squareit(7));
	}
	
	 
}
