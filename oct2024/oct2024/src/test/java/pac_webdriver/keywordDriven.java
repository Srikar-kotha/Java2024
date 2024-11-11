package pac_webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywordDriven {
	
	public static void login() throws IOException, InterruptedException
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("r1.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("verify the Title");
		
		FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("login");
		
		System.out.println("rows : "+rows(sheet));
		
		for(int i=0;i<rows(sheet);i++)
		{
			String opencart_url=getcell(sheet,i,0);
			String uname=getcell(sheet,i,1);
			String pword=getcell(sheet,i,2);
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get(opencart_url);
		
		if(driver.getTitle().equals("Account Login"))
		{
			test.pass("title is matched");
			screenshot(driver);
		}
		else
		{
			test.fail("title is not matched");
			screenshot(driver);
		}
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		TC_pagefactory_pom obj=PageFactory.initElements(driver,TC_pagefactory_pom.class);
		
		obj.enterusername(uname);
		obj.enterpassword(pword);
		
		Thread.sleep(2000);
		obj.login();
		
		driver.quit();
		
		extent.flush();
		
		}
	workbook.close();
	}
	
	public static void screenshot(WebDriver driver) throws IOException
	{
		File ssfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ssfile,new File("s1.jpg"));
	}
	private static void close()
	{
		System.out.println("This is close code");
	}
	
	public static int rows(XSSFSheet sheetrows) {
		int noofrows=sheetrows.getPhysicalNumberOfRows();
		
		return noofrows;
	}
	
	public static String getcell(XSSFSheet whichsheet,int rowno,int cellno) {
		
		String name=whichsheet.getRow(rowno).getCell(cellno).getStringCellValue();
		
		return name;
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, InterruptedException 
	{

		FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\opencart.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Module");
		XSSFSheet testcasesheet=workbook.getSheet("Testcase");
		XSSFSheet teststepsheet=workbook.getSheet("Teststep");
		
		System.out.println("rows : "+rows(sheet));
		
		for(int i=0;i<rows(sheet);i++)
		{
			String moduleexe=getcell(sheet,i,2);
			
			if(moduleexe.equals("Y"))
			{
				String moduleid=getcell(sheet,i,0);
				System.out.println(moduleid);
				
				System.out.println("rows1 : "+rows(testcasesheet));
				
				for(int j=0;j<rows(testcasesheet);j++)
				{
					String testcase_moduleid=getcell(testcasesheet,j,3);
					String testexe=getcell(testcasesheet,j,2);
					if(testcase_moduleid.equals(moduleid) && testexe.equals("Y"))
					{
					String testcaseid=getcell(testcasesheet,j,0);
					
					System.out.println(testcaseid);
					System.out.println("rows1 : "+rows(teststepsheet));
					
					for(int k=0;k<rows(teststepsheet);k++)
					{
						String teststep_testcaseid=getcell(teststepsheet,k,4);
						String keywords=getcell(teststepsheet,k,3);
						if(teststep_testcaseid.equals(testcaseid) )
						{
							switch(keywords)
							{
							case "ln":
								login();
							
							case "ca":
								close();
							System.out.println(teststep_testcaseid);
							}	
						}
					}		
					}
				}			
			}
		}
	workbook.close();
	}
}
