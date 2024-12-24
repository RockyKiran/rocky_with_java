package hibernate2projrct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import hibernate2project.dto.Useerrr;


public class CrudUseerrr {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void userSave(Useerrr useerr) {
		et.begin();
		em.persist( useerr);
		et.commit();
		System.out.println("inserted successfully.........");
	}
	public Useerrr loginUser(String email,long phNo) throws Exception {
		
		Query q = em.createQuery("select a from Useerrr a where email=?1 and phNo=?2");
		q.setParameter(1, email);
		q.setParameter(2, phNo);
		Useerrr u=(Useerrr) q.getSingleResult();
		System.out.println("Login Successfully");
		return u;
		
	}
	public void userUpdate(Useerrr user) {
		Useerrr db = em.find(Useerrr.class, user.getId());
		if(db!=null) {
			if(user.getPhNo()!=0)
				db.setPhNo(user.getPhNo());
			if(user.getName()!=null)
				db.setName(user.getName());
			
			if(user.getEmail()!=null)
				db.setEmail(user.getEmail());
			if(user.getAge()!=0)
				db.setAge(user.getAge());
			
			
			et.begin();
			em.merge(db);
			et.commit();
		}
		else {
			System.out.println("not present your id bro... "+db );
		}
		
		System.out.println("Updated  successfully.........");
	}
	

}
