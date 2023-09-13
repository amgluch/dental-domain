package com.dentaldomain;

import java.util.ArrayList;

public class Employee {
	
	private String name;
	private int employeeID;
	private String role;
	
	private ArrayList<Schedule> schedules;

	public Employee(String name, int employeeID, String role) {
		this.name = name;
		this.employeeID = employeeID;
		this.role = role;
		this.schedules = new ArrayList<Schedule>(12);
	}

	public void post(Appointment appointment) {
		schedules.set(appointment.getMonth(), new Schedule(this, appointment.getMonth(), appointment.getYear()));
	}

	public Object getSchedule(int month) {
		return schedules.get(month);
	}

}
