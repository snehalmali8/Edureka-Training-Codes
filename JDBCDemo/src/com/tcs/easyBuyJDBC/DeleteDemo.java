package com.tcs.easyBuyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Root123$");
			if(con != null) {
				System.out.println("Connected");
				System.out.println("Enter the id you want to delete");
				Scanner sc = new Scanner(System.in);
				int id = sc.nextInt();
				PreparedStatement ps = con.prepareStatement("delete from studentInfo where id=?");
				ps.setInt(1, id);
				int i = ps.executeUpdate();
				if(i!=0) {
					System.out.println("deleted student of id "+ id);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
