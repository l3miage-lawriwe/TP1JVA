package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.sex;

import javax.persistence.*;
import java.time.*;


@Entity
@Table
public class User {

    @Id
    private Long idUser;

    private Boolean SSO;

    private OffsetDateTime birthDate;


    @OneToOne
    private Session session;
}
