package ynov.classroom.api.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "T_VEHICULE")
public class VehicleEty {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PHOTO")
    private String photo;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRIX")
    private Integer prix;

    @Column(name = "ANNEE")
    private Integer annee;

    @Column(name = "KILOMETRAGE")
    private Integer kilometrage;

    @Column(name = "CARACTERISTIQUES")
    private String caracteristiques;

    @Column(name = "EQUIPEMENT")
    private String equipement;

    @Column(name = "OPTION")
    private String option;
}
