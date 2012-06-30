package com.starter4ten.controllers;

public class SignupForm {

	private String email;

	private String name;

	private String password;

	private String passwordRpt;

	public String getEmail() {
		return email == null ? null : email.toLowerCase();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRpt() {
		return passwordRpt;
	}

	public void setPasswordRpt(String passwordRpt) {
		this.passwordRpt = passwordRpt;
	}
	
}
