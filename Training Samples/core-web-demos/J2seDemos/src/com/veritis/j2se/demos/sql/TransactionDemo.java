package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17", "root", "root");
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		int k=stmt.executeUpdate("insert into emp values(1202,'krishna','java dev',5423)");
		con.commit();
		System.out.println(k+" row(s) inserted....");
	}

}
