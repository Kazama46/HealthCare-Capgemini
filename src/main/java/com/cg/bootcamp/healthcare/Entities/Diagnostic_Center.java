package com.cg.bootcamp.healthcare.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;


@Entity
public class Diagnostic_Center {
	
	@NotNull
	private String centerName;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String centerID;
	
	public List<Test> listofTests;
	public List<Appointment> appointmentList;
	
	public Diagnostic_Center() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diagnostic_Center(String centerName, String centerID, List<Test> listofTests,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerID = centerID;
		this.listofTests = listofTests;
		this.appointmentList = appointmentList;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterID() {
		return centerID;
	}

	public void setCenterID(String centerID) {
		this.centerID = centerID;
	}

	public List<Test> getListofTests() {
		return listofTests;
	}

	public void setListofTests(List<Test> listofTests) {
		this.listofTests = listofTests;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@Override
	public String toString() {
		return "Diagnostic_Center [centerName=" + centerName + ", centerID=" + centerID + ", listofTests=" + listofTests
				+ ", appointmentList=" + appointmentList + "]";
	}
	
	
	
	
	
	
}
