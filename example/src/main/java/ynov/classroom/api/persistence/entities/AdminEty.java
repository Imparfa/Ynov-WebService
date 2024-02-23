package ynov.classroom.api.persistence.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "T_COMPTE")
public class AdminEty {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "MDP")
    private String mdp;
}
