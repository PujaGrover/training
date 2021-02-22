package com.veritis.web.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<font color=\"red\"><marquee><h1>Welcometo Servlet World of Veritis</h1></marquee><font>");
		getServletContext().setAttribute("test", 100);
		
	}

}
