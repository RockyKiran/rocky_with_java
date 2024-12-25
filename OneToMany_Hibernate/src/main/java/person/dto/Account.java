package person.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	int id;
	String bankName;
	String loc;
	public Account(int id, String bankName, String loc) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.loc = loc;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", bankName=" + bankName + ", loc=" + loc + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
