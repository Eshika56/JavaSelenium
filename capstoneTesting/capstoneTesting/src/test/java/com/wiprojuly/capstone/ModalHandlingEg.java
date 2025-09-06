package com.wiprojuly.capstone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ModalHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 // Click on About Us link (opens modal)
        WebElement aboutUsLink = driver.findElement(By.xpath("//a[text()='About us']"));
        aboutUsLink.click();
        Thread.sleep(2000);
     // Wait until modal is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement modalTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("videoModalLabel"))
        );

        System.out.println("Modal title: " + modalTitle.getText());
		Thread.sleep(2000);
		// Close the modal
        WebElement closeBtn = driver.findElement(By.xpath("//div[@id='videoModal']//button[text()='Close']"));
        closeBtn.click();

        driver.quit();
    }
}
