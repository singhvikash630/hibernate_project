package com.jspider.hibernate.beans;


import java.util.Set;

public class Student {
	private int regno;
	private String fname;
	private String mname;
	private String lname;
	Set phoneNumbers;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	

}
