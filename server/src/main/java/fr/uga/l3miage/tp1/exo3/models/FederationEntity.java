package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.models.enums.BrandType;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table
public class FederationEntity {

    @Id
    private String name;

    private Boolean isFageMembership;

    @OneToMany
    private Set<AssociationEntity> ApourAssociation;


}
