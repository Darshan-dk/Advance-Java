package com.dee.ExcelToDatabase;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args) {
		try {
			Workbook wb = WorkbookFactory.create(new File("F:/Deeru/book.xlsx"));
			Sheet sheet = wb.getSheetAt(0);
			
			for (int i = sheet.getFirstRowNum(); i<sheet.getLastRowNum();i++) {
				Row row = sheet.getRow(i);

				for (int j = row.getFirstCellNum(); j<row.getLastCellNum();i++) {
					Cell cell = row.getCell(i);
					System.out.println(cell.getStringCellValue());
				}
			}
			
			
			
			
			
			
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
