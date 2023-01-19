package demoact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writedatatopropertiesfile {

	public static void main(String[] args) throws IOException {
 FileInputStream fis=new FileInputStream("./src/main/resources/commondata.properties");
 Properties p=new Properties();
 p.load(fis);
 
 p.put("username","nitin" );
 
 FileOutputStream fos=new FileOutputStream("./src/main/resources/commondata.properties");
 p.store(fos,"username modified");
 
	}

}
