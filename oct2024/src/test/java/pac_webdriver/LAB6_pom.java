package pac_webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LAB6_pom {
	
	public LAB6_pom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	WebDriver driver;
	By mens_fashions=By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"); 
	By sport_shoes=By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span");
	By sortby=By.className("sort-selected");
	By low_high=By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/ul/li[2]");
	By addcart=By.id("add-cart-button-id");
	By search_box=By.id("inputValEnter");
	
	public void mens() {
		driver.findElement(mens_fashions).click();
		driver.findElement(sport_shoes).click();
	}
	
	public void sort() {

		driver.findElement(sortby).click();
	}
	
	public void switch_window(int index) {
		
		List<String> wh=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wh.get(index));
	}
	
	public void add_cart() {
		
		driver.findElement(addcart).click();
	}
	
	public void search(String item) {

		driver.findElement(search_box).sendKeys(item);
		driver.findElement(By.className("searchTextSpan")).click();
	}

}
