package com.wiprojuly.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class CheckoutProcess {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

        // Add product to cart first (MacBook air)
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("MacBook air")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Add to cart")).click();

        // Handle alert after adding to cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // Go to cart page
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
    }

    @Test
    public void checkoutOrder() throws InterruptedException {
        // Click Place Order button
        driver.findElement(By.cssSelector("button[data-target='#orderModal']")).click();
        Thread.sleep(1000);

        // Fill in order form
        driver.findElement(By.id("name")).sendKeys("Eshika Bose");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Kolkata");
        driver.findElement(By.id("card")).sendKeys("1234567890");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2025");

        // Click Purchase button
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        Thread.sleep(2000);

        // Verify confirmation
        WebElement confirmation = driver.findElement(By.cssSelector(".sweet-alert.showSweetAlert.visible"));
        String confirmationText = confirmation.getText();
        Assert.assertTrue(confirmationText.contains("Thank you for your purchase!"),
                "Order confirmation message should appear");

        System.out.println("Checkout successful: " + confirmationText);

        // Close confirmation
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
