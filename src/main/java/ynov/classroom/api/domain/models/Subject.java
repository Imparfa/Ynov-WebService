package ynov.classroom.api.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subject {
    private Integer id;
    private String subject;
}
