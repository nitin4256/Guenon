package demoact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demoread {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties p= new Properties();
		p.load(fis);
		String url2=p.getProperty("url2");
		System.out.println(url2);
		//p.put("username", "teli");
		//FileOutputStream fos =new FileOutputStream("./src/test/resources/commondata.properties");
		//p.store(fos, "username modified");

	}

}
