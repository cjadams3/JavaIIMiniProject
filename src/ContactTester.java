import java.time.LocalDate;

import model.Contact;

public class ContactTester {

	public static void main(String[] args) {
		Contact firstContact = new Contact();
		firstContact.setFirstName("Terry");
		firstContact.setLastName("Jones");
		firstContact.setAge(35);
		String sBDate = "1984-01-15";
		LocalDate firstBDate = LocalDate.parse(sBDate);
		firstContact.setBirthDate(firstBDate);
		firstContact.setHouseNumber(1459);
		firstContact.setStreet("Main St");
		firstContact.setCity("New York City");
		firstContact.setState("New York");
		System.out.println(firstContact.toString());
		
		Contact secondContact = new Contact("Bill", "Johnson");
		secondContact.setAge(20);
		sBDate = "1998-05-15";
		LocalDate secondBDate = LocalDate.parse(sBDate);
		secondContact.setBirthDate(secondBDate);
		secondContact.setHouseNumber(2255);
		secondContact.setStreet("Grand Ave");
		secondContact.setCity("Des Moines");
		secondContact.setState("Iowa");
		System.out.println(secondContact.toString());
		
		sBDate = "1982-03-15"; // 36
		LocalDate thirdBDate = LocalDate.parse(sBDate);
		Contact thirdContact = new Contact("Tim", "Nelson", 36, thirdBDate);
		thirdContact.setHouseNumber(8519);
		thirdContact.setStreet("Williams Road");
		thirdContact.setCity("Omaha");
		thirdContact.setState("Nebraska");
		System.out.println(thirdContact.toString());
		

		sBDate = "1969-01-12";
		LocalDate fifthBDate = LocalDate.parse(sBDate);
		Contact fifthContact = new Contact("Stan", "Richards", 50, fifthBDate, 1219, "Houston St", "Kansas City", "Missouri");
		System.out.println(fifthContact.toString());
	}

}
