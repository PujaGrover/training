package com.veritis.j2se.demos.sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertyJdbcDemo {

	public static void main(String[] args) throws  Exception {
		Properties props=new Properties();
		props.load(new FileInputStream("db.properties"));
		
		Class.forName(props.getProperty("driver"));
		Connection con=DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
		System.out.println("connected to db");
	}

}
