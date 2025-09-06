package com.wiprojuly.capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeBrowser {

	public static void main(String[] args) {
		// allows the customization of ChromeDriver sessions by modifying browser properties
		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download, setup and maintenance of the different browsers
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.demoblaze.com/");

	}

}
