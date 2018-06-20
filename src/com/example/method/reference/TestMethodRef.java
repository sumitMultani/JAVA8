package com.example.method.reference;

public class TestMethodRef {

	public   void m2(int i) {
		System.out.println("From Method Reference:"+i );
	}

	public static void main(String[] args) {
		Interf f = (I) -> System.out.println("From Lambda Expression:"+I);
		f.m1(88);
		TestMethodRef tm = new TestMethodRef();
		Interf t = tm::m2;
		t.m1(9);
	}
}
