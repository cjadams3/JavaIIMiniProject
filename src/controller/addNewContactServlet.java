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
		String sToChange = sYear + "-" + sMonth + "-" + sDay;
		LocalDate bDate = LocalDate.parse(sToChange);
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
		
		Contact newContact = new Contact(fName, lName, bDate, hNumber, street, city, stateCd);
		
		request.setAttribute("ContactInfo", newContact);
		
		getServletContext().getRequestDispatcher("/addPhone.jsp").forward(request, response);
	}

}
