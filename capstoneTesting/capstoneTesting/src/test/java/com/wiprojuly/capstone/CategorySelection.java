package com.wiprojuly.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CategorySelection {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Click on Phones category
        WebElement phones = driver.findElement(By.xpath("//a[text()='Phones']"));
        phones.click();
        System.out.println("Clicked on Phones");
        Thread.sleep(2000);

        // Click on Laptops category
        WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops']"));
        laptops.click();
        System.out.println("Clicked on Laptops");
        Thread.sleep(2000);

        // Click on Monitors category
        WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors']"));
        monitors.click();
        System.out.println("Clicked on Monitors");
        Thread.sleep(2000);

        driver.quit();
    }
}
