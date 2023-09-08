package main;
import java.util.ArrayList;

public class Schedule {
	
	private String employee;
	private ArrayList<ArrayList<Appointment>> month; //2d array of days x hours

	public Schedule(int month, int year, String employee) {
		this.employee = employee;
		int numberOfDays;
		switch (month) {
		
			case 1:  numberOfDays = 31;
			    break;
			case 2:	if (year % 4 == 0) {numberOfDays = 29;}
					else numberOfDays = 28;	
			    break;
			case 3:  numberOfDays = 31;
			    break;
			case 4:  numberOfDays = 30;
			    break;
			case 5:  numberOfDays = 31;
			    break;
			case 6:  numberOfDays = 30;
			    break;
			case 7:  numberOfDays = 31;
			    break;
			case 8:  numberOfDays = 31;
			    break;
			case 9:  numberOfDays = 30;
			    break;
			case 10: numberOfDays = 31;
			    break;
			case 11: numberOfDays = 30;
			    break;
			case 12: numberOfDays = 31;
			    break;
			default: numberOfDays = -1;
			    break;
			    
		}
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
