package OneToMany_Hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String loc;
	
	@ManyToOne
	Uesr u;

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", name=" + name + ", loc=" + loc + ", u=" + u + "]";
	}

	public BankAccount(int id, String name, String loc, Uesr u) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.u = u;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Uesr getU() {
		return u;
	}

	public void setU(Uesr u) {
		this.u = u;
	}

	public BankAccount() {
		super();
	}

}
