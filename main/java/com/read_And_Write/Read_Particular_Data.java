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

public class Read_Particular_Data {
	public static void read_Particular_Data() throws IOException {
		File f=new File("C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\Data\\SampleData.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)){
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
		    int value=(int) cellValue;
		    System.out.println(value);
		}
	}
	public static void main(String[] args) throws Throwable {
		read_Particular_Data();
	}
	
}