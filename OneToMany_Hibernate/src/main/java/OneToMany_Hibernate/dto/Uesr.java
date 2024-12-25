package OneToMany_Hibernate.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Uesr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String pwd;
	String email;
	String phNo;
	
	@OneToMany
	List<BankAccount> ba;

	@Override
	public String toString() {
		return "Uesr [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", phNo=" + phNo + ", ba="
				+ ba + "]";
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public List<BankAccount> getBa() {
		return ba;
	}

	public void setBa(List<BankAccount> ba) {
		this.ba = ba;
	}

	public Uesr() {
		super();
	}

}
