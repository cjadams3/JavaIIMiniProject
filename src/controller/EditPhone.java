package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Phone;

/**
 * Servlet implementation class EditPhone
 */
@WebServlet("/EditPhone")
public class EditPhone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPhone() {
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
		PhoneHelper ph = new PhoneHelper();
		
		String phoneType = request.getParameter("phoneType");
		String phoneNumb = request.getParameter("phoneNumber");
		
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		Phone updatePhoneInfo = ph.findPhoneByID(tempId);
		
		updatePhoneInfo.setPhoneNumber(phoneNumb);
		updatePhoneInfo.setPhoneType(phoneType);
		
		ph.updatePhone(updatePhoneInfo);
		
		getServletContext().getRequestDispatcher("").forward(request, response);


	}

}
