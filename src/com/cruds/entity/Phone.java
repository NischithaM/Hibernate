package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHONE")
public class Phone {

	private int phoneid;
	private String phonetype;
	private String phoneno;
	
	public Phone() {
		super();
	}

	
	public Phone(String phonetype, String phoneno) {
		super();
		this.phonetype = phonetype;
		this.phoneno = phoneno;
	}

	@Id
	@GeneratedValue
	@Column(name="PHONE_ID")
	public int getPhoneid() {
		return phoneid;
	}

	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}

	@Column(name="PHONE_TYPE",nullable=false,length=20)
	public String getPhonetype() {
		return phonetype;
	}

	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}

	@Column(name="PHONE_NO",nullable=false,length=20)
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
}
