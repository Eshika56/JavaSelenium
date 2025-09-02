
package com.wiprojuly.javasdet;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class Lab3_LoginAutomation {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test
    public void validLogin() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        // Assertion
        String successMsg = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(successMsg, "Logged In Successfully");
        Thread.sleep(2000);
    }

    @Test
    public void invalidLogin() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpass");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        // Assertion
        String errorMsg = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(errorMsg, "Your username is invalid!");
        Thread.sleep(2000);
    

   
        driver.quit();
    }}

