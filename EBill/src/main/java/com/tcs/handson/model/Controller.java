package com.tcs.handson.model;

import org.springframework.stereotype.Component;

@Component
public class Controller {
	GetBill getBill;
	DeleteBill deleteBill;
	public Controller(GetBill getBill, DeleteBill deleteBill) {
		super();
		this.getBill = getBill;
		this.deleteBill = deleteBill;
	}
	public void del() {
		deleteBill.deletBill();
	}
	public void getBill() {
		getBill.getAllBill();
	}
}
