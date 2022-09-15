package GenericLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readdatafromex(String sheetname,int rownum, int cellnum) throws Exception {
		

	FileInputStream fis=new FileInputStream(Ipathconstant.EXCELFILEPATH);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetname);
	Row r=sh.getRow(rownum);
	Cell c=r.getCell(cellnum);
	String value=c.getStringCellValue();
		return value;
}
}
