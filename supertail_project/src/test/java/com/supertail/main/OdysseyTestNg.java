package com.supertail.main;

import com.odyssey.main.odyssey_pom;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.odyssey.main.Baseclass1;
import com.odyssey.main.Readconfig_odyssey;
import com.odyssey.main.odyssey_pom;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OdysseyTestNg {
	
	WebDriver driver;
	ExtentTest test;
	ExtentReports extent;
	Baseclass1 baseclass = new Baseclass1();
	
  @Test(dataProvider = "create")
  void create(String fname, String lname, String cemail, String pword) throws InterruptedException, IOException {

	  test = extent.createTest("verify the Account creation");
	  
	  odyssey_pom obj = PageFactory.initElements(driver, odyssey_pom.class);
	  
      obj.createaccount(fname,lname, cemail, pword);
      
      String screenshotPath = baseclass.captureScreenshot(driver,"AccountCreation");
      if(driver.findElement(By.xpath("//a[normalize-space()='Logout']")).isDisplayed())
      	{
    	  	test.pass("Your account is created successfully",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
      	}
      else
      	{
      		test.fail("your account creation is unsuccesfull",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
      	}
      
      obj.islogout();  
      extent.flush();
  }
      
   @Test(dataProvider = "login",priority=2)
   
   void login_action(String username,String password) throws IOException {
	   
	   test=extent.createTest("verify the login");
	  	
	   odyssey_pom obj = PageFactory.initElements(driver, odyssey_pom.class);
	   
	   obj.login(username, password);
	   String screenshotPath = baseclass.captureScreenshot(driver,"login_confirm");
	   if(driver.findElement(By.xpath("//a[normalize-space()='Logout']")).isDisplayed())
 		{
 		test.pass("login successfull",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
 		}
	   else
	   {
		   test.fail("login unsuccesfull",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	   }
 
	   obj.islogout();  
	   extent.flush();
   }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  @DataProvider(name="create")
  public String[][] prop_data() throws IOException
	{
		String[][] data= new String[1][4];
	
		FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\Downloads\\odyssey1122.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(input);
		XSSFSheet createsheet=workbook.getSheet("create_account");
		
		int noofrows=createsheet.getPhysicalNumberOfRows();
		System.out.println("Rows : "+noofrows);
		
		for(int i=0;i<noofrows-1;i++)
		{
			String fname=createsheet.getRow(i).getCell(0).getStringCellValue();		
			String lname=createsheet.getRow(i).getCell(1).getStringCellValue();		
			String cemail=createsheet.getRow(i).getCell(2).getStringCellValue();		
			String pword=createsheet.getRow(i).getCell(3).getStringCellValue();	
			
			data[0][0]=fname;			
			data[0][1]=lname;
			data[0][2]=cemail;
			data[0][3]=pword;
		}
		
			return data;
	}
  @DataProvider(name="login")
  public String[][] login_data() throws IOException
	{
		String[][] data= new String[1][2];
	
		FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\Downloads\\odyssey1122.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(input);
		XSSFSheet loginsheet=workbook.getSheet("Odyssey_login");
		
		int noofrows=loginsheet.getPhysicalNumberOfRows();
		System.out.println("Rows : "+noofrows);
		
		for(int i=0;i<noofrows-1;i++)
		{
			String user_name=loginsheet.getRow(i).getCell(0).getStringCellValue();		
			String password=loginsheet.getRow(i).getCell(1).getStringCellValue();		

			data[0][0]=user_name;			
			data[0][1]=password;			
		}
			return data;
	}
  
  @BeforeClass
  public void beforeClass() {  
  }

  @AfterClass
  public void afterClass() {
  
//	  baseclass.teardown();
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	 
	  	
	  	Readconfig_odyssey conf = new Readconfig_odyssey();
	      String od_url = conf.geturl();
	      Baseclass1 baseclass = new Baseclass1();
	      driver = baseclass.setup(od_url);
	      extent = baseclass.getreport();
  }

  @AfterTest
  public void afterTest() {
//	  baseclass.teardown();
//	  extent.flush();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
