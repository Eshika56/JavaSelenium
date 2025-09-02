package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDrop {

    // Reusable JS snippet to simulate HTML5 drag & drop
    private static final String HTML5_DND_HELPER =
            "var src=arguments[0], tgt=arguments[1];" +
            "var dataTransfer = {" +
            "  dropEffect: '', effectAllowed: 'all', files: [], items: {}, types: []," +
            "  setData: function(format, data) { this.items[format] = data; this.types.push(format); }," +
            "  getData: function(format) { return this.items[format]; }," +
            "  clearData: function(format) { if (format) { delete this.items[format]; var i=this.types.indexOf(format); if(i>-1){this.types.splice(i,1);} } else { this.items = {}; this.types = []; } }" +
            "};" +
            "var emit = function(event, target) {" +
            "  var evt = document.createEvent('Event');" +
            "  evt.initEvent(event, true, true);" +
            "  evt.dataTransfer = dataTransfer;" +
            "  target.dispatchEvent(evt);" +
            "};" +
            "emit('dragstart', src);" +
            "emit('dragenter', tgt);" +
            "emit('dragover', tgt);" +
            "emit('drop', tgt);" +
            "emit('dragend', src);";

    public static void main(String[] args) throws InterruptedException {
        // 1) Set up Firefox (Selenium 4 uses Selenium Manager; no manual driver path needed)
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        try {
            // 2) Open the page
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 3) Locate columns A and B
            WebElement colA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-a")));
            WebElement colB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-b")));

            // 4) Read initial headers (should be "A" and "B")
            String beforeA = colA.findElement(By.tagName("header")).getText().trim();
            String beforeB = colB.findElement(By.tagName("header")).getText().trim();
            System.out.println("Before: Column A = " + beforeA + " | Column B = " + beforeB);

            // 5) Perform HTML5 drag & drop via JS (A -> B)
            ((JavascriptExecutor) driver).executeScript(HTML5_DND_HELPER, colA, colB);

            // 6) Small wait for DOM to update, then verify swap
            wait.withTimeout(Duration.ofSeconds(10));
            String afterA = colA.findElement(By.tagName("header")).getText().trim();
            String afterB = colB.findElement(By.tagName("header")).getText().trim();
            System.out.println("After:  Column A = " + afterA + " | Column B = " + afterB);

            if ("B".equals(afterA) && "A".equals(afterB)) {
                System.out.println("✅ Drag & Drop successful: columns swapped.");
                Thread.sleep(2000);
            } else {
                System.out.println("❌ Drag & Drop did not swap as expected.");
                Thread.sleep(2000);
            }

        } finally {
            // 7) Close the browser
            driver.quit();
        }
    }
}

