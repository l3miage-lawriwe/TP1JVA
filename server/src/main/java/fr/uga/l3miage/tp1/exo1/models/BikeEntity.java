package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.models.enums.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class BikeEntity {


    @Id
    private String immatriculation;

    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;

    private Boolean automatic;

    private Boolean shifter;

    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;

    private LocalDate circulationDate;



}
