package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Student;
import ynov.classroom.api.persistence.entities.StudentEty;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentEty toEty(Student student);

    Student toModel(StudentEty ety);
}
