package demoact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Nitindataread {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./nitindata.properties");
 Properties p=new Properties();
 p.load(fis);
 
//String url=p.getProperty("url");
//System.out.println(url);
 p.put("username", "teli");
 FileOutputStream fos=new FileOutputStream("./nitindata.properties");
 p.store(fos, "username modifeid");
	}

}
