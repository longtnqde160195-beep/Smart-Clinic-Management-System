Doctor User Stories
1. View Daily Appointment Schedule
As a: Doctor

I want to: View my daily appointment schedule

So that: I can prepare for patient consultations and manage my time efficiently.

Acceptance Criteria:

GIVEN I am logged in as a doctor,

WHEN I navigate to my dashboard,

THEN I see a list of my appointments for the current day.

The list displays the patient's name, appointment time, and status (e.g., 'Scheduled', 'Completed', 'Canceled').

Priority: High


2. Update Appointment Status
As a: Doctor

I want to: Update the status of a patient's appointment

So that: I can accurately reflect the appointment's outcome and notify the patient.

Acceptance Criteria:

GIVEN I am viewing an appointment on my schedule,

WHEN I select an appointment,

THEN I am given an option to change the status to 'Completed' or 'Canceled'.

Changing the status to 'Completed' triggers a notification to the patient.

Priority: High


3. Write and Save a Patient Prescription
As a: Doctor

I want to: Write and save a new prescription for a patient

So that: The patient has a digital record of their medication and I have a record of my recommendations.

Acceptance Criteria:

GIVEN I have completed an appointment,

WHEN I click on the 'Prescribe Medication' button,

THEN a form appears where I can enter the medication name, dosage, and frequency.

WHEN I submit the form,

THEN the prescription is saved and associated with the patient’s record.

Priority: High

Patient User Stories
1. Search for a Doctor
As a: Patient

I want to: Search for doctors by name or specialty

So that: I can find the right healthcare professional and book an appointment easily.

Acceptance Criteria:

GIVEN I am on the patient dashboard,

WHEN I use the search bar,

THEN a list of doctors matching my criteria is displayed.

The search results include the doctor's name, specialty, and a brief profile.

Priority: High


2. View Upcoming Appointments
As a: Patient

I want to: View a list of my upcoming appointments

So that: I can plan accordingly and easily see the details of my scheduled visits.

Acceptance Criteria:

GIVEN I am logged in,

WHEN I navigate to my 'Appointments' page,

THEN I see a list of all my upcoming appointments.

The list shows the appointment date, time, doctor's name, and status.

Priority: High


3. Book an Appointment
As a: Patient

I want to: Book an appointment with a doctor

So that: I can schedule a consultation at a time that is convenient for me.

Acceptance Criteria:

GIVEN I have found a doctor from my search,

WHEN I select a doctor's profile,

THEN I can view their available time slots.

WHEN I select a time slot and confirm the booking,

THEN I receive a confirmation email.

Priority: High


Admin User Stories
1. Add a New Doctor Account
As a: Admin

I want to: Add a new doctor to the system

So that: I can onboard new healthcare providers and expand the clinic's services.

Acceptance Criteria:

GIVEN I am in the 'User Management' section,

WHEN I click 'Add New Doctor',

THEN a form appears where I can enter the doctor's details (name, email, specialty).

WHEN I submit the form,

THEN a new doctor account is created and a temporary password is sent to their email.

Priority: High


2. View and Filter Appointment Reports
As a: Admin

I want to: View reports on appointments

So that: I can monitor doctor performance and clinic activity.

Acceptance Criteria:

GIVEN I am on the 'Reports' page,

WHEN I select a date range or a specific doctor,

THEN I can view a report that shows total appointments and appointments per doctor.

The report can be downloaded as a CSV file.

Priority: Medium


3. Manage All User Accounts
As a: Admin

I want to: View and manage a list of all registered users (Doctors and Patients)

So that: I can handle account issues and ensure data integrity.

Acceptance Criteria:

GIVEN I am logged in as an admin,

WHEN I go to the 'User Management' section,

THEN I see a list of all doctor and patient accounts.

The list includes user names, email addresses, and roles.

I have the ability to deactivate or reset the password for any account.

Priority: High

Story Points: 8
