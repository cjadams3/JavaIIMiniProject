package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contact;


public class ContactHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaIIMiniProject");
	
	public void InsertItem(Contact li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
}
