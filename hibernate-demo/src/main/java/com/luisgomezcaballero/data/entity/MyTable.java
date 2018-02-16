package com.luisgomezcaballero.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable")
public class MyTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer myId;
	private String myString;
	private Date myDate;
	private Float myFloat;

	public Integer getMyId() {
		return myId;
	}

	public void setMyId(Integer myId) {
		this.myId = myId;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}

	public Float getMyFloat() {
		return myFloat;
	}

	public void setMyFloat(Float myFloat) {
		this.myFloat = myFloat;
	}

}
