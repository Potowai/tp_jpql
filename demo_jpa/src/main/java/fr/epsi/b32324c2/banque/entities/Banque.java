package fr.epsi.b32324c2.banque.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    private String nom;

    // Getters et setters

    public Banque(String nom) {
        this.nom = nom;
    }

    public Banque() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
