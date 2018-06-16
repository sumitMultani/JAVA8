package com.example.without.lambda.expression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.with.lambda.expression.Person;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Person> personList = Person.createShortList();

		// Sort with Inner Class
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		});

		System.out.println("=== Sorted Asc Name witout lambda ===");
		for (Person p : personList) {
			System.out.println(p.getFirstName());
		}

	}

}
