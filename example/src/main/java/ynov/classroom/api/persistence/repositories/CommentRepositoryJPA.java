package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ynov.classroom.api.persistence.entities.CommentEty;

public interface CommentRepositoryJPA extends JpaRepository<CommentEty, Integer> {
}
