package ynov.classroom.api.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import ynov.classroom.api.web.apis.CommentairesApi;
import ynov.classroom.api.web.dtos.CommentairesDto;
import ynov.classroom.api.persistence.repositories.CommentRepository;
import ynov.classroom.api.web.mappers.CommentDtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8100")
public class EcfServerCommentController implements CommentairesApi {

  private final CommentRepository commentRepository;
  private final CommentDtoMapper mapper;

  @Override
  public ResponseEntity<List<CommentairesDto>> listCommentaire() {
    return ResponseEntity.ok(commentRepository.findAll().stream()
      .map(mapper::toDto).collect(Collectors.toList()));
  }

  @Override
  public ResponseEntity<Void> saveCommentaire(Integer id, String nom, String note) {
    return null;
  }
}
