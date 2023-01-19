package demoact;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdatafromproperties {

	public static void main(String[] args) throws IOException {
        
		//step1:convert physical file into java readable object
		 
		FileInputStream file=new FileInputStream("./src/test/resources/commondata.properties");
		
		//step2: create an instance for properties class
		//properties class is available in java.util package
		Properties p= new Properties();
		
		//step3: Load all the key-valuve pair to properties object
		p.load(file);//IOException
		//java concept involved-Map interface-Hashtable
		
		//step4: Read data
		String url =p.getProperty("username");
		long time = Long.parseLong(p.getProperty("timeouts"));
		
		System.out.println(url+"\t"+time);
		
	}

}

