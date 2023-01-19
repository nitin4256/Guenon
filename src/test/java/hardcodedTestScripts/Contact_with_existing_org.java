package hardcodedTestScripts;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Contact_with_existing_org {
	
public static void main(String[] args) throws InterruptedException {
	
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
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Biradar10");
driver.findElement(By.xpath("//input[@value='U']")).click();
driver.findElement(By.xpath("(//img[@src=\"themes/softed/images/select.gif\"])[1]")).click(
);
Thread.sleep(2000);
String parentid=driver.getWindowHandle();
Set<String> allid=driver.getWindowHandles();

allid.remove(parentid);
for(String id:allid)
 {
driver.switchTo().window(id);
}
driver.findElement(By.xpath("//a[text()='Qspiders']")).click();
Thread.sleep(2000);
driver.switchTo().window(parentid);
driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
Thread.sleep(2000);
System.out.println("saved a new contact with existing org");
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
System.out.println("logged out successfully");
driver.quit(); }
}


