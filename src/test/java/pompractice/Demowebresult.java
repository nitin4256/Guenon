package pompractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebresult {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		
		DemowebpageSource ds=new DemowebpageSource(driver);
		ds.getUsernameTF().sendKeys("nitin");
		ds.getPasswordTF().sendKeys("12345");
		ds.getLoginbutton().click();
	}

}
