package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IPL {
	
	public static void main(String[] args) {
		try {
			addTeam();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void addTeam() throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306?user=root&password=d441126k";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection(url)){
		try(Statement createStatement = connection.createStatement()){
			createStatement.execute("insert into jdbc_examples.IPL_Teams values('CSK' ,2,'MSD')" );
//			createStatement.execute("insert into jdbc_examples.IPL_Teams values('KKR' ,3,'DK')" );
//			createStatement.execute("delete from jdbc_examples.IPL_Teams where Team_name ='csk'; " );
			createStatement.execute("update jdbc_examples.IPL_Teams set Captian ='kl' where Team_name ='csk';");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
