package tech.hackpro.myapp.superclass;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class CustomBaseClass {
	
	protected Date createdAt;
//	protected Date modifiedAt;
//	protected Date modifiedBy;
//	protected Date createdBy;
	protected long id;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	 @DateTimeFormat(pattern="dd-MM-yyyy hh:mm:ss.S")
	 public Date getCreatedAt() {
			return createdAt;
	 }

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	/*public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public Date getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Date modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}	*/
	
}
