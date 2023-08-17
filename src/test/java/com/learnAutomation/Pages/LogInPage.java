package com.learnAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	WebDriver Driver;
	public LogInPage (WebDriver driver) {
		this.Driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id='dropdownMenuButton']/a") WebElement MyPortal;
	
	@FindBy(name ="email") WebElement Username;
	
	@FindBy(name ="password") WebElement Password;
	
	@FindBy(className ="login-btn") WebElement LoginButton;
	
	
	
	public void loginToAgileTech(String username, String password)  {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		MyPortal.click();
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
	}


	
	
	
	

}
