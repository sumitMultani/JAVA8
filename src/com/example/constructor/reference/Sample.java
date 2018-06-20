package com.example.constructor.reference;

public class Sample {

	private String s;

	Sample(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}
