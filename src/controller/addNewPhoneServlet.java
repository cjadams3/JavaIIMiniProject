package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import model.Phone;

/**
 * Servlet implementation class addNewPhoneServlet
 */
@WebServlet("/addNewPhoneServlet")
public class addNewPhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addNewPhoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContactHelper nch = new ContactHelper();
		PhoneHelper nph = new PhoneHelper();
		
		int contactID = Integer.parseInt(request.getParameter("id"));
		Contact thisContact = nch.searchForItemById(contactID);
		
		
		String phoneType = request.getParameter("type");
		String phoneNumber = request.getParameter("number");
		
		Phone newPhone = new Phone(phoneType, phoneNumber);
		
		if (thisContact != null) { // Edit this phone entity
			
		}
		else { // New phone entity
			String fName = request.getParameter("fName");
			String lName = request.getParameter("lName");
			LocalDate bDate = LocalDate.parse(request.getParameter("bDate"));
			int hNumber = Integer.parseInt(request.getParameter("hNumber"));
			String street = request.getParameter("street");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			
			Contact toAdd = new Contact(fName, lName, bDate, hNumber, street, city, state);
			newPhone.setContactItem(toAdd);
			toAdd.getAllPhoneItems().add(newPhone);
			nph.InsertPhone(newPhone);
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
