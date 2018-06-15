package com.example.with.lambda.expression;

public class TestAdd {

	public static void main(String[] args) {
		
		InterfAdd i = (a, b)->System.out.println("The sum by lambda expression: "+(a+b));
		i.add(10, 15);
		i.add(100, 250);
	}
}
