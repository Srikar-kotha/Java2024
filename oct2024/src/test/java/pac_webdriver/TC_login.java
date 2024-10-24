package pac_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//Thread.sleep(10000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
	}

}
