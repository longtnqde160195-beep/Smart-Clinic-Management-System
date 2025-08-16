import com.yourproject.service.DoctorService;
import com.yourproject.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private TokenService tokenService;

    @GetMapping("/doctors/availability/{specialty}/{date}")
    public ResponseEntity<List<String>> getDoctorAvailability(
            @RequestHeader("Authorization") String token,
            @PathVariable String specialty,
            @PathVariable LocalDate date) {

        // Token validation logic
        if (!tokenService.isValidToken(token)) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        // Get available times from the service layer
        List<String> availableTimes = doctorService.getAvailableTimes(specialty, date);

        if (availableTimes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }

        // Return a structured ResponseEntity
        return ResponseEntity.ok(availableTimes);
    }
}
