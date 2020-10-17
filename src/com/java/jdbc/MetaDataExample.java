package com.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataExample {
	
		public static void main(String[] args) {
			Connection con = null;
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","d441126k");
				DatabaseMetaData metaData = con.getMetaData();
				System.out.println(metaData.getDatabaseMajorVersion());
				System.out.println(metaData.getDatabaseProductName());
				ResultSet tables = metaData.getTables(null, null, null, null);
				while(tables.next()) {
					System.out.println(tables.getNString(1));
					
				}
				ResultSet columns = metaData.getColumns(null, null, "festival", null);
				while(columns.next()) {
					
					System.out.println(columns.getNString(4));
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
