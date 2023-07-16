package com.sagar.spring.springcore.innerbeansassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore/innerbeansassignment/config.xml");

		University university1 = (University) context.getBean("university");

		System.out.println(university1.hashCode());

		University university2 = (University) context.getBean("university");

		System.out.println(university2.hashCode());
	}
}
