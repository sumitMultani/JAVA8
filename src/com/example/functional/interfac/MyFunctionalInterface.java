package com.example.functional.interfac;

@FunctionalInterface
public interface MyFunctionalInterface {

	// we can declare only one abstract method.
	public void m1();
	
	// but we can declare default or static method any number.
	default public void newDefaultMethod() {
        System.out.println("New default method"+" is added in interface");
    }
	
	default  void secondDefaultMethod() {
        System.out.println("Second default method"+" is added in interface");
    }
	
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}
