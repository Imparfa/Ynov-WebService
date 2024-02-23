package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.web.apis.VehiculeApi;
import ynov.classroom.api.web.dtos.VehiculeDto;
import ynov.classroom.api.persistence.repositories.VehicleRepository;
import ynov.classroom.api.web.mappers.VehicleDtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class EcfServerVehicleController implements VehiculeApi {

  private final VehicleRepository vehicleRepository;
  private final VehicleDtoMapper mapper;

  @Override
  public ResponseEntity<List<VehiculeDto>> listVehicule() {
    return ResponseEntity.ok(vehicleRepository.findAll().stream()
      .map(mapper::toDto).collect(Collectors.toList()));
  }

  @Override
  public ResponseEntity<Void> saveVehicule(Integer id, String description, Integer prix, Integer annee, Integer kilometrage, String photo, String caractreristiques, String equipement, String option) {
    return null;
  }
}
