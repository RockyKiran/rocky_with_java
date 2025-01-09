package one_to_one_Hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	int id ;
	String name;
	String panNo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public PanCard(int id, String name, String panNo) {
		super();
		this.id = id;
		this.name = name;
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "PanCard [id=" + id + ", name=" + name + ", panNo=" + panNo + "]";
	}
	public PanCard() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	

}
