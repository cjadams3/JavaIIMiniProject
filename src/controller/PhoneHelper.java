package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Phone;

public class PhoneHelper 
  ChrisWorkBranch
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JavaIIMiniProject");
	
	public void InsertPhone(Phone toEnter) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEnter);
		em.getTransaction().commit();
		em.close();
	}
======= master
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
