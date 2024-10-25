package pac_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("My Account")).click();
//		
//		driver.findElement(By.linkText("Login")).click();
		
		login_pom obj=new login_pom(driver);
		
//		driver.findElement(By.id("input-email")).sendKeys("Srikarkotha260@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Srikar@123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		obj.enterusername("Srikarkotha260@gmail.com");
		obj.enterpassword("Srikar@123");
		
		Thread.sleep(2000);
		obj.login();
	}

}
