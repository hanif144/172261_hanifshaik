package com.org.user;

public class UserValues {
	
	private String username;
	private String email;
	private String password;
	private String repassword;
	public UserValues(String username, String email, String password, String repassword) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getRepassword() {
		return repassword;
	}
	@Override
	public String toString() {
		return "UserValues [username=" + username + ", email=" + email + ", password=" + password + ", repassword="
				+ repassword + "]";
	}
	
	

}
