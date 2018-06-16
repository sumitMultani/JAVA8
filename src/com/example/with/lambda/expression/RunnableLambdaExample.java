package com.example.with.lambda.expression;

public class RunnableLambdaExample {

	  public static void main(String[] args) {
	        System.out.println(Thread.currentThread().getName() + ": RunnableTest");
	 
	        // Lambda Runnable
	        Runnable task3 = () -> {
	            System.out.println(Thread.currentThread().getName() + " is running");
	        };
	 
	        new Thread(task3).start();
	    }
}
