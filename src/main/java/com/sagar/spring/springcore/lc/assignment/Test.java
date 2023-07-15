package com.sagar.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcore/lc/assignment/config.xml");
		TicketReservation reservation = (TicketReservation) context.getBean("ticketreservation");
		
		System.out.println(reservation);
		context.registerShutdownHook();
	}

}
