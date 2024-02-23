package ynov.classroom.api.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Classroom {
    private Integer id;
    private Integer level;
    private String section;
    private Integer order;
}
