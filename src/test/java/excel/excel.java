package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws IOException {

		//step:1 convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/testdatascript.xlsx");
		
		//step2: open the excel workbook
		//import workbook from org.apache.poi.ss.usermodel
		//the below statment throws encrypteddocumentexception and IEOexecaton 
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3: get control over particular sheet
		Sheet s= wb.getSheet("Sheet1");
		//step4: get control over specific row
		Row r= s.getRow(0);
		//step5: get control over cell
		Cell c=r.getCell(1);
		//step6: Fetch data from cell
		System.out.println(c.getStringCellValue());
		//step7: close workbook
		wb.close();
	}

}
