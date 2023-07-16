package com.sagar.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("inside double constructor");
	}

	public Addition(int a, int b) {
		System.out.println("inside int constructor");
	}

	public Addition(String a, String b) {
		System.out.println("inside string constructor");
	}

	public Addition(int a, double b) {
		System.out.println("inside int with double data constructor");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
