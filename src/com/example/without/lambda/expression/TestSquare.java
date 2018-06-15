package com.example.without.lambda.expression;

public class TestSquare {

	public static void main(String[] args) {
	
		InterfSquare i = new DemoSquare();
		System.out.println("square of 5 is : "+i.squareit(5));
	}
	
}
