package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Fetching_values {
	
	public static void main(String[] args) {
		try {
			insertMovies();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void insertMovies() throws ClassNotFoundException   {
		String url = "jdbc:mysql://localhost:3306?user=root&password=d441126k";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(url)){
			try(Statement createStatement = connection.createStatement()){
				ResultSet res = createStatement.executeQuery("select * from jdbc_examples.movie_table where movie_id='1'");
				while(res.next()) {
					   int id =    res.getInt(1);
					   String nme =    res.getString(2);
					   String actor =    res.getString(3);
					   String budget =    res.getString(4);
						       
						 System.out.println( id  + " " + nme + " "  + actor + " " + budget);

			}
			connection.close();
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
