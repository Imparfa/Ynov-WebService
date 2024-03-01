package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.SubjectEty;

public interface SubjectRepositoryJPA extends JpaRepository<SubjectEty, Integer> {
}
