package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.models.enums.*;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table

public class product_entity {

    @Id
    @Column(length = 11)
    private String bar_code_number;

    private String name;

    private Boolean consumable;

    @OneToMany
    private Set<brand_miage> brands;
}
