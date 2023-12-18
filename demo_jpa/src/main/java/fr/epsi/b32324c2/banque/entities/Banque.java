package fr.epsi.b32324c2.banque.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "banque")
public class Banque {
    @Id
    private String nom;
    @OneToMany(mappedBy = "banque")
    private List<Client> clients;
    // Getters et setters

    public Banque(String nom) {
        this.nom = nom;
        this.clients = clients;
    }

    public Banque() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
