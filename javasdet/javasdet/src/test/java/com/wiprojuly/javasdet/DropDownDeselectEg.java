package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDeselectEg {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		// opens the specified URL in the browser
		driver.get("https://grotechminds.com/multiple-select/");
	// maximize the window
		driver.manage().window().maximize();
		// web element for drop down
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='automobiles']"));
		Select select = new Select(dropdown);
	
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		/*select.deselectByIndex(1);
		Thread.sleep(2000);
		*/
		
		/*select.deselectByVisibleText("Motorcycle");
		Thread.sleep(2000);
		*/
		
		select.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		

	}

}
