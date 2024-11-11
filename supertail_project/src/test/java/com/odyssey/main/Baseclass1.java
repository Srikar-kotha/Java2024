package com.odyssey.main;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {

    WebDriver driver;

    public WebDriver setup(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    public ExtentReports getreport() {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Supertail_report.html");
        extent.attachReporter(spark); 
        return extent;
    }

    public String captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = "./Screenshots/" + screenshotName + ".png";
            File destination = new File(dest);
            FileUtils.copyFile(source, destination);
            return dest;
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
            return null;
        }
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
