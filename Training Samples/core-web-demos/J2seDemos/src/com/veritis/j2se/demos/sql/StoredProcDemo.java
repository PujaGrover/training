/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author satya
 */
public class StoredProcDemo {
public static void main(String args[]) throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1238/veritis","root","123456");
    CallableStatement cs=con.prepareCall("{call findCube(?,?,?)}");
    cs.registerOutParameter(2,java.sql.Types.INTEGER);
    cs.registerOutParameter(3, java.sql.Types.INTEGER);
    cs.setInt(1,5);
    cs.execute();
    System.out.println(cs.getInt(2));
    System.out.println(cs.getInt(3));
}
}
