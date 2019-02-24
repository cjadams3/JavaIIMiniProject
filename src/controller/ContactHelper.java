package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Contact;

public class ContactHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaIIMiniProject");

	
	public List<Contact> findContactByType(String findType) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Contact> typedQuery = em.createQuery("select p from Contact p where p.phonetype = :selectedType", Contact.class);
		typedQuery.setParameter("selectedType", findType);

		List<Contact> foundType = typedQuery.getResultList();
		em.close();
		return foundType;
	}

	public List<Contact> findContactByName(String findName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Contact> typedQuery = em.createQuery("select p from Contact p where p.phonename = :selectedName", Contact.class);
		typedQuery.setParameter("selectedName", findName);

		List<Contact> foundName = typedQuery.getResultList();
		em.close();
		return foundName;
	}
	
	public Contact findContactByID(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Contact found = em.find(Contact.class, idToEdit);
		em.close();
		return found;
	}
	
	public void updateContact(Contact toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);

	public void InsertItem(Contact li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
}
