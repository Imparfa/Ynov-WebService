package ynov.classroom.api.domain.models;

import lombok.Data;

@Data
public class Vehicle {
  private Integer id;
  private String photo;
  private String description;
  private Integer prix;
  private Integer annee;
  private Integer kilometrage;
  private String caracteristiques;
  private String equipement;
  private String option;
}
