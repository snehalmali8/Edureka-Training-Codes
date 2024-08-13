package com.res.SringbootMongoDb.model;

public class Adress {
	String line;
	String city;
	String state;
	public Adress(String line, String city, String state) {
		super();
		this.line = line;
		this.city = city;
		this.state = state;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
