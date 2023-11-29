package orangeHRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is contain all the element of home page
 * @author rohit
 *
 */
public class HomePage {

	//declearation
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6[text()='Dashboard']")
	private WebElement DashboardText;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement ProfileDropDown;
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")
	private WebElement LogOutButton;
	
	@FindBy(xpath = "//ul[@class= 'oxd-main-menu']/li[2]/a/span[text()='PIM']")
	private WebElement PIMButton;
	
	//initialitaion
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//Utilisation
	public WebElement getDashboardText() {
		return DashboardText;
	}

	public WebElement getProfileDropDown() {
		return ProfileDropDown;
	}

	public WebElement getLogOutButton() {
		return LogOutButton;
	}

	public WebElement getPIMButton() {
		return PIMButton;
	}
	
	//Buissness Liberary
	/**
	 * this method is used for get the homepage text
	 * @param driver
	 */
	public void GetHomepageText() {
		String db = DashboardText.getText();
		System.out.println(db);
	}
	/**
	 * this method is used for click on the PIM button
	 * @param driver
	 */
	public void ClickOnPIMButton() {
		PIMButton.click();
	}
	
	/**
	 * this method is used for Logout
	 * @param driver
	 */
	public void LogOut() {
	
		ProfileDropDown.click();
		LogOutButton.click();
	}
	
}
