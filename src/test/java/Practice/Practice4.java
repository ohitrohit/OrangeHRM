package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement box = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(box);
		if(s.isMultiple()) {
			System.out.println(s.isMultiple());
		}else
		{
			System.out.println("false");
		}
		driver.quit();
	}
}
