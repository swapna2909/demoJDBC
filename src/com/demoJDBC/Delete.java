package com.demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Swapna@2004");
			System.out.println("connectionn established");
			Statement st = con.createStatement();
			System.out.println("created");
			
			String sql1 = "update student set s_email='manoj@gmail.com' where s_id=1";
			int i = st.executeUpdate(sql1);
			System.out.println(i + " row updated");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
