package orangeHRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contain all the element for addemployeepage
 * @author rohit
 *
 */
public class AddEmployeePage {

	//declearation
	@FindBy(name= "firstName")
	private WebElement FirstNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement LastnameTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SubmitButton;
	
	//initialtion
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	
	
	//utilisation
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	//Business Library
	/**
	 * this method is used for Createemployee
	 * @param fname
	 * @param lname
	 */
	public void CreateEmployee(String fname , String lname) {
		FirstNameTextField.sendKeys(fname);
		LastnameTextField.sendKeys(lname);
		SubmitButton.click();
	}
}
