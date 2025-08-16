## MySQL Database Schema Design

### `Patients` Table

-   `patient_id`: INT PRIMARY KEY
-   `first_name`: VARCHAR(255)
-   `last_name`: VARCHAR(255)
-   `email`: VARCHAR(255) UNIQUE
-   `phone_number`: VARCHAR(20)

### `Doctors` Table

-   `doctor_id`: INT PRIMARY KEY
-   `first_name`: VARCHAR(255)
-   `last_name`: VARCHAR(255)
-   `specialty`: VARCHAR(255)
-   `email`: VARCHAR(255) UNIQUE
-   `available_times`: VARCHAR(255)

### `Appointments` Table

-   `appointment_id`: INT PRIMARY KEY
-   `patient_id`: INT FOREIGN KEY (references `Patients`)
-   `doctor_id`: INT FOREIGN KEY (references `Doctors`)
-   `appointment_time`: DATETIME
-   `reason_for_visit`: TEXT

### `Prescriptions` Table

-   `prescription_id`: INT PRIMARY KEY
-   `patient_id`: INT FOREIGN KEY (references `Patients`)
-   `doctor_id`: INT FOREIGN KEY (references `Doctors`)
-   `medication_name`: VARCHAR(255)
-   `dosage`: VARCHAR(255)
-   `instructions`: TEXT
