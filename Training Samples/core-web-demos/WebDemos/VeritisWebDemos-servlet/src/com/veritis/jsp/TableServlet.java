package com.veritis.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;
	Statement stmt;
	ServletConfig config = null;

	public void init(ServletConfig config) {
		this.config = config;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17", "root", "root");
		} catch (Exception e) {

		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		ResultSet rs;
		ResultSetMetaData rsmd;
		List<String> columns = new ArrayList<>();
		List<List<String>> rows = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			rsmd = rs.getMetaData();
			int size = rsmd.getColumnCount();
			for (int i = 1; i <= size; i++) {
				columns.add(rsmd.getColumnName(i));
			}

			while (rs.next()) {
				List<String> row = new ArrayList<>();
				for (int i = 1; i <= size; i++) {
					row.add(rs.getString(i));
				}
				rows.add(row);
			}
		} catch (Exception e) {

		}
		request.getSession().setAttribute("columns",columns);
		request.getSession().setAttribute("rows",rows);
		config.getServletContext().getRequestDispatcher("/table.jsp").forward(request, response);
	}

}
