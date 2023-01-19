package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemowebpageSource {
	
	public DemowebpageSource(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	 @FindBy(id = "Email")
	 private WebElement usernameTF;
	 
	 @FindBy(id = "Password")
	 private WebElement passwordTF;
	 
	 @FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
	 private WebElement loginbutton;

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	 
}
