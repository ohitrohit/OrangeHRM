package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class General_Scriptfor_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title2=driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		System.out.println(title2);
		WebElement dashboard =driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));
		Point location = dashboard.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		Thread.sleep(5000);
		driver.quit();
	}
}
