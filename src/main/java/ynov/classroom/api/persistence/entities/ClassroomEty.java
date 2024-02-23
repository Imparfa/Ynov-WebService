package ynov.classroom.api.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "T_CLASSROOM")
public class ClassroomEty {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "LEVEL")
    private Integer level;

    @Column(name = "SECTION")
    private String section;

    @Column(name = "ORDER")
    private Integer order;
}
