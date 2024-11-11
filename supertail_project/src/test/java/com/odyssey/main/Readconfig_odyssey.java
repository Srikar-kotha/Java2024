package com.odyssey.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Readconfig_odyssey {

	public String geturl() throws IOException
	{
		Properties prop=new Properties();
		InputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\supertail_project\\src\\test\\java\\com\\supertail\\main\\odyssey.properties");
		prop.load(input);
		
		String odyssey_url=prop.getProperty("url");
		
		return odyssey_url; 
	}
	
	
	}