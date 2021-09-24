package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.TimeConverter;

/**
 * Servlet implementation class getHoursServlet1
 */
@WebServlet("/getHoursServlet1")
public class getHoursServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getHoursServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userHours = request.getParameter("userHours");
		
		TimeConverter userTime = new TimeConverter(Integer.parseInt(userHours));
		
		request.setAttribute("userHours1", userTime);
		
		getServletContext().getRequestDispatcher("/result1.jsp").forward(request, response);
	}

}
