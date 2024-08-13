package com.org.bean;

public class Manager implements Employee {
	DevClass  dev;
	OPClass op;
	ProdClass prod;
	
	@Override
	public void doWork() {
		System.out.println("Manager is managed all the team");
		// TODO Auto-generated method stub

	}
	
	public Manager(DevClass dev, OPClass op, ProdClass prod) {
		super();
		this.dev = dev;
		this.op = op;
		this.prod = prod;
	}
	public void callMeeting() {
		dev.doWork();
		op.doWork();
		prod.doWork();
	}

}
