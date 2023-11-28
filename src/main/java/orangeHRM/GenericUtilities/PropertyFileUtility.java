package orangeHRM.GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this class is consist of genric method of read data from propertyfile
 * @author rohit
 *
 */
public class PropertyFileUtility {

	/**
	 * this method is used for read the data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommanData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String Value = pObj.getProperty(key);
		return Value;
	}
	
}
