package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.persistence.repositories.AdminRepository;
import ynov.classroom.api.persistence.repositories.ClassroomRepository;
import ynov.classroom.api.web.apis.ClassroomApi;
import ynov.classroom.api.web.dtos.ClassroomDto;
import ynov.classroom.api.web.dtos.NewClassroomDto;
import ynov.classroom.api.web.mappers.ClassroomDtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class ClassroomController implements ClassroomApi {

    private final ClassroomRepository classroomRepository;
    private final AdminRepository adminRepository;
    private final ClassroomDtoMapper mapper;

    @Override
    public ResponseEntity<List<ClassroomDto>> listClassrooms() {
        return ResponseEntity.ok(classroomRepository.findAll().stream()
                .map(mapper::toDto).collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<Void> saveClassroom(String authorization, NewClassroomDto classroom) {
        if (!adminRepository.existsByToken(authorization))
            return ResponseEntity.badRequest().build();
        var newClassroom = new ClassroomDto();
        newClassroom.id(null)
                .level(classroom.getLevel())
                .section(classroom.getSection());
        return classroomRepository.save(mapper.toModel(newClassroom)) != null ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
