package OneToOneBidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	String pwd;
	long phNo;
	
	
	@JoinColumn
	@OneToOne
	PanCard card;


	public Person(int id, String name, String email, String pwd, long phNo, PanCard pc) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phNo = phNo;
		this.card = pc;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phNo=" + phNo + ", pc="
				+ card + "]";
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public long getPhNo() {
		return phNo;
	}


	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}


	public PanCard getPc() {
		return card;
	}


	public void setPc(PanCard pc) {
		this.card = pc;
	}


	public Person() {
		super();
	}
	
}
