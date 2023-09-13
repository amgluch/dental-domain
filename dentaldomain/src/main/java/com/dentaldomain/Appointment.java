package com.dentaldomain;

public class Appointment {
	private Patient patient;
	private int hour;
	private int day;
	private int month;
	private int year;
	private String reason; //when creating a new schedule this is "Available"
	
	public Appointment(Patient patient, int hour, int day, int month, int year, String reason) {
		this.patient = patient;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
		this.reason = reason; 
	}

	public Appointment(int hour, int day, int month, int year, String reason) {
		this.patient = new Patient();
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
		this.reason = reason; 
	}

	public int getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
