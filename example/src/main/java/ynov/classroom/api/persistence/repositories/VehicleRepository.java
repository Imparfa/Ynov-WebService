package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Vehicle;
import ynov.classroom.api.domain.ports.VehiclePort;
import ynov.classroom.api.persistence.mappers.VehicleEtyMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class VehicleRepository implements VehiclePort {
  private final VehicleRepositoryJPA vehicleRepository;
  private final VehicleEtyMapper mapper;

  @Override
  public List<Vehicle> findAll() {
    return vehicleRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
  }

  @Override
  public Vehicle save(Vehicle vehicle) {
    return null;
  }
}
