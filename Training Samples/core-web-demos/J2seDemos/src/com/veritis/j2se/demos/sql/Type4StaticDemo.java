package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Type4StaticDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17", "root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM CONTACT");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString("name")+"\t"+rs.getString("email")+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}
		
		rs.close();
		stmt.close();
		con.close();
	}

}
