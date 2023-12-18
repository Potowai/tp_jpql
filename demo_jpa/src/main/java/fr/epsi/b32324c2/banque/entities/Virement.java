package fr.epsi.b32324c2.banque.entities;
import javax.persistence.Entity;

@Entity
public class Virement extends Operation {
    private String beneficiaire;

    public Virement() {
    }

    public Virement(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
    // Getters and setters...
}
