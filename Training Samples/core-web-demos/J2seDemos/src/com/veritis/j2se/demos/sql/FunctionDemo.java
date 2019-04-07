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
 * @author vsaranu
 */
public class FunctionDemo {
public static void main(String args[])throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17","root","root");
    CallableStatement cs=con.prepareCall("{?=call findPower5(?)}");
    int k = 5;
    cs.setInt(2, k);
    cs.registerOutParameter(1,java.sql.Types.INTEGER);
    cs.execute();
    System.out.println(k+" Power5 Output is "+cs.getInt(1));

}
}
