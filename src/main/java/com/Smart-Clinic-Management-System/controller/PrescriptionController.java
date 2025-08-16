import com.yourproject.model.Prescription;
import com.yourproject.service.PrescriptionService;
import com.yourproject.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<String> createPrescription(
            @RequestHeader("Authorization") String token,
            @Valid @RequestBody Prescription prescription) {
        
        // 1. Token validation
        if (!tokenService.isValidToken(token)) {
            return new ResponseEntity<>("Invalid or missing token", HttpStatus.UNAUTHORIZED);
        }

        // 2. Request body validation is handled by @Valid
        try {
            prescriptionService.savePrescription(prescription);
            return new ResponseEntity<>("Prescription created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error saving prescription: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
