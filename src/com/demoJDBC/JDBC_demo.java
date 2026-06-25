package com.demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Swapna@2004");
			System.out.println("connection established");
			Statement st = con.createStatement();
			System.out.println("platform created");
			
			String sql1 = "insert into student values(0,'sathvik','sathvik@2004','sathvik123')";
			int i = st.executeUpdate(sql1);
			System.out.println(i + "rows inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
