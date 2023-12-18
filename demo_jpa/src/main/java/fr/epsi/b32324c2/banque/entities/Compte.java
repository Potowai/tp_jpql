package fr.epsi.b32324c2.banque.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_compte", discriminatorType = DiscriminatorType.STRING)
@Table(name = "compte")
public abstract class Compte {
    @Id
    private String numero;
    private double solde;

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;

    @ManyToOne
    private Client client;

    // Getters et setters
    public Compte() {
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public void removeOperation(Operation operation) {
        operations.remove(operation);
    }
}