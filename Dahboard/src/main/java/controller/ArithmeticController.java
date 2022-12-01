package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ArithmeticController
 */
public class ArithmeticController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArithmeticController() {
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
		double first = Double.parseDouble(request.getParameter("txtFirst"));
		double second = Double.parseDouble(request.getParameter("txtSecond"));
		
		
		double result;
		
		String btn= request.getParameter("btn");
		if(btn.equals("Add")) {
			result = first + second;
		} else if(btn.equals("Subtract")) {
			result = first - second;
		}else {
			result = first*second;
		}
		//Setting the value
		request.setAttribute("result", result);
		//Navigate to another page
		RequestDispatcher rd = request.getRequestDispatcher("/view/Output.jsp");
		rd.forward(request, response);
	}

	
}
