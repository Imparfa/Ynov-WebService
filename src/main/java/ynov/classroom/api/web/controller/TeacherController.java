package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.persistence.repositories.AdminRepository;
import ynov.classroom.api.persistence.repositories.TeacherRepository;
import ynov.classroom.api.web.apis.TeacherApi;
import ynov.classroom.api.web.dtos.NewTeacherDto;
import ynov.classroom.api.web.dtos.TeacherDto;
import ynov.classroom.api.web.mappers.TeacherDtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class TeacherController implements TeacherApi {

    private final TeacherRepository classroomRepository;
    private final AdminRepository adminRepository;
    private final TeacherDtoMapper mapper;

    @Override
    public ResponseEntity<List<TeacherDto>> listTeachers() {
        return ResponseEntity.ok(classroomRepository.findAll().stream()
                .map(mapper::toDto).collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<Void> saveTeacher(String authorization, NewTeacherDto teacher) {
        if (!adminRepository.existsByToken(authorization))
            return ResponseEntity.badRequest().build();
        var newTeacher = new TeacherDto();
        newTeacher.id(null)
                .firstname(teacher.getFirstname())
                .lastname(teacher.getLastname())
                .sector(teacher.getSector());
        return classroomRepository.save(mapper.toModel(newTeacher)) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}