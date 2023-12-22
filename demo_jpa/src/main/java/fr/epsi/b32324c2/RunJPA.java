package fr.epsi.b32324c2;

import fr.epsi.b32324c2.banque.entities.Banque;

import javax.persistence.*;
import java.util.List;

public class RunJPA {
    public static void main(String[] args) {
        Main.main(args);
        // Create the EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();
        try{
            System.out.println("EntityManager isOpen() : " + em.isOpen()); // Connect to the database
            Banque mybanque = em.find(Banque.class, "BanqueXYZ");
            System.out.println("Affichage du résultat");
            if (mybanque != null) {
                System.out.println(mybanque);
            } else {
                System.out.println("Aucun résultat");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            em.close();
            emf.close();
            System.out.println("EntityManager closed");
        }

    }
}
