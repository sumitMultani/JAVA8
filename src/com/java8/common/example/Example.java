package com.java8.common.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "ABC");
		hmap.put(2, "XCB");
		hmap.put(3, "ABB");
		hmap.put(4, "ZIO");

		Map<Integer, String> result = hmap.entrySet().stream()
				.filter(p -> p.getKey().intValue() <= 2)
				// filter by key
				.filter(map -> map.getValue().startsWith("A"))
				// filter by value
				.collect(
						Collectors.toMap(map -> map.getKey(),
								map -> map.getValue()));

		System.out.println("Result: " + result);
	}
}
