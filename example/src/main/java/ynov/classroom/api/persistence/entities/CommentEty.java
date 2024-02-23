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
@Table(name = "T_COMMENTAIRE")
public class CommentEty {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "COMMENTAIRE_TEXT")
    private String commentaireText;

    @Column(name = "NOTE")
    private String note;
}
