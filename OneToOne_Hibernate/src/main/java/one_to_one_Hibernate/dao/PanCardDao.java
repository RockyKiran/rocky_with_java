package one_to_one_Hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_one_Hibernate.dto.PanCard;
import one_to_one_Hibernate.dto.Person;

public class PanCardDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rockyyyy");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void savePanCard(PanCard card, int person_id) {
		Person db = em.find(Person.class, person_id);
		if (db != null) {
			et.begin();
			db.setPan(card);
			em.persist(card);
			et.commit();
		}
	}

	public void fetchPanCard(int card_id) {
		PanCard db = em.find(PanCard.class, card_id);
		if (db != null) {
			System.out.println(db);
		}
	}

	public void deletePanCard(int card_id) {
		PanCard db = em.find(PanCard.class, card_id);

		if (db != null) {

			Query query = em.createQuery("select a from Person a where pan=?1");
			query.setParameter(1, db);
			et.begin();

			try {
				Person p = (Person) query.getSingleResult();
				p.setPan(null);

			} catch (Exception e) {
			}

			em.remove(db);
			et.commit();
		}

	}
}
