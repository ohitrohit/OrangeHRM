package orangeHRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this page contain all the element for login page
 * @author rohit
 *
 */
public class LoginPage {

	//declearation 
	@FindBy(name = "username")
	private WebElement IDTextField;
	
	@FindBy(name = "password")
	private WebElement PasswordTextFied;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-login-action']/button[@type='submit']")
	private WebElement LoginButton;
	
	//initilation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	
	//utilisation
	public WebElement getIDTextField() {
		return IDTextField;
	}

	public WebElement getPasswordTextFied() {
		return PasswordTextFied;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//Bussiness libarary
	/**
	 * this method is used for login
	 * @param ID
	 * @param PASSWORD
	 */
	public void Login(String ID , String PASSWORD) {
		IDTextField.sendKeys(ID);
		PasswordTextFied.sendKeys(PASSWORD);
		LoginButton.click();
	}
}
