package one_to_one_Hibernate.controller;


import one_to_one_Hibernate.dao.PanCardDao;
import one_to_one_Hibernate.dao.PersonDao;

public class Main {
	
	public static void main(String[] args) {
		PersonDao dao=new PersonDao();
//		dao.savePerson(new Person(0, "dinga", "d@gm", "123", "hyd", 465767564, new PanCard(0, "dinga", "45dsfg456")));
//		dao.fetchPerson(4);
//		
		
		PanCardDao dao2=new PanCardDao();
//		dao2.savePanCard(new PanCard(0, "dinga", "45dsfg456"),1);
//		dao2.fetchPanCard(3);
		dao2.deletePanCard(2);
		
	}
	

}
