package com.read_And_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Partucular_Row{
	public static void particular_Row() throws NullPointerException, IOException{
		File f=new File("C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\Data\\SampleData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(3);
	    int numberOfCells = row.getPhysicalNumberOfCells();
	    for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int)numericCellValue;
				System.out.println(value);
			}
		}
	}
	public static void main(String[] args) throws Throwable {
		particular_Row();
	}
}
