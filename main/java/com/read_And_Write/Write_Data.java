package com.read_And_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void write_Data() throws Throwable{
		File f=new File("C:\\Users\\my pc\\Documents\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Tony");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("tonysrark123");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("sucessfully");
		}
	public static void main(String[] args) throws Throwable {
           write_Data();
	}

}
