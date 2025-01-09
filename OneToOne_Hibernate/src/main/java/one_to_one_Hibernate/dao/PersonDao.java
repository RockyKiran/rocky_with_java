package one_to_one_Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_one_Hibernate.dto.PanCard;
import one_to_one_Hibernate.dto.Person;

public class PersonDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rockyyyy");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void savePerson(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
	}
	public void fetchPerson(int person_id) {
		Person db = em.find(Person.class, person_id);
		if (db != null) {
			System.out.println(db);
		}	}
		
		public void deletePerson(int person_id) {
			Person db = em.find(Person.class, person_id);
			if (db != null) {
				et.begin();
				em.remove(db);
				et.commit();
			}
	}

}
