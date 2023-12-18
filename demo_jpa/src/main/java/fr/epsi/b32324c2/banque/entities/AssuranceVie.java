package fr.epsi.b32324c2.banque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("AssuranceVie")
public class AssuranceVie extends Compte {
    private LocalDate dateFin;
    private double taux;

    // Getters et setters
    public AssuranceVie() {
    }

    public AssuranceVie(LocalDate dateFin, double taux) {
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "AssuranceVie{" +
                "dateFin=" + dateFin +
                ", taux=" + taux +
                '}';
    }

}
