package genericLibraties;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains all reusable methods of WebDriver
 * 
 * @author DELL
 *
 */
public class WebDriverUtility2 {
	public WebDriver driver;

	/**
	 * This method is used to launch browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		return driver;

	}

	/**
	 * This method is used to maximize the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to navigate to the application
	 * 
	 * @param url
	 */
	public void navigateToApplication(String url) {
		driver.get(url);
	}

	/**
	 * This method is used to wait till web page is loaded
	 * 
	 * @param time
	 */
	public void waitTillPageLoad(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
		
	

	/**
	 * This method is used to wait until the visibility of web element
	 * 
	 * @param element
	 * @param time
	 * 
	 */
	public void explicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to mouse hover on an element
	 * 
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	/**
	 * This method is used to double click on element
	 * 
	 * @param element
	 */
	public void doubleClickOnElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	/**
	 * This method is used to right click on element
	 * 
	 * @param element
	 */
	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	/**
	 * This method is used to drag and drop an element
	 * 
	 * @param src
	 * @param dest
	 */
	public void dragAnddrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	/**
	 * This method is used to select an element based on value
	 * 
	 * @param value
	 * @param element
	 */
	public void dropdown(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * This method is used to select an element based on text
	 * 
	 * @param element
	 * @param text
	 */
	public void dropdown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * This method is used to select an element based on index
	 * 
	 * @param index
	 * @param element
	 */
	public void dropdown(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);
		;
	}

	public String getParentWindowID() {
		return driver.getWindowHandle();

	}

	/**
	 * This method is used to handle child browser popup
	 */
	public void childBrowserPopoup() {
		Set<String> set = driver.getWindowHandles();
		for (String window : set) {
			driver.switchTo().window(window);
		}
	}

	/**
	 * This method is used to switch the frame based on index
	 * 
	 * @param index
	 */
	public void switchToFrame(String index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch the frame based on element
	 * 
	 * @param element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method is used to handle alert pop up by clicking 'Ok'
	 */
	public void alertOK() {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to handle alert pop up by clicking 'cancel'
	 */
	public void alertCancel() {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method is used to disable browser notifications
	 * 
	 * @return
	 */
	public ChromeOptions disableNotification() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		return options;
	}

	/**
	 * This method is used to fetch the screenshot of the webpage in file
	 * 
	 * @param javaUtil
	 * @param classname
	 * @return
	 */
	public String getScreenshot(JavaUtility javaUtil, String classname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String currentTime = javaUtil.getCurrentTime();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + classname, javaUtil + "_" + currentTime + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}

	/**
	 * This method is used to fetch the screenshot based on Base64 format
	 * 
	 * @return
	 */
	public String getScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}

	/**
	 * This method is used to scroll the page till the web element
	 * 
	 * @param element
	 */
	public void scrollTillElement(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	/**
	 * This method is used to close current window
	 */
	public void closeCurrentWindow() {
		driver.close();
	}

	/**
	 * This method is used to close all the windows and exit browser
	 */
	public void closeWindows() {
		driver.quit();
	}
}

 


