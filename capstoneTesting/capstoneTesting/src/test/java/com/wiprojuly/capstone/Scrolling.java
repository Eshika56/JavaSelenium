package com.wiprojuly.capstone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);

        // maximize the window
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        // Locate "About us" link in footer
        WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About us']"));

        // Scroll to element
        Actions act = new Actions(driver);
        act.scrollToElement(aboutUs).perform();
        Thread.sleep(2000);

        // Click on About us
        aboutUs.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
