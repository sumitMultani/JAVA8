package com.example.multiple.interfaces;

public class Test implements Right, Left {
	
	public void m1(){
		 Left.super.m1(); 
		 Right.super.m1();
		 System.out.println("Test");
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(); 
	}

}
