package com.example.without.lambda.expression;

public class Test3 {

	public static void main(String[] args) {
		
		Interf3 i = new Demo3();
		System.out.println("Hello : "+i.getLength("Hello"));
		System.out.println("Without Lambda Expression  : "+i.getLength("Without Lambda Expression"));
	}
}
