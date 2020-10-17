package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransaction {
	

	public static void main(String[] args)  {
		Connection connection= null;
		try {
			  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","d441126k");
			  connection.setAutoCommit(false);//jdbc transaction
			  Statement createStatement = connection.createStatement();
			  createStatement.addBatch("insert into jdbc_examples.festival values(21,'cristmas',1,'dec')");
			  createStatement.executeBatch();
			  
			  connection.commit();  //this code must be in last line of the try block.//jdbc transaction
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();//jdbc transaction
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
