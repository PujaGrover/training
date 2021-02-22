/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author vsaranu
 */
public class ResultSetDemo {
    public static void main(String[] args)throws Exception {
       
        Properties props=new Properties();
        props.load(new FileInputStream("db.properties"));
        Class.forName(props.getProperty("driver"));
        Connection con=DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");
        while(rs.next()){
            System.out.println(rs.getString("empno")+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
        }


    }
}
