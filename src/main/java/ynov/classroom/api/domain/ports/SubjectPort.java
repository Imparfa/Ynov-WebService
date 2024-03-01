package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Subject;

import java.util.List;

public interface SubjectPort {
    List<Subject> findAll();

    Subject save(Subject subject);
}
