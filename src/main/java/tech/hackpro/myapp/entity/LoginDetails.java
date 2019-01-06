package tech.hackpro.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import tech.hackpro.myapp.superclass.CustomBaseClass;

@Entity
@Table(name = "login_access")
public class LoginDetails extends CustomBaseClass {
	
	private String username;
	private String password;
	private String role;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
