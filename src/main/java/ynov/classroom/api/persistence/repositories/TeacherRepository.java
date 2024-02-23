package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Teacher;
import ynov.classroom.api.domain.ports.TeacherPort;
import ynov.classroom.api.persistence.mappers.TeacherMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class TeacherRepository implements TeacherPort {
    private final TeacherRepositoryJPA teacherRepository;
    private final TeacherMapper mapper;

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Teacher save(Teacher teacher) {
        teacherRepository.save(mapper.toEty(teacher));
        return teacher;
    }
}
