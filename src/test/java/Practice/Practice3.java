package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
//		s.selectByIndex(1);
//		WebElement selectoption = s.getFirstSelectedOption();
//		int num=s.getOptions().indexOf(selectoption);
//		System.out.println(num+" = "+selectoption.getText());
		s.selectByValue("search-alias=amazon-devices");
		WebElement selectoption=s.getFirstSelectedOption();
		int num=s.getOptions().indexOf(selectoption);
     	System.out.println(num+" = "+selectoption.getText());
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
