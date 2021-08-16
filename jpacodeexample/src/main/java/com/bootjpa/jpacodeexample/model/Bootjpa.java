package com.bootjpa.jpacodeexample.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;
@Entity
public class Bootjpa {
	@Id
	
	private int bootjpaId;
	
	@Column
	@NotBlank
	private String bootjpaName;
	private Date timeStamp;
	public String message;
	@SuppressWarnings("deprecation")
	@NotEmpty(message=" Author name should not be empty")
	private String bootjpaAuthor;
	
	
	
	@NotNull
	private String firstname;
	@NotNull
	private String lastname;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Size(min=6,max=6, message="User Id must be six lettered Alphanumeric")
	private String userId;
	
	 public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
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
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
   
	public void CustomError() {
		}

		public void CustomError(Date timeStamp, String message) {
			this.timeStamp = timeStamp;
			this.message = message;
		}

		public Date getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(Date timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}


	public int getBootjpaId() {
		return bootjpaId;
	}
	public void setBootjpaId(int bootjpaId) {
		this.bootjpaId = bootjpaId;
	}
	public String getBootjpaName() {
		return bootjpaName;
	}
	public void setBootjpaName(String bootjpaName) {
		this.bootjpaName = bootjpaName;
	}
	public String getBootjpaAuthor() {
		return bootjpaAuthor;
	}
	public void setBootjpaAuthor(String bootjpaAuthor) {
		this.bootjpaAuthor = bootjpaAuthor;
	}
	
	
	
}
