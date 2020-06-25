package com.jspider.hibernate.beans;

public class Users
{
	private int regno;
	private String password="qwerty";
	private String isadmin="n";
	public Users()
	{
		//constructors
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}
	

}
