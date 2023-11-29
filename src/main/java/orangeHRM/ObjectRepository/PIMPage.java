package orangeHRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contain all the element for PIM page
 * @author rohit
 *
 */
public class PIMPage {

	//declearation
	@FindBy(xpath = "//button[@type='button']/i[@class='oxd-icon bi-plus oxd-button-icon']")
	private WebElement AddButton;
	
	//Initialtion
	public PIMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//utilisation
	
	public WebElement getAddButton() {
		return AddButton;
	}
	
	//Business Liberary
	/**
	 * this method is used to click on the addbutton
	 */
	public void ClickOnAddButton() {
		AddButton.click();
	}
}
