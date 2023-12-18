package fr.epsi.b32324c2.banque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LivretA")
public class LivretA extends Compte {
    private double taux;

    // Getters et setters
    public LivretA() {
    }

    public LivretA(double taux) {
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }


}
