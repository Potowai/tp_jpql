package fr.epsi.b32324c2;

import fr.epsi.b32324c2.banque.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Création de l'entité Banque
            Banque banque = new Banque();
            banque.setNom("BanqueXYZ");

            // Création de l'entité Client
            Client client = new Client();
            client.setNom("Doe");
            client.setPrenom("John");
            client.setDateNaissance(LocalDate.of(1990, 1, 1));
            Adresse adresse = new Adresse();
            adresse.setNumero(123);
            adresse.setRue("Rue de l'Exemple");
            adresse.setCodePostal(75000);
            adresse.setVille("Paris");
            client.setAdresse(adresse);

            // Création de l'entité Compte (Livret A)
            LivretA livretA = new LivretA();
            livretA.setNumero("LA123456");
            livretA.setSolde(1000.0);
            livretA.setTaux(0.75);

            // Création d'une opération
            Virement operation = new Virement();
            operation.setDate(LocalDateTime.now());
            operation.setMontant(200.0);
            operation.setMotif("Dépôt initial");
            operation.setBeneficiaire("ALEXIS");
            // Persistance des entités
            em.persist(banque);
            em.persist(client);
            em.persist(livretA);
            em.persist(operation);
            System.out.println("Persisted");
            em.getTransaction().commit();
            System.out.println("Committed");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
