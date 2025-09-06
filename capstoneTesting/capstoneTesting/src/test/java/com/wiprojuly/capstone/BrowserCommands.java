package com.wiprojuly.capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // open the Demoblaze site
        driver.get("https://www.demoblaze.com/");
        // maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // get the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Thread.sleep(2000);

        // get the source code of the HTML page
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());
        Thread.sleep(2000);

        // fetch the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        Thread.sleep(2000);

        // close the current browser window
        driver.close();

        // To close all the windows, you can use:
        // driver.quit();
    }
}
