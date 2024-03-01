package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Subject;
import ynov.classroom.api.domain.ports.SubjectPort;
import ynov.classroom.api.persistence.mappers.SubjectMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class SubjectRepository implements SubjectPort {
    private final SubjectRepositoryJPA subjectRepository;
    private final SubjectMapper mapper;

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Subject save(Subject subject) {
        subjectRepository.save(mapper.toEty(subject));
        return subject;
    }
}
