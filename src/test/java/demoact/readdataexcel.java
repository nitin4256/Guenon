package demoact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdataexcel {

	public static void main(String[] args) throws IOException {
 
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheet1");
		     Row r=s.getRow(0);
		    Cell c= r.getCell(1);
		   System.out.println(c.getStringCellValue());
		   wb.close();
	}

}
