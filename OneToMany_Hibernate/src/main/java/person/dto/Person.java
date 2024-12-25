package person.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	int id;
	String name;
	String address;
	long phNo;
	String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Account> acc;

	public Person(int id, String name, String address, long phNo, String email, List<Account> acc) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
		this.email = email;
		this.acc = acc;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phNo=" + phNo + ", email=" + email
				+ ", acc=" + acc + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Account> getAcc() {
		return acc;
	}

	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}

	public Person() {
		super();
	}

}
