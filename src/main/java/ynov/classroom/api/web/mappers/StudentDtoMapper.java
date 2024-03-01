package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Student;
import ynov.subject.api.web.dtos.StudentDto;

@Mapper
public interface StudentDtoMapper {
    StudentDto toDto(Student student);

    Student toModel(StudentDto studentDto);
}
