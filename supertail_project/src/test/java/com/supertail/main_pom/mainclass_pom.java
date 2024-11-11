package com.supertail.main_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainclass_pom {
	
	WebDriver driver;

	public mainclass_pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='mainfrm']")
	WebElement searching;
	
	@FindBy(xpath="//span[@class='findify-components--text findify-components--text__primary-lowercase']")
	WebElement sortby;
	
	@FindBy(xpath="//span[normalize-space()='Price: Low To High']")
	WebElement low_high;
	
	@FindBy(xpath="//img[@alt='Gnawlers Defense Dent Dental Care Chew Bones For Dogs']")
	WebElement first;
	
	@FindBy(id="AddToCart-template--16703736905966__main")
	WebElement Add_to_cart;
	
	public void search(String sear)
	{
		searching.sendKeys(sear);
		searching.submit();
	}
	
	public void sortby()
	{
		sortby.click();
		low_high.click();
	}

	public void click_first()
	{
		first.click();
	}
	
	public void addcart()
	{
		Add_to_cart.click();
	}

}