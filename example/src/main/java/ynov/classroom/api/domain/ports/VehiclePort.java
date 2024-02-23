package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Vehicle;

import java.util.List;

public interface VehiclePort {
  List<Vehicle> findAll();
  Vehicle save(Vehicle vehicle);
}
