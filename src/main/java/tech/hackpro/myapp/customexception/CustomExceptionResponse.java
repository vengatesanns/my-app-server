package tech.hackpro.myapp.customexception;

import java.util.Date;

public class CustomExceptionResponse {
	
	private Date timestamp;
	private String message;
	private String description;
	private String owner;
	private String domain;
	
	public CustomExceptionResponse(Date timestamp,String message,String description)
	{
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
		this.owner = "Vengat";
		this.domain = "hackPro";
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	

}
