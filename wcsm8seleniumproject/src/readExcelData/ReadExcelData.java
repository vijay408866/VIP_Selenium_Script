package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	// Read data from IPL Excel Sheet..

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx"); // provide the path of excel file
		Workbook wb=WorkbookFactory.create(fis); // make the file ready for read.
		Sheet sheet=wb.getSheet("IPL"); // get into the sheet
		int totalRow = sheet.getLastRowNum()+1;
		short totalCell = sheet.getRow(1).getLastCellNum();
		
		for (int i = 0; i < totalRow; i++) {
			for (int j = 0; j < totalCell; j++) {
				Cell cell = sheet.getRow(i).getCell(j); // get into desired row
				String data = cell.getStringCellValue(); // read the value from cell
				System.out.print(data+" ");	
			}
			System.out.println();
		}
		
	}

}

