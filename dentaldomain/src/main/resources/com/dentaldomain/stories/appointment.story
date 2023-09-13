Scenario: I am an employee scheduling an appointment for an existing patient


Given I create an appointment for a patient
When I post the appointment on someone's schedule
Then the appointment appears on the calendar



