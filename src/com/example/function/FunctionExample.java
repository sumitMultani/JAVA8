package com.example.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		//Function<String, Integer> f = s -> s.length();
		Function<String, Boolean> f = s -> s.length() > 4;
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));
	}

}
