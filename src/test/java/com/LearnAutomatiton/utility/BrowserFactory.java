package com.LearnAutomatiton.utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
