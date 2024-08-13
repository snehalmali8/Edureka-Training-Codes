//package com.tcs.easyBuyJDBC;
//import java.util.*;
//import java.sql.*;
//public class TestDB {
//	private static final String URL = "jdbc:mysql://localhost:3306/student";
//	public static Connection getConnection() throws SQLException{
//		return DriverManager.getConnection(URL, "root", "Root123$");
//	}
//	public static void main(String[] args) throws SQLException {
//			
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			try(Connection connection = getConnection()){
//				if(connection != null) {
//					System.out.println("Connected to the database");
//					Scanner sc = new Scanner(System.in);
//					PreparedStatement ps =  connection.prepareStatement("insert into studentInfo values(?,?,?,?)");
//					System.out.println("how many students you want to add");
//					int n = sc.nextInt();
//					for(int i=0;i<n;i++){
//						System.out.println("Enter student id");
//						int id = sc.nextInt();sc.nextLine();
//						System.out.println("Eneter student name");
//						String name = sc.nextLine();
//						System.out.println("Enter student fees");
//						int fees = sc.nextInt();sc.nextLine();
//						System.out.println("Enter student subject");
//						String subject = sc.nextLine();
//						
//						ps.setInt(1, id);
//						ps.setString(2, name);
//						ps.setInt(3, fees);
//						ps.setString(4, subject);
//						int j = ps.executeUpdate();
//						System.out.println(j+ " rows affected");
//						
//						
//					}
//					
//					
//					Statement st = connection.createStatement();
//					
//					ResultSet rs = st.executeQuery("select * from studentInfo");
//					while(rs.next()) {
//						System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" "+ rs.getInt(3) + " "+rs.getString(4));
//					}
//				}
//			}
//			
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//
//	}
//}
