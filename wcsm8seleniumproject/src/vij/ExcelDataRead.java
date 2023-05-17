package vij;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelDataRead {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("validcreds");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		System.out.println(cell.getStringCellValue());
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		System.out.println(cell.getRichStringCellValue());
	}
	
}
