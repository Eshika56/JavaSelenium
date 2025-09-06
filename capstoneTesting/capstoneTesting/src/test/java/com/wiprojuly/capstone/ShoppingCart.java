package com.wiprojuly.capstone;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCart {

    
	public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/");

        // Click on Laptops category
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);

        // Select first laptop
        driver.findElement(By.linkText("Sony vaio i5")).click();
        Thread.sleep(2000);

        // Add to cart
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);

        // Handle alert
        driver.switchTo().alert().accept();

        // Go to cart
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);

        // Place order
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        Thread.sleep(2000);

        // Fill order form
        driver.findElement(By.id("name")).sendKeys("Eshika");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Kolkata");
        driver.findElement(By.id("card")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2025");

        // Purchase
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        Thread.sleep(2000);

        // Confirm
        WebElement confirmation = driver.findElement(By.xpath("//div[@class='sweet-alert  showSweetAlert visible']"));
        System.out.println("Order confirmation: " + confirmation.getText());

        driver.findElement(By.xpath("//button[text()='OK']")).click();
        driver.quit();
    }
}
