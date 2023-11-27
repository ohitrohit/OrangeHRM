package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,5000)");
		
		WebElement box=driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
//		Point p = box.getLocation();
//		int x= p.getX();
//		int y = p.getY();
//		js.executeAsyncScript("window.scrollBy("+x+","+y+")");
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", box);
		System.out.println("pass");
		driver.quit();
	}
}
