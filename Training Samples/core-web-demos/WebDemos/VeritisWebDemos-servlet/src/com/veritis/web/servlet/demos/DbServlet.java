package com.veritis.web.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbServlet
 */
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	Statement stmt;
	ServletConfig config=null;
	public void init(ServletConfig config){
		this.config=config;
		try{
		Class.forName(config.getInitParameter("driver"));
		con=DriverManager.getConnection(config.getInitParameter("url"),config.getInitParameter("username"),config.getInitParameter("password"));
		}catch(Exception e){
			
		}
	}
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ResultSet rs;
		ResultSetMetaData rsmd;
		PrintWriter out=response.getWriter();
		try{
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from emp");
		rsmd=rs.getMetaData();
		int size=rsmd.getColumnCount();
		out.println("<table border=\"1\">");
		out.println("<tr>");
		for(int i=1;i<=size;i++){
			out.println("<th>");
			out.println(rsmd.getColumnName(i));
			out.println("</th>");
		}
		out.print("</tr>");
		
		while(rs.next()){
			out.println("<tr>");
			for(int i=1;i<=size;i++){
				out.println("<td>");
				out.println(rs.getString(i));
				out.println("</td>");
			}	
			out.println("</tr>");
		}
		out.println("</table>");
		
		}catch(Exception e){
			
		}
	}

}
