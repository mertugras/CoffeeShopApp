package Entity;

import java.util.Date;

import Abstract.Entity;


public class Customer implements Entity {

	int id;
	String name;
	String lastName;
	int dateOfBirthDay;
	String nationaltyId;
	
	public Customer(int id, String name, String lastName, int dateOfBirthDay, String nationaltyId) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirthDay = dateOfBirthDay;
		this.nationaltyId = nationaltyId;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public void setDateOfBirthDay(int dateOfBirthDay) {
		this.dateOfBirthDay = dateOfBirthDay;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
}
