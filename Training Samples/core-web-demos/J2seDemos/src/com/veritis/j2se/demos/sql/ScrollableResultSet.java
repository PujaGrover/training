/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author vsaranu
 */
public class ScrollableResultSet {
    public static void main(String argsp[]){
    Connection con;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17","root","root");
    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    //Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from emp");
    rs.absolute(3);

    System.out.println(rs.getString("empno")+"    "+rs.getString("ename")+"     "+rs.getString("sal")+"   "+rs.getString("job"));
    System.out.println("------------------------------------------------------------");
    rs.afterLast();

    while(rs.previous())
    {
        System.out.println(rs.getString(1)+"    "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getString(4));

    }
    rs.absolute(2);
    rs.updateDouble(4, 7500);
    rs.updateRow();
    }catch(Exception e){
        System.out.println(e);
    }
}

}
