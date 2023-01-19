package hardcodedTestScripts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class organization_e2e {
	
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://localhost:8888/");
System.out.println("URL passed");
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
System.out.println("in home page");
driver.findElement(By.linkText("Organizations")).click();
System.out.println("organization passed");
driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
driver.findElement(By.className("detailedViewTextBox")).sendKeys("Jspiders9");
driver.findElement(By.xpath("//input[@onclick='toggleAssignType(this.value)'][2]")).click();
driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
List <WebElement> orgs=driver.findElements(By.xpath("//table[@class='lvtsmall']/descendant::a[@title='Organizations']"));
System.out.println("the names of existing orgs are");
for(int i=0;i<orgs.size();i++) {
System.out.println(orgs.get(i).getText());
}
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
 System.out.println("logged out successfully");
}
}

