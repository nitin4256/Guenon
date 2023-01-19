package hardcodedTestScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Contacts {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:8888/");
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
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
 
driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Biradar4");
driver.findElement(By.xpath("//input[@value='U']")).click();
driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
System.out.println("contact created");
driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
List <WebElement> contacts=driver.findElements(By.xpath("//table[@class='lvtsmall']/descendant::a[@title='Contacts']"));
System.out.println("the existing contacts are");
for(int i=0;i<contacts.size();i++) {
System.out.println(contacts.get(i).getText());
}
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
System.out.println("logged out successfully");
}
}
