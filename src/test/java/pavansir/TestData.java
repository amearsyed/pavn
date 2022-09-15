package pavansir;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestData {
	@Test
	public void readdatafromexcel() throws Exception {
		
	
		FileInputStream fis =new FileInputStream("./PAVANSIR.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int lastrow = sh.getLastRowNum();
		for(int i=0;i<=lastrow;i++) {
			  double cellvalue = sh.getRow(i).getCell(1).getNumericCellValue();
			if(cellvalue>=7000) {
				System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
			}
		}
		
	}

}

