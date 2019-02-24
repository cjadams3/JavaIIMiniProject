package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private int id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
	@Column(name="HOUSE_NUMBER")
	private int houseNumber;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="contactItem", orphanRemoval=true)
	private List<Phone> allPhoneItems = new ArrayList<Phone>();
	
	public Contact () {
		super();
	}
	
	public Contact(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Contact(String firstName, String lastName, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	public Contact(String firstName, String lastName, LocalDate birthDate, int houseNumber, String street, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public List<Phone> getAllPhoneItems() {
		return allPhoneItems;
	}

	public void setAllPhoneItems(List<Phone> allPhoneItems) {
		this.allPhoneItems = allPhoneItems;
	}

	@Override
	public String toString() {
		return "[ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Birth Date: " + birthDate + ", House Number: " + houseNumber + ", Street: " + street + ", City: " + city + ", State: " + state + "]";
	}
}
