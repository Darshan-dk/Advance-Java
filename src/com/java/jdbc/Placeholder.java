package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Placeholder {
	public static void main(String[] args) {
		try {
			insertMovie();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void insertMovie() throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306?user=root&password=d441126k";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scan.nextInt();
		
		System.out.println("enter movie name");
		String mNme = scan.next();		
		System.out.println("enter acter name");
		String actNme = scan.next();
		
		System.out.println("enter the budget");
		double budget =scan.nextDouble();
		
		try (Connection connection = DriverManager.getConnection(url)) {
			try (PreparedStatement  preparedStatement = connection.prepareStatement("insert into jdbc_examples.movie_table values(?,? ,?,?)")) {
				// set the values for placeholders before executing the query
				preparedStatement.setInt(1,id);
				preparedStatement.setString(2,mNme);
				preparedStatement.setString(3,actNme);
				preparedStatement.setDouble(4,budget);
				preparedStatement.execute();
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
