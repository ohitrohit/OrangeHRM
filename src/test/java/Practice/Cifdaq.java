package Practice;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cifdaq {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://34.238.44.247/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("amount")).sendKeys("10000");
		
		
		WebElement connectwallet = driver.findElement(By.id("connectWallet"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		connectwallet.click();
		WebElement tgelement = driver.findElement(By.xpath("//div[@class=\"cifdaq_icon connectCIFD\"]/div/p[text()=\" CIFDAQ Wallet\"]"));
		tgelement.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_LEFT);
        r.keyRelease(KeyEvent.VK_LEFT);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);
    
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.keyRelease(KeyEvent.VK_2);
        r.keyPress(KeyEvent.VK_NUMPAD1); 
        r.keyRelease(KeyEvent.VK_NUMPAD1);
        r.keyPress(KeyEvent.VK_NUMPAD2);
        r.keyRelease(KeyEvent.VK_NUMPAD2);
        r.keyPress(KeyEvent.VK_NUMPAD3);
        r.keyRelease(KeyEvent.VK_NUMPAD3);
        
        r.keyPress(KeyEvent.VK_ENTER);
        



	}

	
	
	
}
