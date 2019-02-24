import java.time.LocalDate;

import controller.ContactHelper;
import controller.PhoneHelper;
import model.Contact;
import model.Phone;

public class ContactTester {

	public static void main(String[] args) {
//		ContactHelper nch = new ContactHelper();
		PhoneHelper nph = new PhoneHelper(); 
		
		String sBDate = "1969-01-12";
		LocalDate fifthBDate = LocalDate.parse(sBDate);
		Contact contact = new Contact("Stan", "Richards", fifthBDate, 1219, "Houston St", "Kansas City", "MO");
		
		Phone newPhone = new Phone("Home", "515-556-1975");
		
		newPhone.setContactItem(contact);
		contact.getAllPhoneItems().add(newPhone);
		nph.InsertPhone(newPhone);
		
	}

}
