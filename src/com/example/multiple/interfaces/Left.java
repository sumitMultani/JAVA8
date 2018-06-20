package com.example.multiple.interfaces;

public interface Left {

	default void m1(){
		System.out.println("Left");
	}
}
