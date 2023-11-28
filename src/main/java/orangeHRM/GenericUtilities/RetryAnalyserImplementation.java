package orangeHRM.GenericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
 * this method is used for implement IretryAnalyser in TEstNG method
 * @author rohit
 *
 */
public class RetryAnalyserImplementation implements IRetryAnalyzer {

	int count = 0;
	int retryCount =3;
	/**
	 * this method is used for retry 3 times
	 */
	public boolean retry(ITestResult result) {
		
		while(count<retryCount) {
			count++;
			return true;
		}
		return false;
	}

	
}
