package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import orangeHRM.GenericUtilities.WebDriverUtility;

public class Practice9 {

	public static void main(String[] args) {
		WebDriverUtility wb = new WebDriverUtility();
		FirefoxDriver driver = new FirefoxDriver();
		wb.maximizeWindow(driver);
		driver.get("https://www.google.com/");
		
		WebElement box = driver.findElement(By.xpath("//div[@id='SIvCob']/a[text()='हिन्दी']"));
		wb.waitForElementToBeClickable(driver, box);
		System.out.println("hi");
		
		
		}
	
}
