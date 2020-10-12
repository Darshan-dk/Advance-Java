package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TvChannels {
	public static void main(String[] args) throws ClassNotFoundException {
		addChannels();

	}

	public static void addChannels() throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=d441126k");
			Statement createStatement = connection.createStatement();
//			createStatement.execute("insert into jdbc_examples.Tv_channel value('discovery',2,'abc')");
//			createStatement.execute("insert into jdbc_examples.Tv_channel value('starSports',1,'abcd')");
			createStatement.execute("update jdbc_examples.tv_channel set TRP_rating=5 where Channel_Name='discovory'"); 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
