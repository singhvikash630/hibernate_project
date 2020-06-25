package com.jspider.hibernate.beans;

import java.io.Serializable;

public class PhoneNumber implements Serializable
{
	private int regno;
	private String numbertype;
	private int number;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getNumbertype() {
		return numbertype;
	}
	public void setNumbertype(String numbertype) {
		this.numbertype = numbertype;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
