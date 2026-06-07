package project2.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project2.dto.request.RegisterRequest;
import project2.dto.response.RegisterResponse;
import project2.service.RegistrationService;

import java.util.HashMap;
import java.util.Map;

import static io.micrometer.common.util.StringUtils.isBlank;
import static org.springframework.http.ResponseEntity.badRequest;
import static org.springframework.http.ResponseEntity.created;

@RestController
@CrossOrigin(origins = "*")
@Tag(name = "API register", description = "Giang làm")
@RequestMapping("/api")
public class RegistrationController {


    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest request) {
        if (request.getRole() == null) {
            return badRequest("Role is required");
        }
        switch (request.getRole()) {
            case SPECTATOR -> {
                if (isBlank(request.getUserName()) || isBlank(request.getEmail()) || isBlank(request.getPassword())) {
                    return badRequest("userName, email and password are required for SPECTATOR");
                }
                registrationService.registerSpectator(
                        request.getUserName(),
                        request.getEmail(),
                        request.getPassword()
                );
                return created("SPECTATOR");
            }
            case HORSE_OWNER -> {
                if (isBlank(request.getFullName()) || isBlank(request.getUserName())
                        || isBlank(request.getPhone()) || isBlank(request.getEmail()) || isBlank(request.getPassword())) {
                    return badRequest("fullName, userName, phone, email and password are required for HORSE_OWNER");
                }
                registrationService.registerHorseOwner(
                        request.getFullName(),
                        request.getUserName(),
                        request.getPhone(),
                        request.getEmail(),
                        request.getPassword()
                );
                return created("HORSE_OWNER");
            }
            case JOCKEY -> {
                if (isBlank(request.getFullName()) || isBlank(request.getUserName())
                        || request.getAge() == null || request.getExperienceYears() == null
                        || isBlank(request.getPhone()) || isBlank(request.getEmail()) || isBlank(request.getPassword())) {
                    return badRequest("fullName, userName, age, experienceYears, phone, email and password are required for JOCKEY");
                }
                registrationService.registerJockey(
                        request.getFullName(),
                        request.getUserName(),
                        request.getAge(),
                        request.getExperienceYears(),
                        request.getPhone(),
                        request.getPassword(),
                        request.getEmail()
                );
                return created("JOCKEY");
            }
            case RACE_REFEREE -> {
                if (isBlank(request.getFullName()) || isBlank(request.getUserName())
                        || isBlank(request.getPhone()) || isBlank(request.getEmail()) || isBlank(request.getPassword())) {
                    return badRequest("fullName, userName, phone, email and password are required for RACE_REFEREE");
                }
                registrationService.registerRaceReferee(
                        request.getFullName(),
                        request.getUserName(),
                        request.getPhone(),
                        request.getEmail(),
                        request.getPassword()
                );
                return created("RACE_REFEREE");
            }
            default -> {
                return badRequest("Invalid role");
            }
        }
    }
    private ResponseEntity<RegisterResponse> created(String role) {
        RegisterResponse response = new RegisterResponse("Account created successfully", role);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    private ResponseEntity<Map<String, String>> badRequest(String message) {
        Map<String, String> body = new HashMap<>();
        body.put("message", message);
        return ResponseEntity.badRequest().body(body);
    }
    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }


}
