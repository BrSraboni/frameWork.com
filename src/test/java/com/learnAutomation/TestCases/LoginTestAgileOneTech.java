package com.learnAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LearnAutomatiton.utility.BrowserFactory;
import com.LearnAutomatiton.utility.ExcelDataProvider;
import com.learnAutomation.Pages.BaseClass;
import com.learnAutomation.Pages.LogInPage;

public class LoginTestAgileOneTech extends BaseClass {

	@Test
	public void loginApp() {
		// LogInPage
		
		
		LogInPage lp = new LogInPage(driver);
		// lp.loginToAgileTech("rabbi.shakir@agile1tech.com", "FreshImpact69#");
		lp.loginToAgileTech(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		//LogInPage LP = PageFactory.initElements(driver, LogInPage.class);
		//LP.loginToAgileTech(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}

}
