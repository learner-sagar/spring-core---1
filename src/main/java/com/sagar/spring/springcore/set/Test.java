package com.sagar.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sagar/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println("Dealer Name" + carDealer.getName());
		System.out.println("Modles:" + carDealer.getModels());
		System.out.println("models variable type: " + carDealer.getModels().getClass());
	}
}
