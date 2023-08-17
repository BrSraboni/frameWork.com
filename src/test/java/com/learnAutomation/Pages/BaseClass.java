package com.learnAutomation.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.LearnAutomatiton.utility.BrowserFactory;
import com.LearnAutomatiton.utility.ConfigDataProvider;
import com.LearnAutomatiton.utility.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite(enabled = false)
	public void setUpsuite() throws IOException {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();

	}

	@BeforeClass
	public void SetUpBrowser() throws IOException {

		config = new ConfigDataProvider();
		config.getBrowser();


		// Browser Factory
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());


		String TitleName = driver.getTitle();
		System.out.println("Ttile is " + TitleName);
	}

	@AfterClass
	public void TearDown() {
		BrowserFactory.quitBrowser(driver);
	}

}
