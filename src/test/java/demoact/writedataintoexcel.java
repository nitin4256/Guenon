package demoact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writedataintoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./src/test/resources/testdatascript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		Row r=sh.getRow(3);
		//creats new cell by delating older data in the cell
		Cell c= r.createCell(1);
		
		//write data into cell
		c.setCellValue("hi");
		
		//save data into excel
		FileOutputStream fos=new FileOutputStream("./src/test/resources/testdatascript.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
