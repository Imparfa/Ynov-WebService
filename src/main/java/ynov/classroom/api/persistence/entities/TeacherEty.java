package ynov.classroom.api.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "T_TEACHER")
public class TeacherEty {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "First_Name")
    private String firstname;

    @Column(name = "Subject")
    private Integer subject;

    @Column(name = "Level")
    private Integer level;
}