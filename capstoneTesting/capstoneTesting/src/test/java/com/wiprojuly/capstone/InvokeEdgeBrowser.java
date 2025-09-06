package com.wiprojuly.capstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdgeBrowser {

	public static void main(String[] args) {
		
		// Set path to EdgeDriver executable

        System.setProperty("webdriver.edge.driver", "C://Users//Eshika Bose//Downloads//edgedriver_win64//msedgedriver.exe");

        // Create EdgeDriver instance

        WebDriver driver = new EdgeDriver();

        // Open a webpage

        //driver.get("https://www.google.com");
        driver.get("https://www.demoblaze.com/");

	}

}