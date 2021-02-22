/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.sql;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author vsaranu
 */
public class PrepareStatementDemo {
public static void main(String argsp[]){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2se","root","123456");
    con.setAutoCommit(false);

    PreparedStatement pstmt=con.prepareStatement("insert into example values(?,?,?,?)");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Empid");
    pstmt.setInt(1,Integer.parseInt(br.readLine()));
        System.out.println("Enter Emp name");
    pstmt.setString(2,br.readLine());
    //pstmt.setDouble(3,3000.00);
    System.out.println("Enter Desig");
    pstmt.setString(3, br.readLine());
        System.out.println("Enter Salary");
        pstmt.setDouble(4,Double.parseDouble(br.readLine()));
    int n=pstmt.executeUpdate();
   con.commit(); // Durablity
    System.out.println(n+" rows inserted");
    }catch(Exception e){
        
        try{
            con.rollback();
        con.close();
        }catch(Exception e1){

        }
        System.out.println(e);
    }
}
}
