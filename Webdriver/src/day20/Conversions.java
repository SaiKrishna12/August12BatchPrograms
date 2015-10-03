package day20;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Conversions {
	
	@Test
	public void conversionsTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\August12Batch\\Webdriver\\src\\com\\qedge\\excelfiles\\Ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Cell c=ws.getRow(1).getCell(0);
		/*double d=c.getNumericCellValue();
		long l=(long)d;
		System.out.println(l);
		String str=Long.toString(l);*/
		Long.toString((long)c.getNumericCellValue());
		
	}

}
