package com.dentaldomain.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.dentaldomain.Appointment;
import com.dentaldomain.Calendar;
import com.dentaldomain.Employee;
import com.dentaldomain.Patient;
import com.dentaldomain.Schedule;

public class AppointmentSteps {
	Appointment workingAppointment;
	Employee employee;
	Patient patient = new Patient();
	Calendar calendar = new Calendar();
	
	@Given("I create an appointment for a patient")
	   public void createAppointment() {
			patient = new Patient(1, 24, 1201998, "Mr. Test Patient");
			workingAppointment = new Appointment(patient, 2, 4, 5, 2023,"cleaning");
	}

	//this test made me realize employee needs a schedule, not vice versa
	@When("I post the appointment on someone's schedule") 
		public void postAppointmentToSchedule() {
		employee = new Employee("Testy McTester", 1, "frontDesk");
		employee.post(workingAppointment);
		Schedule schedule = (Schedule) employee.getSchedule(5);
		calendar.addSchedule(schedule);
	}
	
	//since there's no gui yet, will add basic implementation of determining if appointment is on calendar
	@Then("The appointment appears on the calendar")
		public void appointmentOnCalendar() {
			Calendar calendar = new Calendar();
			Schedule schedule = (Schedule) employee.getSchedule(5);
			assertThat(calendar.getAppointment(workingAppointment), equals(workingAppointment));
	}
	
}
