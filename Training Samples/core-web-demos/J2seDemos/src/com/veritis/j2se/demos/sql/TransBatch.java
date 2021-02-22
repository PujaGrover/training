/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

/**
 *
 * @author vsaranu
 */
import java.sql.*;

public class TransBatch {

	public static void main(String a[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17", "root", "root");
			Statement st = con.createStatement();
			con.setAutoCommit(false);
			st.addBatch("update emp set sal=sal+500 where empno = 1201 ");
			System.out.println("Fitst stmt executed");
			st.addBatch("update emp set sal=sala+500 where empno = 1202 ");
			System.out.println("second stmt executes");
			st.addBatch("update emp set sal=sal+500 where empno = 1203 ");
			st.executeBatch();
			con.commit();
			System.out.println("Successfully Updated........");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}