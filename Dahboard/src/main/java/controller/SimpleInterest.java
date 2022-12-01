package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SimpleInterest
 */
public class SimpleInterest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleInterest() {
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
//		doGet(request, response);
double principal = Double.parseDouble(request.getParameter("txtPrincipal"));
double time = Double.parseDouble(request.getParameter("txtTime"));
double Rate = Double.parseDouble(request.getParameter("txtRate"));
		
		double result = 0;
		
		String btn= request.getParameter("btn");
		if(btn.equals("Calculate")) {
	
			result = principal*time*Rate/100;
		} 
		
		//Setting the value
		request.setAttribute("result", result);
		//Navigate to another page
		RequestDispatcher rd = request.getRequestDispatcher("/view/Output.jsp");
		rd.forward(request, response);
	}

}
