package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import model.Phone;

/**
 * Servlet implementation class thisContactServlet
 */
@WebServlet("/thisContactServlet")
public class thisContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thisContactServlet() {
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
		// TODO Auto-generated method stub
		Integer thisId = Integer.parseInt(request.getParameter("id"));
		String act = request.getParameter("doThis");
		
		if (act == null) {
			getServletContext().getRequestDispatcher("/viewAllServlet").forward(request, response);
		}
		else if (act.equals("Delete Person")) {
			ContactHelper nch = new ContactHelper();
			Contact toDelete = nch.findContactByID(thisId);
			
			nch.deleteItem(toDelete);
			}
		else if (act.equals("Edit Contact Info")) {
			ContactHelper nch = new ContactHelper();
			Contact toEdit = nch.findContactByID(thisId);
			
			request.setAttribute("thisContact", toEdit);
			LocalDate bDate = toEdit.getBirthDate();
			int month = bDate.getMonthValue();
			int day = bDate.getDayOfMonth();
			int year = bDate.getYear();
			request.setAttribute("thisMonth", month);
			request.setAttribute("thisDay", day);
			request.setAttribute("thisYear", year);
			getServletContext().getRequestDispatcher("/add.jsp").forward(request, response);
		}
		else if (act.equals("View Details")) {
			ContactHelper nch = new ContactHelper();
			Contact toView = nch.findContactByID(thisId);
			List<Phone> phonesToView = toView.getAllPhoneItems();
			request.setAttribute("thisContact", toView);
			request.setAttribute("phonesList", phonesToView);
			getServletContext().getRequestDispatcher("/view-details.jsp").forward(request, response);
		}
	}

}
