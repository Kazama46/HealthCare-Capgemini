package com.cg.bootcamp.healthcare.Entities;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	String userId;
		List<Diagnostic_Center> centerList;
		String userPassword;
		String userName;
		BigInteger contactNo;
		String userRole;
		String emailId;
	}
