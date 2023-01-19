package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instapagesource {
	
	public WebElement getUsernameTf() {
		return usernameTf;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public Instapagesource(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement usernameTf;
	
	@FindBy(name = "password")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement loginbutton;
	
	

}
