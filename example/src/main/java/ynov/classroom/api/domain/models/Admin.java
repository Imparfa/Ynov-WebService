package ynov.classroom.api.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Admin {
  private Integer id;
  private String mail;
  private String mdp;
}
