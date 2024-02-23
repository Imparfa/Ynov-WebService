package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Student;
import ynov.classroom.api.domain.ports.StudentPort;
import ynov.classroom.api.persistence.mappers.StudentMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class StudentRepository implements StudentPort {
    private final StudentRepositoryJPA studentRepository;
    private final StudentMapper mapper;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Student save(Student student) {
        studentRepository.save(mapper.toEty(student));
        return student;
    }
}
