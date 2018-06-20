package com.example.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		System.out.println(PredicateExample2.isNullOrEmpty("kk"));
	}

	public static boolean isNullOrEmpty(String str) {
		Predicate<String> p = s -> s.length() > 0;
		if (str != null && p.test(str))
			return false;
		return true;
	}

}
