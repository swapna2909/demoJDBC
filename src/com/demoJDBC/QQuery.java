package com.demoJDBC;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QQuery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Swapna@2004");
			Statement st = con.createStatement();
			System.out.println("enter your name: ");
			String name = sc.nextLine();
			String query = "select * from student where s_name = " + name;
			ResultSet rs = st.executeQuery(query);
			while(rs.next() == true) {
				int s_id = rs.getInt("s_id");
				String s_name = rs.getString("s_name");
				String s_email = rs.getString("s_email");
				System.out.println(s_id+" "+s_name+" "+s_email);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		

	}

}
