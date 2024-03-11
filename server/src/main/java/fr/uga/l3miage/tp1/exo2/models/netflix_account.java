package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class netflix_account {

    @Id
    private Integer bigint;

    private Integer nb_devices;

    @Enumerated(EnumType.ORDINAL)
    private typeAccount typeAccount;

    @Column(name = "FK")
    private String uuid_user;

    @OneToOne(mappedBy = "netflix_account")
    private netflix_user NetflixUserEntity ;
}
