package pompractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instaresult {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://z-p15.www.instagram.com/accounts/login/?next=/ovesgarage/tagged/&source=profile_tagged_tab");
		
		Instapagesource is=new Instapagesource(driver);
		is.getUsernameTf().sendKeys("xyz");
		is.getPasswordTF().sendKeys("12345");
		is.getLoginbutton().click();
		

	}

}
