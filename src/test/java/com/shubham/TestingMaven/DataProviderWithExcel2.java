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

public class DataProviderWithExcel2 {

	XSSFWorkbook book;

	XSSFSheet sheet;

	FileInputStream inputstream;

	String src = "/Users/shubhamsaini/Downloads/testfile.xlsx";

	public XSSFSheet readfile(String val) throws IOException {

		 inputstream = new FileInputStream(new File(val));

		 book = new XSSFWorkbook(inputstream);

		 sheet = book.getSheetAt(0);

		return sheet;

	}

	public int getRows() throws IOException {

		sheet = readfile(src);

		int rows = sheet.getPhysicalNumberOfRows();

		return rows;

	}

	public int getColumns() throws IOException {

		sheet = readfile(src);

		int cols = sheet.getRow(0).getLastCellNum();

		return cols;
	}


	@DataProvider(name="readdata")
	public Object[][] dataProvider() throws IOException {

		int cols = getColumns();

		int rows = getRows();

		DataFormatter df = new DataFormatter(Locale.US);

		Object[][] data = new Object[rows][cols];

		for(int i=0;i<rows;i++) {

			for(int j=0;j<cols;j++) {

				//first way
				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));

				//second way
//				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();


		}
			}

		return data;

	}

	@Test(dataProvider="readdata")
	public void test(String val1,String val2) {
		System.out.println(val1 + "  =====  " + val2);
	}

}
