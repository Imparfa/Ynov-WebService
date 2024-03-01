package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Subject;
import ynov.classroom.api.persistence.entities.SubjectEty;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectEty toEty(Subject subject);

    Subject toModel(SubjectEty ety);
}
