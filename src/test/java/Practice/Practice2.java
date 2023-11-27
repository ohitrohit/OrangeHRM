package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoapp.skillrary.com/");
		
//		driver.findElement(By.id("APjFqb")).sendKeys("mask");
//		List<WebElement> element = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul"));
//	    for(WebElement e : element) {
//	    	System.out.println(e.getText());
//	    }
//	    WebElement course = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
//		a.moveToElement(sign).perform();
//		driver.findElement(By.xpath("//a[@class='nav-link nav-item']/span[text()='Your Account']")).click();
//		String ac = driver.getTitle();
//		System.out.println(ac);
//		WebElement st = driver.findElement(By.id("twotabsearchtextbox"));
//		a.contextClick(st).perform();
//		a.moveToElement(course).perform();
//		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='autometion']")).click();
//		WebElement id = driver.findElement(By.id("add"));
//		a.doubleClick(id).perform();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sry = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));
		WebElement trash = driver.findElement(By.id("trash"));
		a.dragAndDrop(sry, trash).perform();
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
