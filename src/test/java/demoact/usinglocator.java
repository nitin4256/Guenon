package demoact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usinglocator {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//img[@alt=\"OnePlus 9 Astral Black, 5G Unlocked Android Smartphone U.S Version, 8GB RAM+128GB Storage,120Hz Fluid Display,...\"]"));
point location=toys.getlocatoon();

	}

}
