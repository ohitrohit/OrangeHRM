package Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		WebElement element = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		
		element.click();
		Runtime.getRuntime().exec("D:\\Work Files\\Notes\\Q-spider Notes\\SELENIUM\\auto.exe");
		
		Thread.sleep(5000);
		
		
	}
}
