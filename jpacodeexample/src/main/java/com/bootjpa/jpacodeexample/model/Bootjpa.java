package com.bootjpa.jpacodeexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bootjpa {
	@Id
	
	private int bootjpaId;
	private String bootjpaName;
	private String bootjpaAuthor;
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
