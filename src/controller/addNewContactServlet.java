package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

/**
 * Servlet implementation class addNewContactServlet
 */
@WebServlet("/addNewContactServlet")
public class addNewContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addNewContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		String sMonth = request.getParameter("month");
		String sDay = request.getParameter("day");
		String sYear = request.getParameter("year");
		LocalDate bDate;
		try {
			bDate = LocalDate.of(Integer.parseInt(sYear), Integer.parseInt(sMonth), Integer.parseInt(sDay));
		}
		catch (NumberFormatException ex) {
			bDate = LocalDate.now();
		}
		String sHNumber = request.getParameter("hNumber");
		int hNumber = 0;
		try {
			hNumber = Integer.parseInt(sHNumber);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid house number entered");
		}
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String stateCd = request.getParameter("state");
		
		int idToEdit = Integer.parseInt(request.getParameter("id"));
		ContactHelper nch = new ContactHelper();
		Contact toEdit = nch.findContactByID(idToEdit);
		
		if (toEdit != null) { // Edit this contact
			toEdit.setFirstName(fName);
			toEdit.setLastName(lName);
			toEdit.setBirthDate(bDate);
			toEdit.setHouseNumber(hNumber);
			toEdit.setStreet(street);
			toEdit.setCity(city);
			toEdit.setState(stateCd);
			nch.updateContact(toEdit);
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		else { // Add new contact
		Contact newContact = new Contact(fName, lName, bDate, hNumber, street, city, stateCd);
		
		request.setAttribute("ContactInfo", newContact);
		
		getServletContext().getRequestDispatcher("/addPhone.jsp").forward(request, response);
		}
	}

}
