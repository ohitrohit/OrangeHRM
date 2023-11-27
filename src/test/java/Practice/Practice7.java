package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice7 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a =new Actions(driver);
		a.moveToElement(sign);
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("887898098");
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		
		driver.switchTo().defaultContent();
		System.out.println("pass");
		driver.quit();
		
	}
}
