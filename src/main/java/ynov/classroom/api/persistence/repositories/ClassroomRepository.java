package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Classroom;
import ynov.classroom.api.domain.ports.ClassroomPort;
import ynov.classroom.api.persistence.mappers.ClassroomMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ClassroomRepository implements ClassroomPort {
    private final ClassroomRepositoryJPA classroomRepository;
    private final ClassroomMapper mapper;

    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Classroom save(Classroom classroom) {
        classroomRepository.save(mapper.toEty(classroom));
        return classroom;
    }
}
