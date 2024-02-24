package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.persistence.repositories.AdminRepository;
import ynov.classroom.api.web.apis.AdminApi;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class AdminController implements AdminApi {

    private final AdminRepository adminRepository;

    @Override
    public ResponseEntity<String> loginAdmin(String login, String password) {
        if (adminRepository.findByLoginAndPassword(login, password) != null) {
            String token = UUID.randomUUID().toString();
            adminRepository.updateTokenByLogin(token, login);
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().build();
    }
}