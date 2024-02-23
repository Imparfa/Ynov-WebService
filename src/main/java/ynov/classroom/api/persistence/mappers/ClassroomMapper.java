package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Classroom;
import ynov.classroom.api.persistence.entities.ClassroomEty;

@Mapper(componentModel = "spring")
public interface ClassroomMapper {
    ClassroomEty toEty(Classroom classroom);

    Classroom toModel(ClassroomEty ety);
}
