package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\bapparayar\\git\\AllSeleniumTestcasesAutomation\\src\\main\\java\\datafiles\\newexceldata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fi);

		XSSFSheet sheet = workbook.getSheet("Requirments");

		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();

		String [][] data = new String[lastrow][lastcell];

		Formatter formate = new Formatter();
		for (int i = 1; i <=lastrow; i++) {
			for (int j = 0; j < lastcell; j++) {
				//System.out.println(sheet.getRow(i).getCell(j));
				 data[i-1][j]= sheet.getRow(i).getCell(j).toString();
				 System.out.println(data[i-1][j]);

			}

		}
		
		System.out.println(data.length);

	}
}
