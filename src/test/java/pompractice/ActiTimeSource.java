package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeSource {
	
	public ActiTimeSource(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "username")
	private WebElement usernameTF;
	
	
	@FindBy(name = "pwd")
	private WebElement passwordTF;
	
	@FindBy(id = "loginButton")
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
