package com.cg.bootcamp.healthcare.Entities;

public class Test {
	private String testID;
	private String testName;
	
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Test(String testID, String testName) {
		super();
		this.testID = testID;
		this.testName = testName;
	}


	public String getTestID() {
		return testID;
	}


	public void setTestID(String testID) {
		this.testID = testID;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	@Override
	public String toString() {
		return "Test [testID=" + testID + ", testName=" + testName + "]";
	}
	
	
	
}
