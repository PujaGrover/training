package com.veritis.web.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("We are inside the first Servlet");
		System.out.println("We are inside the first Servlet");
		ArrayList<String> names=new ArrayList<String>();
		names.add("Venkata");
		names.add("Krishna");
		names.add("Mohan");
		names.add("Saranu");
		names.add("Veritis");
		request.setAttribute("nameList",names);
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/two");
		rd.forward(request, response);
		System.out.println("We are in first servlet again");
		
	}

}
