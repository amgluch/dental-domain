package com.dentaldomain;

public class Patient {
	
	private int patientID;
	private int patientAge;
	private double date;
	private String patientName;
	

	public Patient(int patientID, int patientAge, double date, String patientName) {
		this.patientID = patientID;
		this.patientAge = patientAge;
		this.date = date;
		this.patientName = patientName;
	}


	public Patient() {
		this.patientID = -1;
		this.patientAge = -1;
		this.date = -1;
		this.patientName = "Available";
	}

}
