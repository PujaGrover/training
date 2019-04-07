package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProcedureCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17","root","root");
	//	String sql = "CREATE PROCEDURE findCube(IN p INT,OUT res INT,INOUT res1 INT) begin set res = p*p*p; set res1 = res*p; end";
		String sql="CREATE FUNCTION findPower5(p INT) RETURNS INT"
				+" BEGIN "
				+"DECLARE res INT; "
				+" set res = p*p*p*p*p; "
				+" RETURN res; "
				+" END ";
		Statement stmt=con.createStatement();
		stmt.execute(sql);
		System.out.println("Procedure/Function Created Successfully");
	}

}
