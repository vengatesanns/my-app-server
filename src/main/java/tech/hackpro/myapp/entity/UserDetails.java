package tech.hackpro.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import tech.hackpro.myapp.superclass.CustomBaseClass;

@Entity
@Table(name="user_details")
public class UserDetails extends CustomBaseClass {
	 
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String mobileNo;
	private String additionalMobileNo;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAdditionalMobileNo() {
		return additionalMobileNo;
	}
	public void setAdditionalMobileNo(String additionalMobileNo) {
		this.additionalMobileNo = additionalMobileNo;
	}
	
}
