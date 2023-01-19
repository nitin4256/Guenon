package demoact;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoactlogin {

	public static void main(String[] args) throws IOException, InterruptedException {
    
		FileInputStream fis=new FileInputStream("./src/main/resources/commondata.properties");
		Properties p= new Properties();
		p.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url2"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(p.getProperty("timesout"))));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys(p.getProperty("user1"));
		
	}

}
