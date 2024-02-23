package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Comment;
import ynov.classroom.api.persistence.entities.CommentEty;

@Mapper(componentModel = "spring")
public interface CommentEtyMapper {
    CommentEty toEty(Comment comment);
    Comment toModel(CommentEty ety);
}
