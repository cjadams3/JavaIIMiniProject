package model;

public class Phone {
	private int id;
	private String phoneType;
	private String phoneNumber;
	private Contact contactItem;
	
	public Phone() {
		super();
	}
	
	public Phone(String phoneType, String phoneNumber, Contact contactItem) {
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
