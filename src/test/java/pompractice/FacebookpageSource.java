package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookpageSource {
	
	public FacebookpageSource(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "u_0_b_VM")
	private WebElement firstnameTF;
	
	@FindBy(id = "u_0_d_7Z")
	private WebElement lastnameTF;
	
	@FindBy(id = "u_0_g_ym")
	private WebElement emailTF;

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

}
