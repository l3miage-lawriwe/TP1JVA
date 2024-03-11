package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.models.enums.*;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class brand_miage {

    @Id
    private String compagny_name;

    @Column(length = 11)
    private String siretNumber;
    @Enumerated(EnumType.ORDINAL)
    private BrandType type;

    @ManyToOne
    private product_entity product;


}
