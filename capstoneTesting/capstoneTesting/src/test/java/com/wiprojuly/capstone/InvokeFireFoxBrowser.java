package com.wiprojuly.capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFireFoxBrowser {

	public static void main(String[] args) {
		
				FirefoxOptions firefoxOptions = new FirefoxOptions();
								WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver(firefoxOptions);
				driver.get("https://www.demoblaze.com/");

			}
	}


