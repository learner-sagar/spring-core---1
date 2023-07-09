package com.sagar.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcore/properties/propsconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages)context.getBean("countryandlangs");
		
		System.out.println(countriesAndLangs);
	}

}
