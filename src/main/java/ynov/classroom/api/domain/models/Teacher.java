package ynov.classroom.api.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teacher {
    private Integer id;
    private String firstname;
    private String lastname;
    private String sector;
}