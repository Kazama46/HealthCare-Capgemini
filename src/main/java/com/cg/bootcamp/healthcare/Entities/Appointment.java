package com.cg.bootcamp.healthcare.Entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;


@Entity
public class Appointment {
	public String user;
	
	@Id
	private BigInteger appointmentID;
	public String test;
	private DateTimeAtCompleted dateTime;
	public Boolean approved;
	
	
}
