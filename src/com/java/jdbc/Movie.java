package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie {

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
		try (Connection connection = DriverManager.getConnection(url)) {
			try (Statement createStatement = connection.createStatement()) {
				createStatement.execute("insert into jdbc_examples.movie_table values(5,'kgf3    ' ,'Yash',120000.00) ");
			}
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//note: u need import the mysql connector package from c-program86-mysql-connector.
