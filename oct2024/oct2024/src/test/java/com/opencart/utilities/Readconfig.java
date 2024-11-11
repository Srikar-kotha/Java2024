package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Readconfig {

	public String geturl() throws IOException
	{
		Properties prop=new Properties();
		InputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\login_properties");
		prop.load(input);
		
		String opencart_url=prop.getProperty("url");
		return opencart_url;
		
	}
}
