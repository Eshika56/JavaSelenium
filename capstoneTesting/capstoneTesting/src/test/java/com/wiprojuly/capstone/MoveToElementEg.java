package com.wiprojuly.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementEg {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
        	FirefoxOptions firefoxOptions = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
            WebDriver driver1 = new FirefoxDriver(firefoxOptions);
            driver1.get("https://www.demoblaze.com/");

            driver1.manage().window().maximize();
            Thread.sleep(2000);

            // Create Actions instance
           Actions act = new Actions(driver1);

            // Hover over "Laptops" category
            WebElement laptopsCategory = driver1.findElement(By.xpath("//a[text()='Laptops']"));
            act.moveToElement(laptopsCategory).perform();
            Thread.sleep(2000);

            // Click "Laptops" after hover
            act.click(laptopsCategory).perform();
            Thread.sleep(2000);

            // Hover over first laptop product
            WebElement firstLaptop = driver1.findElement(By.xpath("//a[text()='Sony vaio i5']"));
            act.moveToElement(firstLaptop).perform();
            Thread.sleep(2000);

            // Click the first laptop
            act.click(firstLaptop).perform();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
