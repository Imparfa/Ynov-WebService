package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.web.apis.AdminApi;
import ynov.classroom.api.web.dtos.AdminDto;
import ynov.classroom.api.persistence.repositories.AdminRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class EcfServerAdminController implements AdminApi {

  private final AdminRepository adminRepository;
  private final AdminDtoMapper mapper;
  @Override
  public ResponseEntity<List<AdminDto>> listAdmin() {
    return ResponseEntity.ok(adminRepository.findAll().stream()
      .map(mapper::toDto).collect(Collectors.toList()));
  }

  @Override
  public ResponseEntity<Void> saveAdmin(AdminDto admin) {
    return adminRepository.save(mapper.toModel(admin)) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
  }
}
