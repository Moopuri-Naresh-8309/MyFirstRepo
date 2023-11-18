package dDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file=new File("./testdata/exceldata.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		
		//		Sheet sheet = workbook.getSheet("sheet1");
		//		Row row = sheet.getRow(0);
		//		Cell cell = row.getCell(0);
		//		String data = cell.toString();
		//System.out.println(data);
		
		System.out.println(workbook.getSheet("sheet1").getRow(0).getCell(0).toString());
	}

}
