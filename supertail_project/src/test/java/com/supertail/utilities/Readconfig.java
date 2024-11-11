package com.supertail.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;

import com.supertail.main_pom.Baseclass;

public class Readconfig {
		
	public String geturl() throws IOException
	{
		Properties prop=new Properties();
		InputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\supertail_project\\supertail.properties");
		prop.load(input);
		
		String supertail_url=prop.getProperty("url");
		
		return supertail_url; 
	}
	
	@DataProvider(name="supertail")
	String[][] prop_data() throws IOException
	{
	
		String[][] data= new String[2][2];
		
		Properties prop=new Properties();
		InputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\supertail_project\\supertail.properties");
		prop.load(input);
		
		String search1=prop.getProperty("search1");
//		String search2=prop.getProperty("search2");
		data[0][0]=search1;
//		data[0][1]=search2;
		
		
		
		return data;
	}

}
