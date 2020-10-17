package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
//				createStatement.execute("insert into jdbc_examples.movie_table values(5,'kgf3    ' ,'Yash',120000.00) ");
				
				
//-------fetching the data from database using the result set using col ID.
//				ResultSet res   =  createStatement.executeQuery("select * from jdbc_examples.movie_table");
//				while(res.next()) {
//				       String id =    res.getString(1);
//				       String nme =    res.getString(2);
//				       String actor =    res.getString(3);
//				       String budget =    res.getString(4);
//				       
//				       System.out.println( id  + " " + nme + " "  + actor + " " + budget);
//
//			}
				
				//fetching the specific row value using the sequel query
				
				ResultSet res   =  createStatement.executeQuery("select * from jdbc_examples.movie_table where movie_id='1'");
				while(res.next()) {
				       String id =    res.getString(1);
				       String nme =    res.getString(2);
				       String actor =    res.getString(3);
				       String budget =    res.getString(4);
				       
				       System.out.println( id  + " " + nme + " "  + actor + " " + budget);}
				   //     fetching the data using the col name
//				       
//				ResultSet res   =  createStatement.executeQuery("select * from jdbc_examples.movie_table where movie_id='1'");
//				while(res.next()) {
//					   int id =    res.getInt("Movie_id");
//					   String nme =    res.getString(2);
//					   String actor =    res.getString(3);
//					   String budget =    res.getString(4);
//						       
//						 System.out.println( id  + " " + nme + " "  + actor + " " + budget);
//
//			}
			connection.close();

		} 
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 

}
}
//note: u need import the mysql connector package from c-program86-mysql-connector.
