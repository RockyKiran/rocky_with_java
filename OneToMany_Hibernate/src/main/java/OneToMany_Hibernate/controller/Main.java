package OneToMany_Hibernate.controller;

import javax.persistence.Persistence;

import oneToManyHibernate.dao.PersonCrud;
import person.dto.Person;

public class Main {
static PersonCrud crud=new PersonCrud();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("rockyyyy");
		
		

	
	}
}
