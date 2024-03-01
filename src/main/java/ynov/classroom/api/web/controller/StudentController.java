package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.persistence.repositories.AdminRepository;
import ynov.classroom.api.persistence.repositories.StudentRepository;
import ynov.classroom.api.web.mappers.StudentDtoMapper;
import ynov.subject.api.web.apis.StudentApi;
import ynov.subject.api.web.dtos.NewStudentDto;
import ynov.subject.api.web.dtos.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class StudentController implements StudentApi {

    private final StudentRepository classroomRepository;
    private final AdminRepository adminRepository;
    private final StudentDtoMapper mapper;


    @Override
    public ResponseEntity<List<StudentDto>> listStudents() {
        return ResponseEntity.ok(classroomRepository.findAll().stream()
                .map(mapper::toDto).collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<Void> saveStudent(NewStudentDto newStudentDto, String authorization) {
        if (!adminRepository.existsByToken(authorization))
            return ResponseEntity.badRequest().build();
        var newStudent = new StudentDto();
        newStudent.id(null)
                .firstname(newStudentDto.getFirstname())
                .lastname(newStudentDto.getLastname());
        return classroomRepository.save(mapper.toModel(newStudent)) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
