package com.demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Requirement {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Swapna@2004");
			String query = "select * from student where s_email = ? and s_password = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("enter email");
			String email = sc.next();
			System.out.println("enter password");
			String password = sc.next();
			
			ps.setString(1,email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()==true) {
				System.out.println("login succesfull" );
			}
			else {
				System.out.println("login failed");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
