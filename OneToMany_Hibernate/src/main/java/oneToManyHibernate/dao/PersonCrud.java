package oneToManyHibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import person.dto.Person;


public class PersonCrud {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rockyyyy");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
	}

}
