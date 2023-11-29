package orangeHRM.CreateEmployee;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import orangeHRM.GenericUtilities.BaseClass;
import orangeHRM.ObjectRepository.AddEmployeePage;
import orangeHRM.ObjectRepository.HomePage;
import orangeHRM.ObjectRepository.PIMPage;

public class CreateEmpoyeetest extends BaseClass{

	@Test
	public void createEmployee() throws EncryptedDocumentException, IOException {
		String fname = eUtil.readDataFromExcelFile("Employe", 1, 1)+jUtil.getRandomNumber();
		String lname = eUtil.readDataFromExcelFile("Employe", 1, 2)+jUtil.getRandomNumber();
		
		HomePage hm = new HomePage(driver);
		hm.ClickOnPIMButton();
		Reporter.log("Click on the PIM button successfully");
		
		PIMPage pp= new PIMPage(driver);
		pp.ClickOnAddButton();
		Reporter.log("Click on the Add button successfully");
		
		AddEmployeePage ap = new AddEmployeePage(driver);
		ap.CreateEmployee(fname, lname);
		Reporter.log("Create new employee successfully");
		
	}
}
