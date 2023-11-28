package orangeHRM.GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class consist a genric method for read the data from excile file
 * @author rohit
 *
 */
public class ExcelFileUtility {

	/**
	 * this method is used to read data from excel sheet
	 * @param Sheet
	 * @param Row
	 * @param Cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String Sheet , int Row , int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OrangeHRMBOOk1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(Sheet);
		Row rw = sh.getRow(Row);
		Cell cl =rw.getCell(Cell);
		String Value = cl.getStringCellValue();
		wb.close();
		return Value;
		
		
	}
}
