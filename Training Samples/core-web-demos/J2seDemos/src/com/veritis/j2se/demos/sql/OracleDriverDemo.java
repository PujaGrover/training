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


public class OracleDriverDemo{
public static void main(String args[]){
try{
Connection con=null;
Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("Driver Loaded........");
//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
System.out.println("Connecting to Oracle...");
con=DriverManager.getConnection("jdbc:oracle:thin:@plaisatst02:1521:asapsisa","sarmtst","next_sarm");
System.out.println("SuccessFully connected");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select host,device from tbl_comm_param where host like 'N%J'");
while(rs.next()){
        System.out.print("Host= "+rs.getString(1)+"\t");
        System.out.println("Device= "+rs.getString(2));
}

}catch(Exception e){
        System.out.println("Exception is..."+e);
        }
}
}
