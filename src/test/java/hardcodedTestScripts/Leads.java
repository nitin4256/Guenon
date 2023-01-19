package hardcodedTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Leads {
	
public static void main(String[] args) {
	
WebDriver driver = new ChromeDriver();

driver.get("http://localhost:8888/");
driver.manage().window().maximize();
String expected_title="vtiger CRM 5 - Commercial Open Source CRM";
 String actual_title=driver.getTitle();
Assert.assertEquals(actual_title, expected_title);
System.out.println("URL passed");
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("Ragnor");
driver.findElement(By.id("submitButton")).click();
String expected_home="Administrator - Home - vtiger CRM 5 - Commercial OpenSource CRM";
String actual_home=driver.getTitle();
Assert.assertEquals(expected_home,actual_home);
System.out.println("in home page");
driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
driver.findElement(By.xpath("//img[@alt=\"Create Lead...\"]")).click();
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Guttedar");
driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("IQL");
driver.findElement(By.xpath("//input[@value=\"U\"]")).click();
driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();
 driver.findElement(By.xpath("(//input[@title=\"Duplicate [Alt+U]\"])[1]")).click();

 Actions action=new Actions(driver);
 WebElement dc=driver.findElement(By.xpath("//input[@value=\"Guttedar\"]"));
 
 action.doubleClick(dc).sendKeys("Biradar").perform();
 driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
System.out.println("saved a new contact with existing org");
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
driver.quit();
}
}

