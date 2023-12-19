package fr.epsi.b32324c2;

import fr.epsi.b32324c2.banque.entities.Banque;

import javax.persistence.*;
import java.util.List;

public class RunJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        System.out.println("EntityManager isOpen() : " + em.isOpen()); // Connect to the database
        System.out.println("Query de select sur la table banque");
        TypedQuery query = em.createQuery("SELECT b FROM Banque b", Banque.class);
        System.out.println("Récupération du résultat");
        List<Banque> banques = query.getResultList();
        System.out.println("Affichage du résultat");
        for (Banque banque : banques) {
            System.out.println(banque.getNom());
        }
        transaction.commit();
        em.close();
        emf.close();
        System.out.println("EntityManager closed");
    }
}
