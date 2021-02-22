/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author vsaranu
 */
public class FirstMySqlType4InsertDemo {
public static void main(String args[]) throws SQLException,ClassNotFoundException
{
     Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Driver Loaded.......");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se","root","123456");
           System.out.println("Got the Connection");
           Statement stam=con.createStatement();
           con.setAutoCommit(false);
        int n= stam.executeUpdate("insert into example values(121,'info','java develope',7000)");
           //con.setAutoCommit(false);

        //  int n= stam.executeUpdate("update emp set desig='Hardware' where empid=1203");
          con.commit();
           System.out.println(n+" Rows inserted");

           con.close();
}
}
