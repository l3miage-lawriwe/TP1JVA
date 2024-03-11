package fr.uga.l3miage.tp1.exo3.models;


import fr.uga.l3miage.tp1.exo3.models.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table

public class AssociationEntity {

    @Id
    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;


    private String secretatryName;

    @Enumerated(EnumType.ORDINAL)
    private AssociationType associationType;

    @ManyToOne
    private FederationEntity APourFederation;
}
