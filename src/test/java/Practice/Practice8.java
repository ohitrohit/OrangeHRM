package Practice;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Practice8 {

	public static void main(String[] args) {
		EdgeOptions option = new EdgeOptions();
		
		
		EdgeDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		option.addArguments("--disable-notification");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.id("jaurney-date")).click();
//		driver.findElement(By.xpath("//div[@class='container date ']/span[@data-date='28']")).click();
//		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
		
		System.out.println("pass");
		driver.quit();
		
	}
}
