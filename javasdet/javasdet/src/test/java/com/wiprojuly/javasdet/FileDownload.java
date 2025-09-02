package com.wiprojuly.javasdet;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {

        // Set Firefox preferences for auto download
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderList", 2); // 2 = custom location
        profile.setPreference("browser.download.dir", "/Users/apple/Downloads"); // Change path for Mac
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream,text/plain");

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);

        WebDriver driver = new FirefoxDriver(options);

        // Open file download page
        driver.get("https://the-internet.herokuapp.com/download");

        // Maximize window
        driver.manage().window().maximize();

        // Locate download link
        WebElement fileDownload = driver.findElement(By.xpath("//a[@href='download/some-file.txt']"));
        fileDownload.click();

        // Wait for file to download
        Thread.sleep(5000);

        // Check file existence
        File f = new File("C:\\Users\\Eshika Bose\\OneDrive\\Documents\\AB3.txt"); // Change path if needed
        if (f.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }

        // Close browser
        driver.quit();
    }
}