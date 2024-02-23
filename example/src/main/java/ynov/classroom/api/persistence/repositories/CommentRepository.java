package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Comment;
import ynov.classroom.api.domain.ports.CommentPort;
import ynov.classroom.api.persistence.mappers.CommentEtyMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class CommentRepository implements CommentPort {
  private final CommentRepositoryJPA commentRepository;
  private final CommentEtyMapper mapper;

  @Override
  public List<Comment> findAll() {
    return commentRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
  }

  @Override
  public Comment save(Comment comment) {
    return null;
  }
}
