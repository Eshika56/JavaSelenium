package com.wiprojuly.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsEg {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.demoblaze.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		// Click on Login link to open login modal
		Thread.sleep(2000);
		WebElement loginLink = driver.findElement(By.id("login2"));
		loginLink.click();
		// Enter username with SHIFT key pressed (to type in uppercase)
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("loginusername"));
		act.moveToElement(username).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
		// Press TAB to move to password field, then enter password
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("loginpassword"));
		act.moveToElement(password).click().keyDown(Keys.SHIFT).sendKeys("hi").keyUp(Keys.SHIFT).build().perform();
		// Press ENTER key to submit login form
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
