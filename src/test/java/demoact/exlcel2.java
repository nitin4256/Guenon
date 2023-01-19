package demoact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exlcel2 {

	public static void main(String[] args) throws IOException {


		//step:1 convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/testdatascript.xlsx");
		
		//step2: open the excel workbook
		//import workbook from org.apache.poi.ss.usermodel
		//the below statment throws encrypteddocumentexception and IEOexecaton 
		
		Workbook wb=WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue());
		
		
		
		//step7: close workbook
		wb.close();
	
	}

}
