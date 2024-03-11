package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.typeAccount;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Session {

    @Id
    private UUID idSession;

    private String lastCommand;


    private String currentDir;

    private Boolean lock;

    @OneToOne(mappedBy = "Session")
    private User est_associe_a;

}
