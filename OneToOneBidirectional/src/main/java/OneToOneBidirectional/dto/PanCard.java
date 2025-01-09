package OneToOneBidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String Address;
	
	@OneToOne(mappedBy = "card")
	Person person;

	public PanCard(int id, String name, String add, Person pe) {
		super();
		this.id = id;
		this.name = name;
		Address = add;
		this.person = pe;
	}

	@Override
	public String toString() {
		return "PanCard [id=" + id + ", name=" + name + ", Add=" + Address + ", pe=" + person + "]";
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

	public String getAdd() {
		return Address;
	}

	public void setAdd(String add) {
		Address = add;
	}

	public Person getPe() {
		return person;
	}

	public void setPe(Person pe) {
		this.person = pe;
	}

	public PanCard() {
		super();
	}
	
}
