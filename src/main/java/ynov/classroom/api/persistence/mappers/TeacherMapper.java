package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Teacher;
import ynov.classroom.api.persistence.entities.TeacherEty;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherEty toEty(Teacher teacher);

    Teacher toModel(TeacherEty ety);
}
