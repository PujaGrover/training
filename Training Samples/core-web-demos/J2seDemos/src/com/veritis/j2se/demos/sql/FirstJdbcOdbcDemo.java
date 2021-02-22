/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author vsaranu
 */
public class FirstJdbcOdbcDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Driver loaded.......");
        Connection con=DriverManager.getConnection("jdbc:odbc:veritisds");
        System.out.println("Established conncetion.....");
        Statement stmt=con.createStatement();
        System.out.println("Statement Created");
        ResultSet rs=stmt.executeQuery("select * from emp");
        while(rs.next())
        {
            System.out.println(rs.getInt("empno")+" - "+rs.getString("ename")+" - "+rs.getString(3)+" - "+rs.getString(4));
        }

        //rs.close();
//        stmt.execute("create table sample(f1 INTEGER,f2 VARCHAR(20))");
        con.close();
    }

}
