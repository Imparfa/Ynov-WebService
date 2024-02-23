package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.ClassroomEty;

public interface ClassroomRepositoryJPA extends JpaRepository<ClassroomEty, Integer> {
}
