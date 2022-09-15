package DataDriven;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelDataTest {
	@Test
	public void readdatafromexcel() throws Throwable
	{
		
		FileInputStream fis=new FileInputStream("./Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(3);
		Cell c=r.getCell(1);
		String value=c.getStringCellValue();
		System.out.println(value);
		
		
	}
}
