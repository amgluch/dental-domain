package main;

public class Appointment {
	private int hour;
	private int day;
	private int year;
	private String reason; //when creating a new schedule this is "Available"
	
	public Appointment(int hour, int day, int year, String reason) {
		this.hour = hour;
		this.day = day;
		this.year = year;
		this.reason = reason; 
	}

}
