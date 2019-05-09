package com.example.registerService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class RegisterPojo {

	@Id
	private String email;
	private String password;
	private String repeatpassword;

	public RegisterPojo() {
		super();
	}

	public RegisterPojo(String email, String password, String repeatpassword) {
		super();
		this.email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatpassword() {
		return repeatpassword;
	}

	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}

	@Override
	public String toString() {
		return "RegisterPojo [email=" + email + ", password=" + password + ", repeatpassword=" + repeatpassword + "]";
	}

}
