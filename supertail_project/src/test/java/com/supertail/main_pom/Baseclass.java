package com.supertail.main_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	WebDriver driver;
	
	
	public Baseclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebDriver setup(String url)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		return driver;
	}
	
	public ExtentTest getreport()
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Supertail_report.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("verify the cart");
		
		return test;
	}
	
	
	public void teardown()
	{
		driver.quit();
	}

}
