package com.supertail.main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.supertail.main_pom.Baseclass;
import com.supertail.main_pom.mainclass_pom;
import com.supertail.utilities.Readconfig;

public class mainclass {
	
	@Test(dataProvider="supertail",dataProviderClass=Readconfig.class)
	public static void main(String search1) throws IOException
	{
	
		WebDriver driver = null;
		
		Readconfig con = new Readconfig();
		String url1=con.geturl();
		
		Baseclass baseclass=new Baseclass(driver);
		driver=baseclass.setup(url1);
		
		mainclass_pom obj=PageFactory.initElements(driver, mainclass_pom.class);
		obj.search(search1);
		obj.sortby();
		obj.click_first();
		obj.addcart();
		
		baseclass.getreport();
		
		
	}
	
}
//span[@class='findify-components--text findify-components--text__primary-lowercase']