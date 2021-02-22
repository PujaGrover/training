package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type1Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//1. Load the Driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//System.out.println("Driver Loaded.........");
		//2 . Establish the connection
		Connection con=DriverManager.getConnection("jdbc:odbc:veritisds");
		//System.out.println("Connected.....");
		//3. Statement
		Statement stmt=con.createStatement();
		
		//4. Execute
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		// Handling the results
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}

	}

}
