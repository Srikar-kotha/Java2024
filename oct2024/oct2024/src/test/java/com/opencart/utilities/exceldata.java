package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class exceldata {

	@DataProvider(name="login")
	public String[][] exceldata() throws IOException
	{
		String[][] data = new String[2][2];
		
		FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("login");
		
		int noofrows=sheet.getPhysicalNumberOfRows();
		System.out.println("rows"+noofrows);
		
		for(int i=0;i<noofrows;i++)
		{
			String uname=sheet.getRow(i).getCell(1).getStringCellValue();
			String pword=sheet.getRow(i).getCell(2).getStringCellValue();
			data[i][0]=uname;
			data[i][1]=pword;
		}
		
		workbook.close();
		return data;
	}
}
