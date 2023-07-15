package com.sagar.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter involked");
		this.id = id;
	}

	public void hi() {
		System.out.println("inside hi method");
	}

	public void bye() {
		System.out.println("inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
