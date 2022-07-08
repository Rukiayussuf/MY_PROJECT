package com.joo.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	private Date date;
	
	private String first_name;
	
	private String  last_name;
	
	private String gender;
	
	private String phone_no;
	
	private String dest_price;
	
	private String day;

	private String time;
	
	public Ticket() {
		super();
	}

	public Ticket(long iD, Date date, String first_name, String last_name, String gender, String phone_no,
			String dest_price, String day, String time) {
		ID = iD;
		this.date = date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.phone_no = phone_no;
		this.dest_price = dest_price;
		this.day = day;
		this.time = time;
	}

	public Ticket(Date date, String first_name, String last_name, String gender, String phone_no, String dest_price,
			String day, String time) {
		this.date = date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.phone_no = phone_no;
		this.dest_price = dest_price;
		this.day = day;
		this.time = time;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getDest_price() {
		return dest_price;
	}

	public void setDest_price(String dest_price) {
		this.dest_price = dest_price;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	
}
