package com.veritis.web.ajax.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxServlet
 */
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Recieved here in servlet.......................");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("emailaddress");
		try{Thread.sleep(3000);}catch(Exception e){}
		if(email.equals("venkata.saranu@gmail.com")|| email.equals("saranu@gmail.com")||email.equals("venkata@gmail.com")){
			out.println("<font color=\"red\"><b>"+email+ " Already Exists"+"</b></font>");
			
		}
		else
		{
			out.println("<font color=\"green\"><b>"+email+ " is Available"+"</b></font>");
		}
	}

}
