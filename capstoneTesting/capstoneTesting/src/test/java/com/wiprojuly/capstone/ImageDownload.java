package com.wiprojuly.capstone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageDownload {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // locate first product image
        WebElement imgElement = driver.findElement(By.cssSelector("img.card-img-top.img-fluid"));
        String imgUrl = imgElement.getAttribute("src");
        System.out.println("Image URL: " + imgUrl);

        // download image using Apache Commons IO
        File destination = new File("downloaded_product.jpg");
        FileUtils.copyURLToFile(new URL(imgUrl), destination);

        System.out.println("Image downloaded to: " + destination.getAbsolutePath());

        driver.quit();
    }
}
