package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchUpdateByPreparedStatement {
	
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","d441126k");
		 PreparedStatement preparedStatement = connection.prepareStatement("insert into jdbc_examples.festival values(?,? ,?,?)");
		    Statement createStatement = connection.createStatement();
		    
		    createStatement.addBatch("update jdbc_examples.festival set festival_name='ganesh chaturthi' where id_festival=1"); 
		    createStatement.addBatch("delete from jdbc_examples.festival where id_festival=5"); 
		    PreparedStatement prepareStatement2 = connection.prepareStatement("update jdbc_examples.festival set festival_name=? where id_festival=?");
		    
		    System.out.println("enter the fesstival name which you want to update");
		    Scanner sc = new Scanner(System.in);
		    String fname=sc.nextLine();
		    System.out.println("enter the fesstival id which you want to update");
		    int id =sc.nextInt();
		    
		    prepareStatement2.setInt(2, id);
		    prepareStatement2.setString(1, fname);
		    
		    
//		 	preparedStatement.setInt(1, 37);
//		    preparedStatement.setString(2, "abc");
//		    preparedStatement.setInt(3, 2);
//		    preparedStatement.setString  (4, "qwe");

//		    preparedStatement.addBatch();
//		    
//		    preparedStatement.setInt(1, 38);
//		    preparedStatement.setString(2, "dfg");
//		    preparedStatement.setInt(3, 7);
//		    preparedStatement.setString  (4, "ret");
//
//		    preparedStatement.addBatch();
		    
		    prepareStatement2.execute();
		    
//		    preparedStatement.executeBatch();
		    createStatement.executeBatch();
		    connection.close();
		    System.out.println("connection closed");
		    System.out.println("program terminated");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
