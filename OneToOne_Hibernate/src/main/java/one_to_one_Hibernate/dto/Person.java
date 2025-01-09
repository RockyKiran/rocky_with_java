package one_to_one_Hibernate.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;
	String name;
	@Column(unique = true)
	String email;
	String pwd;
	String address;
	long phNo;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	PanCard pan;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Person(int id, String name, String email, String pwd, String address, long phNo, PanCard pan) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.address = address;
		this.phNo = phNo;
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", address=" + address
				+ ", phNo=" + phNo + ", pan=" + pan + "]";
	}

	public Person() {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public PanCard getPan() {
		return pan;
	}

	public void setPan(PanCard pan) {
		this.pan = pan;
	}
	

}
