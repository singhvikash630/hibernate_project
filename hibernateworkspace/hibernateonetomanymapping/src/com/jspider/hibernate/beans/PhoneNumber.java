package com.jspider.hibernate.beans;

import java.io.Serializable;

public class PhoneNumber implements Serializable
{
	private int id;
	private String numbertype;
	private int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
