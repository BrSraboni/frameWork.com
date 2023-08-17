package com.LearnAutomatiton.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	// REading configuration file or property file is one of the easiest task

	public Properties prop;

	public ConfigDataProvider() throws IOException {

		prop = new Properties();

		try {
			prop.load(new FileInputStream("src/test/resources/Config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(getBrowser());

	}

	public String getDataFromConfig(String KeyToSearch) {
		return prop.getProperty(KeyToSearch);

	}

	public String getBrowser() {

		return prop.getProperty("Browser");

	}

	public String getStagingURL() {
		return prop.getProperty("qaURL");

	}

}
