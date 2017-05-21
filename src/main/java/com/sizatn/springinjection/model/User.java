package com.sizatn.springinjection.model;

public class User {

	private String userNo;
	private String userName;

	public User() {
		super();
	}

	public User(String userNo, String userName) {
		super();
		this.userNo = userNo;
		this.userName = userName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
