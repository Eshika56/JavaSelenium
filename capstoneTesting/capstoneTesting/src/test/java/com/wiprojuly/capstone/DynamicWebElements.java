package com.wiprojuly.capstone;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class DynamicWebElements {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // open the Demoblaze site
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // 1) Dynamic Product Cards
        System.out.println("=== Product Cards on Home Page ===");
        List<WebElement> products = driver.findElements(By.cssSelector(".hrefch"));
        for (WebElement product : products) {
            System.out.println(product.getText());
        }
        Thread.sleep(2000);

        // 2) Pagination - Next Button loads new dynamic products
        System.out.println("\n=== Click Next for More Products ===");
        driver.findElement(By.id("next2")).click();
        Thread.sleep(2000);

        List<WebElement> nextPageProducts = driver.findElements(By.cssSelector(".hrefch"));
        for (WebElement product : nextPageProducts) {
            System.out.println(product.getText());
        }
        Thread.sleep(2000);

        // 3) Dynamic Login Modal
        System.out.println("\n=== Login Modal ===");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.id("loginusername"));
        WebElement password = driver.findElement(By.id("loginpassword"));
        username.sendKeys("eshikaBose");
        password.sendKeys("eshikaB@34");
        Thread.sleep(2000);
        System.out.println("Entered username & password dynamically");

        // close login modal using the close button (X)
        driver.findElement(By.xpath("//div[@id='logInModal']//button[@class='close']")).click();
        Thread.sleep(2000);

        // 4) Add Product to Cart + Dynamic Alert
        System.out.println("\n=== Add First Product to Cart ===");
        driver.findElement(By.cssSelector(".hrefch")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept();
        Thread.sleep(2000);

        // 5) Dynamic Cart Items
        System.out.println("\n=== Cart Items ===");
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);

        List<WebElement> cartItems = driver.findElements(By.xpath("//tr/td[2]"));
        for (WebElement item : cartItems) {
            System.out.println("Cart item: " + item.getText());
        }

        // close the browser
        driver.quit();
    }
}
