package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Palindrom
 */
public class Palindrom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Palindrom() {
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
		int n = Integer.parseInt(request.getParameter("number"));

		
		
		int r,sum=0,temp; 
//		int result=0;
			String result = null;
			
			String btn= request.getParameter("btn");
			if(btn.equals("Calculate")) {
				
				  
				  temp=n;    
				  while(n>0){    
					   r=n%10;  //getting remainder  
					   sum=(sum*10)+r;    
					   n=n/10;    
					  }    
					  if(temp==sum)    
//					   System.out.println("palindrome number ");    
					  result="Palindrome number";
					  else    
//					   System.out.println("not palindrome"); 
						  result="Not Palindrome number";

				  request.setAttribute("result", result);
					//Navigate to another page
					RequestDispatcher rd = request.getRequestDispatcher("/view/Output.jsp");
					rd.forward(request, response);
					
					doGet(request, response);
			}
	}}


