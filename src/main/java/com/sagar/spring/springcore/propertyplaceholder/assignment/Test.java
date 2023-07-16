package com.sagar.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcore/propertyplaceholder/assignment/config.xml");
		MyWebClient myWebClient = (MyWebClient) context.getBean("mywebclient");
		
		System.out.println(myWebClient);
	}
}
