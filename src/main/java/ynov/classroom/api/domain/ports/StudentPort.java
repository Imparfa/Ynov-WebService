package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Student;

import java.util.List;

public interface StudentPort {
    List<Student> findAll();

    Student save(Student student);
}
