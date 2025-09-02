package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerEg {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://ui.shadcn.com/docs/components/date-picker");
		
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Open date picker 
        WebElement datePickerBtn = driver.findElement(By.xpath("//[@id='date']"));
        datePickerBtn.click();
		
       //Wait for and click the desired date
        Thread.sleep(2000);
        // select first date
        WebElement daypicker1 = driver.findElement(By.xpath("//button[@data-day='8/13/2025']"));
        daypicker1.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}


