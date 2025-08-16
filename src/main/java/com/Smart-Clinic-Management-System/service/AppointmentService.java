import com.yourproject.model.Appointment;
import com.yourproject.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    /**
     * Books and saves a new appointment.
     * @param appointment The Appointment object to be saved.
     * @return The saved Appointment object.
     */
    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    /**
     * Retrieves all appointments for a given doctor on a specific date.
     * @param doctorId The ID of the doctor.
     * @param date The date to search for appointments.
     * @return A list of appointments for the doctor on the specified date.
     */
    public List<Appointment> getAppointmentsForDoctorOnDate(Long doctorId, LocalDate date) {
        // Assuming you have a custom method in your AppointmentRepository
        // to handle this specific query.
        return appointmentRepository.findByDoctorIdAndAppointmentDate(doctorId, date);
    }
}
