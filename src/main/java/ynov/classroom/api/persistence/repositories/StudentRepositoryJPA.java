package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.StudentEty;

public interface StudentRepositoryJPA extends JpaRepository<StudentEty, Integer> {
}
