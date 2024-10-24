package pac_webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LAB_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(1202, 672));
		
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span")).click();
		
		driver.findElement(By.className("sort-selected")).click();
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/ul/li[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"680540434263\"]/div[1]/a/picture/img")).click();
		
		Thread.sleep(5000);
		
		List<String> wh= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wh.get(1));
        
		System.out.println("The item details is :"+driver.findElement(By.linkText("Item Details")).isDisplayed());
		driver.findElement(By.id("add-cart-button-id")).click();
		
		System.out.println("The product is added :"+driver.findElement(By.className("mess-text")).isDisplayed());
		
		System.out.println("finish");
		
		WebElement sea=driver.findElement(By.id("inputValEnter"));
		sea.sendKeys("mobile cover");
		sea.submit();
//		driver.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();
		
		System.out.println("finish");


	}

}
