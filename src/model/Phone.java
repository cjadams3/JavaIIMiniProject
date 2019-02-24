package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PHONE_ID")
	private int id;
	@Column(name="PHONE_TYPE")
	private String phoneType;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CONTACT_ID")
	private Contact contactItem;
	
	public Phone() {
		super();
	}
	
	public Phone (String phoneType, String phoneNumber) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	public Phone(String phoneType, String phoneNumber, Contact contactItem) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.contactItem = contactItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Contact getContactItem() {
		return contactItem;
	}

	public void setContactItem(Contact contactItem) {
		this.contactItem = contactItem;
	}
	
	@Override
	public String toString() {
		return "[id = " + id + ", Phone Type: " + phoneType + ", Phone Number: " + phoneNumber + " Contact ID: " + contactItem.getId() + "]";
	}
}
