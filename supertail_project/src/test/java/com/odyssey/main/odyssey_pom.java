package com.odyssey.main;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class odyssey_pom {

    WebDriver driver;

    public odyssey_pom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='header__action-item-link hidden-pocket hidden-lap']")
    WebElement Myaccount;

    @FindBy(xpath = "//button[normalize-space()='Create your account']")
    WebElement create_account;

    @FindBy(id = "register-customer[first_name]")
    WebElement firstname;

    @FindBy(id = "register-customer[last_name]")
    WebElement lastname;

    @FindBy(id = "register-customer[email]")
    WebElement email;

    @FindBy(id = "register-customer[password]")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Create my account']")
    WebElement create;

    @FindBy(id = "login-customer[email]")
    WebElement enter_email;

    @FindBy(id = "login-customer[password]")
    WebElement enter_password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;
    
    public void action()
    {
    	Myaccount.click();
    	create_account.click();
    	if(firstname.isDisplayed())
    	{
    		
    	}
    }

    public void createaccount(String fname, String lname, String cemail, String cpassword) throws InterruptedException {
 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
        wait.until(ExpectedConditions.visibilityOf(Myaccount));
        Myaccount.click();
        Thread.sleep(2000);  
        create_account.click();
        Thread.sleep(2000);
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(cemail);
        password.sendKeys(cpassword);
        create.click();
        Myaccount.click();
        Thread.sleep(2000);
    }

    public void islogout() {
    	logout.click();
    }

    public void login(String username,String password) {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
        wait.until(ExpectedConditions.visibilityOf(Myaccount));
    	Myaccount.click();
    	enter_email.sendKeys(username);
        enter_password.sendKeys(password);
        login.click();
        Myaccount.click();
    }
}
