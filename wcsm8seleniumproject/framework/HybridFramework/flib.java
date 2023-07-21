package HybridFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {
public String readDataExcel(String excelPath,String sheetName,int rowCount,int cellcount) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(excelPath);
 	  Workbook wb = WorkbookFactory.create(fis);
 	   Sheet sheet = wb.getSheet(sheetName);
 	   Row row = sheet.getRow(rowCount);
 	   Cell cell = row.getCell(cellcount);
 	   String data = cell.getStringCellValue();
 	   return data;
}
public void writeDataExcel(String excelPath,String sheetName,int rowCount,int cellcount,String data) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(excelPath);
 	  Workbook wb = WorkbookFactory.create(fis);
 	   Sheet sheet = wb.getSheet(sheetName);
 	   Row row = sheet.getRow(rowCount);
 	   Cell cell = row.getCell(cellcount);
 	   cell.getStringCellValue();
 	   
 	   FileOutputStream fos = new FileOutputStream(excelPath);
 	   wb.write(fos);
}
public String readataProprtys(String propPath,String key) throws IOException {
	FileInputStream fis = new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
}
public int lastrowcount(String excealPath,String sheetName) throws IOException{
	FileInputStream fis = new FileInputStream(excealPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	int rc = sheet.getLastRowNum();
	return rc;
}
public Short lastCellCount(String excelPath,String sheetName,int rowCount) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowCount);
	short cc = row.getLastCellNum();
	return cc;
}
}
