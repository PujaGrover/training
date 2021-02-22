/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author vsaranu
 */
public class JdbcOdbcDemo {
public static void main(String args[]) throws SQLException,ClassNotFoundException
{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        System.out.println("Driver Loaded.......");
           Connection con=DriverManager.getConnection("jdbc:odbc:veritisds");
           System.out.println("Got the Connection");
           Statement stam=con.createStatement();
           ResultSet rs= stam.executeQuery("select * from emp");
	if(rs!=null){
        while(rs.next())
	{
	System.out.print(rs.getString(1)+"  ");
	System.out.print(rs.getString(2)+"  ");
	System.out.println(rs.getString(3)+"  ");
       // System.out.println(rs.getString(4));

       }
        }
           rs.close();
           con.close();
}
}
