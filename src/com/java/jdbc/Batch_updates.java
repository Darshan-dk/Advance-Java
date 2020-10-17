package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_updates {
	Connection connection = null;
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ ","root","d441126k");
			Statement createStatement = connection.createStatement();
			createStatement.addBatch("insert into jdbc_examples.festival values(5,'depavali',3,'november')");
			createStatement.addBatch("insert into jdbc_examples.festival values(2,'depavali',3,'november')");
			createStatement.addBatch("insert into jdbc_examples.festival values(3,'depavali',3,'november')");
			createStatement.addBatch("insert into jdbc_examples.festival values(4,'depavali',3,'november')");

			createStatement.executeBatch();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
