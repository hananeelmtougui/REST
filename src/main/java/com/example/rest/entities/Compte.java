package com.example.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.ORDINAL)
    @Column(length = 10)
    private TypeCompte type;
    @ManyToOne
    private Client client;


}
