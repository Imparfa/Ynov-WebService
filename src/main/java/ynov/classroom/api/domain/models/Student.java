package ynov.classroom.api.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private Integer id;
    private String firstname;
    private String lastname;
}
