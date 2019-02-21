package tech.hackpro.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import tech.hackpro.myapp.superclass.CustomBaseClass;

@Entity
@Table(name="user_details")
public class UserDetails extends CustomBaseClass {
	
	@NotNull(message="FirstName Should not be Null")
	private String firstname;
	
	private String middlename;
	
	private String lastname;

	@NotNull(message="Email Should not be Null")
	//@Pattern(regexp="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$",message="Email-Id Should be in correct format")
	private String email;
	
	@Size(max=10,min=10,message="MobileNo should be 10 Digits")
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
