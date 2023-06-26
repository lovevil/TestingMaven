package com.shubham.TestingMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	String src = "/Users/shubhamsaini/Downloads/testfile.xlsx";

	@DataProvider(name="dp1")
    public Object [][] dataProvider1() throws IOException {

		File file = new File(src);

		FileInputStream inputstream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();

        int cols = sheet.getRow(0).getLastCellNum();

		DataFormatter formatter = new DataFormatter(Locale.US);

		Object[][] data = new Object[rows][cols];

		for(int i=0;i<rows;i++) {

		  for(int j=0;j<cols;j++) {

		  data[i][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));

		  }
		}

		workbook.close();
		inputstream.close();
		return data;

 }

	@Test(dataProvider="dp1")
	public void readData(String val1,String val2) {

		System.out.println(val1 + " ====== " + val2);
	}

}
