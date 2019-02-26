package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;

/**
 * Servlet implementation class navigationServlet
 */
@WebServlet("/navigationServlet")
public class navigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public navigationServlet() {
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
		String action = request.getParameter("action");
		
		if (action == null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else if (action.equals("add")) {
			Contact thisContact = new Contact(); // Work with edit page
			request.setAttribute("thisContact", thisContact);
			request.setAttribute("thisMonth", " ");
			request.setAttribute("thisDay", " ");
			request.setAttribute("thisYear", " ");
			getServletContext().getRequestDispatcher("/add.jsp").forward(request, response);
		}
		else if (action.equals("view")) {
			getServletContext().getRequestDispatcher("/viewAllServlet").forward(request, response);
		}
	}

}
