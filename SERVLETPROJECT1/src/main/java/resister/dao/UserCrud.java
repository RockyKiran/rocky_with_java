package resister.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import resister.dto.User;

public class UserCrud {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("rockyyyy");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void userSave(User user) {
		et.begin();
		em.persist(user);
		et.commit();
	}
//public User loginUser(String email,String pwd) throws Exception {
//		
//		Query q = em.createQuery("select a from User a where email=?1 and pwd=?2");
//		q.setParameter(1, email);
//		q.setParameter(2, pwd);
//		User u=(User) q.getSingleResult();
//		System.out.println("Login Successfully");
//		return u;
//		
//	}
public User loginEmailUser(String email) throws Exception {
		
		Query q = em.createQuery("select a from User a where email=?1");
		q.setParameter(1, email);
		User u=(User) q.getSingleResult();
		System.out.println("Login Successfully");
		return u;
		
	}
public List<User> userFetch() {
	Query q = em.createQuery("select a from User a");
	List u= q.getResultList();
	System.out.println("Login Successfully");
	return u;
}
public void deleteUser(int id) {
	User db = em.find(User.class, id);
	if(db!=null) {
		et.begin();
		em.remove(db);
		et.commit();
	}
	
}




public User UserFetch(int id) {
	User db = em.find(User.class, id);
	if(db!=null) {
		return db;
	}else return null;
	
}
public void userUpdate(User user) {
	User db = em.find(User.class, user.getId());
	if(db!=null) {
		if(user.getPhno()!=0)
			db.setPhno(user.getPhno());
		if(user.getFname()!=null)
			db.setFname(user.getFname());
		
		if(user.getLname()!=null)
			db.setLname(user.getLname());
		if(user.getAge()!=0)
			db.setAge(user.getAge());
		if(user.getGender()!=null)
			db.setGender(user.getGender());
		if(user.getEmail()!=null)
			db.setEmail(user.getEmail());
		
		
		
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
