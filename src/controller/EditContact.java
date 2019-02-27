package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import model.Phone;

/**
 * Servlet implementation class EditContact
 */
@WebServlet("/EditContact")
public class EditContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactHelper ch = new ContactHelper();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String houseNumber = request.getParameter("houseNumber");
		
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		Contact updateContactInfo = ch.findContactByID(tempId);
		
		updateContactInfo.setFirstName(firstName);
		updateContactInfo.setLastName(lastName);
		updateContactInfo.setStreet(street);
		updateContactInfo.setCity(city);
		updateContactInfo.setState(state);
		updateContactInfo.setHouseNumber(Integer.parseInt(houseNumber));
		
		ch.updateContact(updateContactInfo);
		
		getServletContext().getRequestDispatcher("").forward(request, response);

	}

}
