package com.demoJDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class PStatement_april25 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Swapna@2004");
			String query = "insert into student values(0,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println("enter username");
			String name =  sc.next();
			System.out.println("enter email");
			String email = sc.next();
			System.out.println("enter password");
			String password = sc.next();
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			
			i=ps.executeUpdate();
			
			if(1>0) {
				System.out.println("login succesfully");
			}
			else {
				System.out.println("failed login");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
