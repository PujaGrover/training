/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author vsaranu
 */
public class ResultSetMetaDataDemo {
    public static void main(String argsp[]){
    Connection con;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se2k17","root","root");
    //Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from emp");
    ResultSetMetaData rsmd=rs.getMetaData();
    
    int n=rsmd.getColumnCount();
        for (int i = 1; i <=n; i++) {
            System.out.println("Column "+i+" is "+rsmd.getColumnName(i)+" and type is "+rsmd.getColumnTypeName(i)+" and size is "+rsmd.getColumnDisplaySize(i));
        }
        for(int i=1;i<=n;i++)
            System.out.print(rsmd.getColumnName(i)+"\t\t|");
        System.out.println("\n--------------------------------------------------------------\n");
    while(rs.next()){
            for(int i=1;i<=n;i++)
            System.out.print(rs.getString(i)+"\t\t|");
            System.out.println("\n--------------------------------------------------------------");
    }
    }catch(Exception e){
        System.out.println(e);
    }
}

}
