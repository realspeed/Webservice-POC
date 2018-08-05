package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	static Connection con=null;
	public static Connection getConnection() {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			
			//Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_schema","root","root");
			
		} catch (Exception e) {
		}
		return con;
		
	}
	
	
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionManager.getConnection();
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM VERTRAG");
		System.out.println("VERTR# | POLLFNR | STADIUM | HSP_PRODUCT");
		while (rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4));
		}
	}
}