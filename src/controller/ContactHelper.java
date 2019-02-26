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
		TypedQuery<Contact> typedQuery = em.createQuery("select c from Contact c where c.Contacttype = :selectedType", Contact.class);
		typedQuery.setParameter("selectedType", findType);

		List<Contact> foundType = typedQuery.getResultList();
		em.close();
		return foundType;
	}

	public List<Contact> findContactByName(String findName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Contact> typedQuery = em.createQuery("select c from Contact c where c.Contactname = :selectedName", Contact.class);
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
	}

	public void InsertItem(Contact c) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Contact> getAllContacts() {
		EntityManager em = emfactory.createEntityManager();
		List<Contact> allContacts = em.createQuery("SELECT c FROM Contact c").getResultList();
		return allContacts;
	}

	public void deleteItem(Contact itemToDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Contact> typedQuery = em.createQuery("select c from Contact c where c.firstname = :selectedFirstName and c.LastName = :selectedType", Contact.class);
		typedQuery.setParameter("selectedFirstName", itemToDelete.getFirstName());
		typedQuery.setParameter("selectedLastName", itemToDelete.getLastName());
		typedQuery.setMaxResults(1);
		Contact result = typedQuery.getSingleResult();
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}
}
