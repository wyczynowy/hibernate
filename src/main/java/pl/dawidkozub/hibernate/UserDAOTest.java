package pl.dawidkozub.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        User newUser = new User();
        newUser.setEmail("dawidkozub@gmail.com");
        newUser.setFullname("Dawid Kozub");
        newUser.setPassword("java");

        entityManager.persist(newUser);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}