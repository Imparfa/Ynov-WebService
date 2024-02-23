package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.TeacherEty;

public interface TeacherRepositoryJPA extends JpaRepository<TeacherEty, Integer> {
}
