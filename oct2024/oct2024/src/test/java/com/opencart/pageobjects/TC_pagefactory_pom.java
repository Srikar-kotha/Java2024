package com.opencart.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_pagefactory_pom{
	
	public TC_pagefactory_pom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver;
//	By username=By.id("input-email");
	@FindBy(id="input-email")
	WebElement username;
	
//	By password=By.id("input-password");
	@FindBy(id="input-password")
	WebElement password;
	
//	By loginbutton=By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;

	public void enterusername(String email) {
		username.sendKeys(email);;
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);;
	}
	
	public void login() {
		loginbutton.click();;
	}
	

}
