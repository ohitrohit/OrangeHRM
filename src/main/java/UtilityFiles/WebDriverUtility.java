package UtilityFiles;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class consist of all the webdriver methods
 * @author rohit
 *
 */
public class WebDriverUtility {

	/**
	 * this methods use for maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * this method is used for minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * this methods is used for wait for 20 sec
	 * @param driver
	 */
	public void waitForPage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * this method is used for wait for the element upto clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method is used for wait upto element visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver , WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is used for handle dropdown with value
	 * @param element
	 * @param Value
	 */
	public void handleDropDown(WebElement element , String Value) {
		Select s = new Select(element);
		s.selectByValue(Value);
	}
	/**
	 * this method is used for handle dropdown with visibletext
	 * @param text
	 * @param element
	 */
    public void  handleDropDown(String text , WebElement element) {
    	Select s = new Select(element);
    	s.selectByVisibleText(text);
    }
    /**
     * this method is used for mouseover 
     * @param driver
     * @param element
     */
    public void mouseHoverAction(WebDriver driver ,WebElement element ) {
    	Actions a = new Actions(driver);
    	a.moveToElement(element);
    }
    /**
     * this method is used for right click
     * @param driver
     * @param element
     */
    public void rightClickActions(WebDriver driver , WebElement element) {
    	Actions a = new Actions(driver);
    	a.contextClick(element);
    }
    /**
     * this method is used for double click action
     * @param driver
     * @param element
     */
    public void doubleClickAction(WebDriver driver , WebElement element) {
    	Actions a = new Actions(driver);
    	a.doubleClick(element);
    }
    /**
     * this method is used for draganddrop action
     * @param driver
     * @param src
     * @param trg
     */
    public void dragAndDropAction(WebDriver driver , WebElement src , WebElement trg ) {
    	Actions a = new Actions(driver);
    	a.dragAndDrop(src, trg);
    }
    /**
     * this method is used to scrolldown Action
     * @param driver
     * @param element
     */
    public void scrollDownAction(WebDriver driver , WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeAsyncScript("arguments[0].scrollIntoView(true)", element);
    }
    /**
     * this method is used for taking screen shot
     * @param driver
     * @param name
     * @throws IOException
     */
	public void takeScreenshot(WebDriver driver , String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\ScreenShot\\"+name+".png");
		FileUtils.copyFile(src, trg);
		
	}
	/**
	 * this method is used for handle frame
	 * @param driver
	 * @param element
	 */
	public void handleframe(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * this method is used for switch to default frame
	 * @param driver
	 */
	public void switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * this method is used for accept the alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is used for dismiss the alert
	 */
	public void dismissTheAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * thois method is used for get text on alert
	 * @param driver
	 */
	public void getTextOfAlert(WebDriver driver) {
		driver.switchTo().alert().getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
