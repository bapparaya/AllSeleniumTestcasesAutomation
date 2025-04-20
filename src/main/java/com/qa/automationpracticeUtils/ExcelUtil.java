package com.qa.automationpracticeUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream file = new FileInputStream("E:\\B1java\\AutomationTestingPracticeWebsite\\src\\main\\java\\datafiles\\newexceldata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Requirments");
		int rownum = sheet.getLastRowNum()+1;
		int columncount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rownum ][columncount];
		for(int i=0;i<rownum;i++){
		for(int j=0;j<columncount;j++){
		data[i][j]=sheet.getRow(i).getCell(j).toString();
		System.out.println(data[i][j]);
		}
		}
		

	}

	
}
