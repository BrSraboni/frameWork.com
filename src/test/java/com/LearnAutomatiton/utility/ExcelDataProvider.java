package com.LearnAutomatiton.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook WB;

	public ExcelDataProvider() {

		File src = new File("src/test/resources/testData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			WB = new XSSFWorkbook(fis); // In the bracket we provide the FileInputStream obj.

		} catch (Exception e) {
			System.out.println("Unable to read excel file " + e.getMessage());
		}

	}


	public String getStringData(int SheetIndex, int row, int column) {
		return WB.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringData(String SheetName, int row, int column) {
		return WB.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String SheetName, int row, int column) {
		return WB.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
