package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.web.dtos.CommentairesDto;
import ynov.classroom.api.domain.models.Comment;

@Mapper
public interface CommentDtoMapper {
  CommentairesDto toDto(Comment comment);
}
