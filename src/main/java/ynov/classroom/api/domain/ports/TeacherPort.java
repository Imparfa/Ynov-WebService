package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Teacher;

import java.util.List;

public interface TeacherPort {
    List<Teacher> findAll();

    Teacher save(Teacher teacher);
}
