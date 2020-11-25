package com.dee.ExcelToDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseToExcel {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=d441126k");

		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from jdbc_examples.games");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet createSheet = workbook.createSheet("games db");

		XSSFRow row = createSheet.createRow(1);
		XSSFCell cell;
		cell = row.createCell(1);
		cell.setCellValue("Name");
		cell = row.createCell(2);
		cell.setCellValue("Type");
		cell = row.createCell(3);
		cell.setCellValue("Player");

		int i = 2;

		while (resultSet.next()) {
			row = createSheet.createRow(i);
			cell = row.createCell(1);
			cell.setCellValue(resultSet.getString("name"));
			cell = row.createCell(2);
			cell.setCellValue(resultSet.getString("type"));
			cell = row.createCell(3);
			cell.setCellValue(resultSet.getInt("player"));
			i++;
		}

		FileOutputStream out = new FileOutputStream(new File("F:\\Deeru\\Games.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("exceldatabase.xlsx written successfully");
	}
}
