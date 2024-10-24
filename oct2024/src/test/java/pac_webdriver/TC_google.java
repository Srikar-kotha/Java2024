package pac_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_google {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is : "+driver.getTitle());
		//System.out.println("URL is :"+driver.getPageSource());
		System.out.println("URL is :"+driver.getPageSource().contains("yahoo"));


		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Testing methods");
		
		ele.submit();
		
		System.out.println("Title of the page is : "+driver.getTitle());
		
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println("URL is :"+driver.getPageSource().contains("yahoo"));

		System.out.println("Title of the page is : "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title of the page is : "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title of the page is : "+driver.getTitle());
		


		

		
		//driver.close();
		
	}

}
