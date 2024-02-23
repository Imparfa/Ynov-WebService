package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.VehicleEty;

public interface VehicleRepositoryJPA extends JpaRepository<VehicleEty, Integer> {
}
