package pompractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeResult {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		ActiTimeSource as=new ActiTimeSource(driver);
		
		as.getUsernameTF().sendKeys("abc");
		as.getPasswordTF().sendKeys("123");
		as.getLoginbutton().click();
		
		
		
	}
	
	

}
