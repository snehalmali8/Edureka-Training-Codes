package com.res.SringbootMongoDb.model;

import java.util.List;

public class Response {
	private String code;
	private String message;
	private List<User> users;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(String code, String message, List<User> users) {
		super();
		this.code = code;
		this.message = message;
		this.users = users;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
