package com.dentaldomain;

import java.util.HashMap;

public class Calendar {
	
	HashMap<Employee, Schedule> schedules;

	public Calendar() {
		schedules = new HashMap<Employee, Schedule>(); // TODO flesh out once basic test persistence setup
	}

	public void addSchedule(Schedule schedule) {
		schedules.put(schedule.getEmployee(), schedule);
	}

	public Appointment getAppointment(Appointment workingAppointment) {
		// TODO Auto-generated method stub
		return null;
	}

}
