package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Classroom;

import java.util.List;

public interface ClassroomPort {
    List<Classroom> findAll();

    Classroom save(Classroom classroom);
}
