package testng;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class demotestng {
	@Test
	public static void main(XmlTest xml2) {
		System.out.println("in demotest");
		System.out.println(xml2.getParameter("url"));
		System.out.println(xml2.getParameter("username"));
		System.out.println(xml2.getParameter("password"));

	}

}
