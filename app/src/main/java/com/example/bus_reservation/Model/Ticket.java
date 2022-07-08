package com.example.bus_reservation.Model;

import java.util.Date;

public class Ticket {
    private long ID;

    private Date date;

    private String first_name;

    private String  last_name;

    private String gender;

    private String phone_no;

    private String dest_price;

    private String day;

    private String time;
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
