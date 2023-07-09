package com.sagar.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sagar/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name" + hospital.getName());
		System.out.println("Hospital Departments:" + hospital.getDepartments());
		System.out.println("department variable type: " + hospital.getDepartments().getClass());
	}
}
