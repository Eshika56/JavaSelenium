package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectEg {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		// opens the specified URL in the browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	// maximize the window
		driver.manage().window().maximize();
		// web element for drop down
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(dropdown);
		// select by visible text
		select.selectByVisibleText("Option1");
		Thread.sleep(2000);
		// select by value
		select.selectByValue("option2");
		Thread.sleep(2000);
		// select by index
		select.selectByIndex(3);
		
		
		
		
		

	}

}
