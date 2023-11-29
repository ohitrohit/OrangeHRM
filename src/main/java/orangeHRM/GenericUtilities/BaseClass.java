package orangeHRM.GenericUtilities;
/**
 * this class consist all the configration annotation of testNG
 * @author rohit
 *
 */

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHRM.ObjectRepository.LoginPage;

public class BaseClass {

	 public WebDriverUtility wUtil = new WebDriverUtility();
	 public PropertyFileUtility pUtil = new PropertyFileUtility();
	 public ExcelFileUtility eUtil = new ExcelFileUtility();
	 public JavaUtility jUtil = new JavaUtility();
	 WebDriver driver;
	
	//@BeforeSuite()
	//@BeforeTest()
	@BeforeClass()
	public void bcConfig() throws IOException{
		String URL = pUtil.readDataFromPropertiesFile("URL");
		String BROWSER = pUtil.readDataFromPropertiesFile("BROWSER");
		if(BROWSER.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("----------Browser Launch");
		}else {
			System.out.println("Invalid browser name");
		}
		wUtil.maximizeWindow(driver);
		wUtil.waitForPage(driver);
		driver.get(URL);
		
	}
	@BeforeMethod()
	public void bmConfig() throws IOException {
		String ID = pUtil.readDataFromPropertiesFile("ID");
		String PASSWORD = pUtil.readDataFromPropertiesFile("PASSWORD");
		LoginPage lp = new LoginPage(driver);
		lp.Login(ID, PASSWORD);
		System.out.println("-----------Login Successfully-----------------");
	}
	@AfterMethod()
	public void amConfig() {
		
	}
	@AfterClass()
	public void acConfig() {
		
	}
	//@AfterTest()
	//@AfterSuite()
	
	
	
}
