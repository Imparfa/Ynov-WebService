package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Subject;
import ynov.subject.api.web.dtos.SubjectDto;

@Mapper
public interface SubjectDtoMapper {
    SubjectDto toDto(Subject admin);

    Subject toModel(SubjectDto adminDto);
}
