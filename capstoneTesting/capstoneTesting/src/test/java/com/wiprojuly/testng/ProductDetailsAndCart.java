package com.wiprojuly.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ProductDetailsAndCart {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    @Test
    public void addMacBookAirToCart() throws InterruptedException {
        // Click on Laptops category
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);

        // Click on MacBook air
        driver.findElement(By.linkText("MacBook air")).click();

        
      
     // Add to cart
        WebElement addToCartButton = driver.findElement(By.linkText("Add to cart"));
        addToCartButton.click();


        // Go to cart
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);

        // Verify item is in cart
        int cartItems = driver.findElements(By.cssSelector("#tbodyid > tr")).size();
        Assert.assertTrue(cartItems > 0, "Cart should have at least one product");

        String totalPrice = driver.findElement(By.id("totalp")).getText();
        Assert.assertFalse(totalPrice.isEmpty(), "Total price should appear");

       
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
