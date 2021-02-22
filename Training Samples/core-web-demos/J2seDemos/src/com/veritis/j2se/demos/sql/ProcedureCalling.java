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
public class ProcedureCalling {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17","root","root");
        CallableStatement cs=con.prepareCall("{call findCube(?,?,?)}");
        cs.registerOutParameter(2,java.sql.Types.INTEGER);
        cs.registerOutParameter(3, java.sql.Types.INTEGER);
        int k=5;
        cs.setInt(1, k);
        cs.execute();
            System.out.println(k+" power 3 is "+cs.getInt(2)+"  "+k+" power 4 is "+cs.getInt(3));
    }
    catch(Exception e){
        System.out.println(e);
    }
    }

}
