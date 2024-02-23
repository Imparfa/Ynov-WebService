package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Comment;

import java.util.List;

public interface CommentPort {
  List<Comment> findAll();
  Comment save(Comment comment);
}
