package com.dentaldomain;
import java.util.ArrayList;

public class Schedule {
	
	private Employee employee;
	private ArrayList<ArrayList<Appointment>> month; //2d array of days x hours

	public Schedule(int month, int year, Employee employee) {
		this.employee = employee;
		int numberOfDays;
		if (month == 1 || month == 3 || month == 5
		 || month == 7 || month == 8 || month == 10 || month == 12) {
			numberOfDays = 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			numberOfDays = 30;
		else if (month == 2) {
			if (year % 4 == 0) 
				numberOfDays = 29;
			else
				numberOfDays = 28;
				
		}
		else
			numberOfDays = -1;

		this.month = new ArrayList<ArrayList<Appointment>>();
		
		//we will pre-fill a calendar with 8 appointments every day, and an appointment with a default patient name is a "free" hour
		//if we need more granularity we can fix this
		
		for (int day = 0; day < numberOfDays; day++) { //assuming 8 hour work day
			ArrayList<Appointment> appointmentsInDay = new ArrayList<Appointment>();
			for (int hour = 0; hour < 8; hour++) {
				appointmentsInDay.add(new Appointment(hour, day, year, "Available"));
			}
			this.month.add(appointmentsInDay);
		}
	}

}
