package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		String Title=driver.getTitle();
		System.out.println("Title = " +Title);
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("URL = "+CurrentURL);
		String PageSource= driver.getPageSource();
		//System.out.println("PageSource = "+ PageSource);
		String WINDOWHANDLE=driver.getWindowHandle();
		System.out.println("window Handle = "+WINDOWHANDLE);
		
		WebElement element =driver.findElement(By.xpath("//a[text()='Mobiles']"));
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.getText());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.titleContains(Title));
		Point location=element.getLocation();
		int X = location.getX();
		int Y = location.getY();
		System.out.println("x= "+X +"\ny= "+Y);
		Dimension size = element.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Hight= "+height+ "\nWidth= "+width);
		boolean dis=element.isDisplayed();
		boolean dis2=element.isEnabled();
		System.out.println(dis+"\n"+dis2);
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
