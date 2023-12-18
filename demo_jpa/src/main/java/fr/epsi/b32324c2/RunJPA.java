package fr.epsi.b32324c2;

import javax.persistence.*;

public class RunJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }
}
