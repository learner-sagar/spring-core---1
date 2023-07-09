package com.sagar.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer)context.getBean("customer");

		System.out.println("Customer Id: " + customer.getId());
		System.out.println("Customer Product: " + customer.getProducts());
		System.out.println("product variable type: " + customer.getProducts().getClass());
	}
}
