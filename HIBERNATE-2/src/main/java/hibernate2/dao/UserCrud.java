package hibernate2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate2.dto.User;

public class UserCrud {
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
//	EntityManager em = emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
//	public void userSave(User user) {
//		et.begin();
//		em.persist( user);
//		et.commit();
//		System.out.println("inserted successfully.........");
//	}
////	public void userFetch(int id) {
////		User db = em.find(User.class, id);
////		if(db!=null) {
////			System.out.println(db);
////		}
////		else {
////			System.out.println("not present your id lodu "+db );
////		}
////		
////		System.out.println("inserted successfully.........");
////	}
//	public void userUpdate(User user) {
//		User db = em.find(User.class, user.getId());
//		if(db!=null) {
//			if(user.getPhNo()!=0)
//				db.setPhNo(user.getPhNo());
//			if(user.getName()!=null)
//				db.setName(user.getName());
//			if(user.getAddress()!=null)
//				db.setAddress(user.getAddress());
//			if(user.getEmail()!=null)
//				db.setEmail(user.getEmail());
//			if(user.getAge()!=0)
//				db.setAge(user.getAge());
//			if(user.getGender()!=null)
//				db.setGender(user.getGender());
//			
//			et.begin();
//			em.merge(db);
//			et.commit();
//		}
//		else {
//			System.out.println("not present your id bro... "+db );
//		}
//		
//		System.out.println("inserted successfully.........");
//	}
//	public void userDelete(User user) {
////		em.remove(user.getId);
//	}
//	public void userFetch() {
////		Query q = em.createNativeQuery("select * from user");
//		Query q = em.createQuery("select u from User u");
//		List<User> list = q.getResultList();
//		System.out.println(list);
//	}
//	public void UserEmailFetch(String email) {
//		Query q = em.createQuery("select a from User a where email=?1");
//		q.setParameter(1, email);
////		System.out.println(q.getResultList());
//		 List list = q.getResultList();
//	   System.out.println(list);
//		 
//	}
//	public void userDeleteByPhNo(long phNo) {
//		Query q = em.createQuery("delete  from User  where phNo=?1");
//		q.setParameter(1, phNo);
//		et.begin();
//		q.executeUpdate();
//		et.commit();
//	}
	public void userPhoneFetch(long phNo) {
		Query q = em.createQuery("select a from User a where phNo=?1");
		q.setParameter(1, phNo);
//		System.out.println(q.getResultList());
		 List list = q.getResultList();
	   System.out.println(list);
		 
	}
//	public void userPhoneFetch(long phNo) {
//		Query q = em.createQuery("select a from User a where phNo=:PhNo");
//		q.setParameter("PhNo", phNo);
////		System.out.println(q.getResultList());
//		 List list = q.getResultList();
//	   System.out.println(list);
//		 
//	}
//	public void userEmailIdFetch(String email,int id) {
//		Query q = em.createQuery("select a from User a where email=:email and id=:id");
//		q.setParameter("email", email);
//		q.setParameter("id", id);
////		System.out.println(q.getResultList());
//		 List<User> list =  q.getResultList();
//	   System.out.println(list);
//		 
//	}
//	public void userEmailIdFetch(String email,int id) {
//		Query q = em.createQuery("select a from User a where email=:email and id=:id");
//		q.setParameter("email", email);
//		q.setParameter("id", id);
////		System.out.println(q.getResultList());
//		 User list = (User) q.getSingleResult();
//	   System.out.println(list);
//		 
//	}
}
