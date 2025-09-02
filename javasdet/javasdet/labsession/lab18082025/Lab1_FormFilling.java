
package com.wiprojuly.javasdet;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Lab1_FormFilling {

    @Test
    public void fillForm() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        // Fill text fields
        driver.findElement(By.name("firstname")).sendKeys("Eshika");
        driver.findElement(By.name("lastname")).sendKeys("Bose");

        // Select gender radio button
        driver.findElement(By.id("sex-1")).click();

        // Select years of experience
        driver.findElement(By.id("exp-2")).click();

        // Enter date
        driver.findElement(By.id("datepicker")).sendKeys("18-08-2025");

        // Select profession check boxes
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        Thread.sleep(2000);
        
     // Select Automation Tool
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        Thread.sleep(2000);

        // Upload file
        driver.findElement(By.id("photo")).sendKeys("D://WhatsApp Image 2024-06-19 at 11.22.10_392ecf05.jpg");

        // Select continent dropdown
        Select continent = new Select(driver.findElement(By.id("continents")));
        continent.selectByVisibleText("Asia");

        // Select selenium commands multi-select
        Select commands = new Select(driver.findElement(By.id("selenium_commands")));
        commands.selectByVisibleText("Browser Commands");

        // Submit
        driver.findElement(By.id("submit")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
