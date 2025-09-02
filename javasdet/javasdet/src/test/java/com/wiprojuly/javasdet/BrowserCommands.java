package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		// opens the specified URL in the browser
		driver.get("https://www.facebook.com/");
	// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// get the page title
		String title = driver.getTitle();
		System.out.println(title);
		// get the source code of the HTML page
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		// fetch the current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// close the current window
		driver.close();
		// close all the windows
		// driver.quit();
		
		
		

	}

}
