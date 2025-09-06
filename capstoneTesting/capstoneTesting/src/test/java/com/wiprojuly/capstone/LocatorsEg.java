package com.wiprojuly.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

    public static void main(String[] args) throws InterruptedException {
        
        // Setup Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);

        // 1. id locator - Login link
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        Thread.sleep(2000);

        // 2. id locator - Login modal username field
        WebElement loginUsername = driver.findElement(By.id("loginusername"));
        loginUsername.sendKeys("eshikaBose");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
         // 3. linkText locator - Cart link
        driver.get("https://www.demoblaze.com/");
        WebElement cartLink = driver.findElement(By.linkText("Cart"));
        cartLink.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        // 4. partialLinkText locator - Sign up link
        WebElement signupLink = driver.findElement(By.partialLinkText("Sign"));
        signupLink.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='signInModal']//button[@class='close']")).click(); // close modal
        Thread.sleep(2000);

        // 5. tagName locator - First <a> tag (PRODUCT STORE logo)
        WebElement logoLink = driver.findElement(By.tagName("a"));
        logoLink.click();
        Thread.sleep(2000);

        // 6. cssSelector locator - Phones category
        WebElement phoneCategory = driver.findElement(By.cssSelector("a.list-group-item:nth-child(2)"));
        phoneCategory.click();
        Thread.sleep(2000);

        // 7. xpath locator - Contact link
        WebElement contactLink = driver.findElement(By.xpath("//a[text()='Contact']"));
        contactLink.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='exampleModal']//button[@class='close']")).click(); // close modal
        Thread.sleep(2000);

        driver.quit();
    }
}
