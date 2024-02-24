package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Teacher;
import ynov.classroom.api.web.dtos.TeacherDto;

@Mapper
public interface TeacherDtoMapper {
    TeacherDto toDto(Teacher teacher);

    Teacher toModel(TeacherDto teacherDto);
}
