package com.sagar.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int reservationId;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("inside initialize()");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("inside cleanUp()");
	}

	@Override
	public String toString() {
		return "TicketReservation [reservationId=" + reservationId + "]";
	}

}
