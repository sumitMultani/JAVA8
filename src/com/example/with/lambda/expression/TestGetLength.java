package com.example.with.lambda.expression;

public class TestGetLength {
	public static void main(String[] args) {
		InterfGetLength i = s -> s.length();
		System.out.println("Hello  : "+i.getLength("Hello"));
		System.out.println("With Lambda Expression  : "+i.getLength("With Lambda Expression"));
	}

}
