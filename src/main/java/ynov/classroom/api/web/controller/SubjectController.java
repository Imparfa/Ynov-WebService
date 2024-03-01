package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.persistence.repositories.AdminRepository;
import ynov.classroom.api.persistence.repositories.SubjectRepository;
import ynov.classroom.api.web.mappers.SubjectDtoMapper;
import ynov.subject.api.web.apis.SubjectApi;
import ynov.subject.api.web.dtos.NewSubjectDto;
import ynov.subject.api.web.dtos.SubjectDto;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class SubjectController implements SubjectApi {

    private final SubjectRepository subjectRepository;
    private final AdminRepository adminRepository;
    private final SubjectDtoMapper mapper;

    @Override
    public ResponseEntity<List<SubjectDto>> listSubjects() {
        return ResponseEntity.ok(subjectRepository.findAll().stream()
                .map(mapper::toDto).collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<Void> saveSubject(NewSubjectDto newSubjectDto, String authorization) {
        if (!adminRepository.existsByToken(authorization))
            return ResponseEntity.badRequest().build();
        var newSubject = new SubjectDto();
        newSubject.id(null)
                .subject(newSubjectDto.getSubject());
        return subjectRepository.save(mapper.toModel(newSubject)) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
