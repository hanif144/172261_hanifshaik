package com.example.demo.login;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class Login {
	@Id
	private String email;
	private String password;
	private String repeatpassword;
	private String oldpassword;

	public Login() {
		super();
	}

	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
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

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	@Override
	public String toString() {
		return "RegisterPojo [email=" + email + ", password=" + password + "]";
	}

}

