package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlesource {
	
	public Googlesource(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name=\\\"q\\\"]\"")
	private WebElement searchTF;
	@FindBy(xpath="//span[text()='Nitin']\"")
	private WebElement secondlink;



	}


