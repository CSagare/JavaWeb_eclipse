package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerController;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private CustomerController customerController;
    public RegisterController() {
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
	customerController=new CustomerController();
//		result=0;
	PrintWriter out=response.getWriter();
	String fname=request.getParameter("firstName");
	String lname=request.getParameter("lastName");
//	char gender=request.getParameter("gender").charAt(0);
	String phoneNo=request.getParameter("phoneNO");
	String address=request.getParameter("address");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	Customer customer=new Customer(fname,lname,phoneNo,address,username,password);
	try {
		int insert=customerController.createAccount(customer);
		if(insert==1) {
			out.print("sucess");
			
		}else {
			out.print("errorr");
		}
			
		catch(Exception ex) {
			ex.printStackTrace();
		}
		}
