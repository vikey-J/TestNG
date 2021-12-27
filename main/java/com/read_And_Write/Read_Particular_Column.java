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

public class Read_Particular_Column {
	public static void particular_Column() throws IOException {
		File f=new File("C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\Data\\SampleData.xlsx");
	    FileInputStream fis=new FileInputStream(f);
	    Workbook wb=new XSSFWorkbook(fis);
	    Sheet sheetAt = wb.getSheetAt(0);
	    int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	    for (int i = 0; i <numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String str = cell.getStringCellValue();
	            System.out.println(str);		
			}
			else if(cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int ncv=(int)numericCellValue;
				System.out.println(ncv);
			}
	    }
	}
	public static void main(String[] args) throws Throwable {
		particular_Column();
	}

}
