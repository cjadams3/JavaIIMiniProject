package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate birthDate;
	private int houseNumber;
	private String street;
	private String city;
	private String state;
	private List<Phone> allPhoneItems = new ArrayList<Phone>();
	
	public Contact () {
		super();
	}
	
	public Contact(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Contact(String firstName, String lastName, int age, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	public Contact(String firstName, String lastName, int age, LocalDate birthDate, int houseNumber, String street, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "[ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Birth Date: " + birthDate + ", House Number: " + houseNumber + ", Street: " + street + ", City: " + city + ", State: " + state + "]";
	}
}
