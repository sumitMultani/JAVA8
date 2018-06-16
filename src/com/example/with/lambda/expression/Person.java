package com.example.with.lambda.expression;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String eMail;
	private String phone;
	private String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person(String firstName, String lastName, int age, String eMail,
			String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.eMail = eMail;
		this.phone = phone;
		this.address = address;
	}
	public static List<Person> createShortList() {
		List<Person> persons = new ArrayList<Person>();
		Person person1 = new Person("sumit", "singh", 27, "spsingh02497@gmil.com","9416302497", "Lotton");
		Person person2 = new Person("Joney", "singh", 27, "spsingh02497@gmil.com","9416302497", "Lotton");
		Person person3 = new Person("Gagan", "singh", 27, "spsingh02497@gmil.com","9416302497", "Lotton");
		Person person4 = new Person("Lucky", "singh", 27, "spsingh02497@gmil.com","9416302497", "Lotton");
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		return persons;
	}
	
	

}
