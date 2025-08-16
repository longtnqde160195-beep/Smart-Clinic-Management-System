import com.yourproject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    /**
     * Finds a patient by their email.
     * This is a derived query, automatically implemented by Spring Data JPA.
     */
    Optional<Patient> findByEmail(String email);

    /**
     * Finds a patient by either their email or phone number.
     * This is also a derived query, using the 'Or' keyword.
     */
    Optional<Patient> findByEmailOrPhoneNumber(String email, String phoneNumber);
}
