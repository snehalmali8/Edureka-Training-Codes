package com.org.EurekaClient;

public class HelloServer {
	private int countMax;
	private int countMin;
	public HelloServer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelloServer(int countMax, int countMin) {
		super();
		this.countMax = countMax;
		this.countMin = countMin;
	}
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}
	public int getCountMin() {
		return countMin;
	}
	public void setCountMin(int countMin) {
		this.countMin = countMin;
	}
}
