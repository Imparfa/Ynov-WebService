package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.AdminEty;

public interface AdminRepositoryJPA extends JpaRepository<AdminEty, Integer> {
}
