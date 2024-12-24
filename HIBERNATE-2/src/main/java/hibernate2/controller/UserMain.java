package hibernate2.controller;

import javax.persistence.Persistence;

import hibernate2.dao.UserCrud;
import hibernate2.dto.User;

public class UserMain {
static UserCrud crud1=new UserCrud();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("rockyy");
//		User data=new User( "Rocky", "rocky@gmail.com", 1231231, 21, "male", "Odisha");
//		crud1.userFetch();
//		crud1.UserEmailFetch("isha@gmail.com");
		crud1.userPhoneFetch(6372863436l);
		crud1.userDeleteByPhNo(6372863436l);
//		crud1.userEmailIdFetch("rocky@gmail.com", 1);
//		UserCrud crud=new UserCrud();
//		crud.userSave(data);
		System.out.println("DOne................");
		

	}

}
