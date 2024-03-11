package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class netflix_user {

    @Id
    private Integer bigint;

    private String lastname;

    private String firstname;

    @Enumerated(EnumType.ORDINAL)
    private sex sex;

    private LocalDate birthDate;


    @OneToOne
    private netflix_user NetflixAccountEntity;
}
