package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Classroom;
import ynov.classroom.api.web.dtos.ClassroomDto;

@Mapper
public interface ClassroomDtoMapper {
  ClassroomDto toDto(Classroom admin);

  Classroom toModel(ClassroomDto adminDto);
}
