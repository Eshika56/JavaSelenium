package com.wiprojuly.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterization {
	
	@Parameters({ "browser", "platform" })
	@Test
	public void testparameters(String browser, String platform) {
		try {
		if (browser.equals("chrome") && platform.equals("windows")) {
			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
		else {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Desktop\\Corporate Trainings\\IIHT\\Screen shots\\edgedriver_win64\\msedgedriver.exe");
		    // Create EdgeDriver instance
		    WebDriver driver = new EdgeDriver();
		    // Open a web page
		    driver.get("https://www.google.com");
		}

	}
		catch(Exception e) {
			System.out.println(e);
		}

}}

