package pompractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleResult {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Googlesource login=new Googlesource(driver);
	   // driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("nitin");
		//driver.findElement(By.xpath("//span[text()='Nitin']")).click();
		login.searchTF()
	}

}
