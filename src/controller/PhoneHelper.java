package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Phone;

public class PhoneHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaIIMiniProject");
	
	public List<Phone> findPhoneByType(String findType) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Phone> typedQuery = em.createQuery("select p from Phone p where p.phonetype = :selectedType", Phone.class);
		typedQuery.setParameter("selectedType", findType);

		List<Phone> foundType = typedQuery.getResultList();
		em.close();
		return foundType;
	}

	public List<Phone> findPhoneByName(String findName) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Phone> typedQuery = em.createQuery("select p from Phone p where p.phonename = :selectedName", Phone.class);
		typedQuery.setParameter("selectedName", findName);

		List<Phone> foundName = typedQuery.getResultList();
		em.close();
		return foundName;
	}

	public void InsertPhone(Phone toEnter) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEnter);
		em.getTransaction().commit();
		em.close();
	}

	public Phone findPhoneByID(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Phone found = em.find(Phone.class, idToEdit);
		em.close();
		return found;
	}
	
	public void updatePhone(Phone toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}
