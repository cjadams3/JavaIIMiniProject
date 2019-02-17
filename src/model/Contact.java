package model;

import java.time.LocalDate;

public class Contact {
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate birthDate;
	private String phone;
	private int houseNumber;
	private String street;
	private String city;
	private String state;
	
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
	
	public Contact(String firstName, String lastName, int age, LocalDate birthDate, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
		this.phone = phone;
	}
	
	public Contact(String firstName, String lastName, int age, LocalDate birthDate, String phone, int houseNumber, String street, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
		this.phone = phone;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	
	@Override
	public String toString() {
		return "[First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Birth Date: " + birthDate + ", Phone Number: " + phone + ", House Number: " + houseNumber + ", Street: " + street + ", City: " + city + ", State: " + state + "]";
	}
}
