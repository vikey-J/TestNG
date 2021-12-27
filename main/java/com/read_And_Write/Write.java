package com.read_And_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write{
	public static void a() throws IOException {
		File f=new File("C:\\Users\\my pc\\Documents\\Book.xlsx");
        FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("Data1").createRow(0).createCell(0).setCellValue("username");
	    wb.getSheet("Data1").getRow(0).createCell(1).setCellValue("pass");
	    wb.getSheet("Data1").createRow(1).createCell(0).setCellValue("tony");
	    wb.getSheet("Data1").getRow(1).createCell(1).setCellValue("tony123");
	    FileOutputStream fos=new FileOutputStream(f);
	    wb.write(fos);
	    wb.close();
	    System.out.println("sucessfully");
	}
	public static void main(String[] args) throws IOException {
		a();
	}
	
	
}