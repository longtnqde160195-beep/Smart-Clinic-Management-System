package com.SmartClinicManagementSystem.controller;

import com.SmartClinicManagementSystem.service.DoctorService;
import com.SmartClinicManagementSystem.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/availability")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private TokenService tokenService;

    @GetMapping("/{user}/{doctorId}/{date}/{token}")
    public ResponseEntity<Map<String, Object>> getAvailability(
            @PathVariable("user") String user,
            @PathVariable("doctorId") Long doctorId,
            @PathVariable("date") LocalDate date,
            @PathVariable("token") String token) {

        Map<String, Object> response = new HashMap<>();

        if (!"doctor".equals(user) && !"admin".equals(user)) {
            response.put("status", "error");
            response.put("message", "Invalid user type.");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        if (!tokenService.isTokenValid(token)) {
            response.put("status", "error");
            response.put("message", "Invalid token.");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }

        try {
            // This method would be implemented in your DoctorService
            // It should retrieve available time slots for the given doctor and date
            // For example:
            // List<LocalDateTime> availableTimes = doctorService.getAvailableTimeSlots(doctorId, date);
            // response.put("status", "success");
            // response.put("availableTimes", availableTimes);
            // return new ResponseEntity<>(response, HttpStatus.OK);

            response.put("status", "success");
            response.put("message", "Availability check endpoint reached.");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "An unexpected error occurred.");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
